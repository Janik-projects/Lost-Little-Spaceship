package Classes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class WeaponShotEnemy extends AnimatedObject {

	private double x;
	private double y;

	private int type;
	private int counter1;
	private int counter2;
	private int rockets;

	public int countHits;

	private long ID;

	private boolean dead;
	Random r;

	BufferedImage Weapon;

	Rectangle WeaponRect;
	
	private double height2;
	private double height2Place;

	public WeaponShotEnemy(double X, double Y, int Type, int rocketcounter, long IDthis) {
		x = X;
		y = Y;

		ID = IDthis;

		type = Type;

		dead = false;

		WeaponRect = new Rectangle();

		countHits = 0;

		switch (type) {

		case (1): {
			Weapon = new BufferedImage(3, 9, BufferedImage.TYPE_INT_ARGB);
			break;
		}

		case (2): {
			counter1 = 30;
			counter2 = 0;
			
			height2 = 1;
			height2Place=1;
			break;
		}

		case (3): {

			rockets = rocketcounter;
			r = new Random();
			counter1 = 60;
			counter2 = 0;
			break;
		}

		}

	}

	@Override
	boolean Draw(Mainclass h, Graphics2D g2t) {

		switch (type) {

		case (1): {
			WeaponRect.setBounds((int) x, (int) y, 3, 9);

			g2t.drawImage(Weapon, (int) x, (int) y, Color.GREEN, h);

			y += 7;

			if (y > h.height + 100) {
				dead = true;
			}

			for (int i = 0; i < h.allObjects.size(); i++) {

				if (h.allObjects.get(i) instanceof Spaceship1 || h.allObjects.get(i) instanceof Spaceship2
						|| h.allObjects.get(i) instanceof Spaceship3 || h.allObjects.get(i) instanceof Yamato) {

					if (WeaponRect.intersects(h.allObjects.get(i).getRect1())
							|| WeaponRect.intersects(h.allObjects.get(i).getRect2())
							|| WeaponRect.intersects(h.allObjects.get(i).getRect3())) {
						
						h.Soundclass.playSound("hit2.wav", h.Volume- 5);
						
						h.changePlayerHealth(-2);

						h.Explosions.add(new ExplosionSmall(x, y + 9));

						dead = true;
					}

				}

			}

			break;
		}

		case (2): {

			

			for (int i = 0; i < h.allObjects.size(); i++) {

				if (h.allObjects.get(i) instanceof Spaceship1 || h.allObjects.get(i) instanceof Spaceship2
						|| h.allObjects.get(i) instanceof Spaceship3 || h.allObjects.get(i) instanceof Yamato) {

					
					
					if (WeaponRect.intersects(h.allObjects.get(i).getRect1())
							|| WeaponRect.intersects(h.allObjects.get(i).getRect2())
							|| WeaponRect.intersects(h.allObjects.get(i).getRect3())) {
						
						
						h.changePlayerHealth(-1);
						
						if(counter2 < 10){
						
						
							counter2++;
						} else {
							h.Soundclass.playSound("hit2.wav", h.Volume- 5);
							counter2 = 0;
							
						}

						
						if(h.allObjects.get(i) instanceof Yamato){
						height2 = h.allObjects.get(i).getY() + 100;
						} else {
							
							
							height2 = h.height - 270 - y;
							
						}
						
						
						
						h.Explosions.add(new ExplosionSmall(x- h.Explosion_Small_1.getWidth()/2, height2 +y - 20));
				
				
					} else {
						
						height2 = height2Place;
						
					}

				}

			}
			
			
			WeaponRect.setBounds((int) x, (int) y, 2, (int) (height2));

			g2t.setColor(Color.MAGENTA);
			g2t.fillRect((int) x, (int) y, 2, (int) (height2));

			for (int i = 0; i < 100; i++) {
				g2t.setColor(Color.RED);
				Random r = new Random();
				g2t.fillRect((int) x + r.nextInt((int) (2)), (int) y + r.nextInt((int) (height2)), 1, 7);
			}
			
			if(height2Place < h.height + 100){
				
				height2 += 35;
				
				height2Place += 35;
			} else {

			counter1--;
			if (counter1 < 1) {
				dead = true;
			}
			}

			break;
		}

		case (3): {

			counter1--;

			WeaponRect.setBounds((int) x, (int) y, 9, 15);

			int b = r.nextInt(2);

			if (counter1 > 30) {
				g2t.drawImage(h.enemy_rocket1_1, (int) x, (int) y, h);
				x = x + b;
				for (int i = 0; i < h.allObjects.size(); i++) {
					if (h.allObjects.get(i) instanceof EnemySmoke) {

						if (h.allObjects.get(i).getID() == rockets) {

							h.allObjects.get(i).setX(b);

						}

					}

				}

			} else {
				g2t.drawImage(h.enemy_rocket1_2, (int) x, (int) y, h);
				x = x - b;
				for (int i = 0; i < h.allObjects.size(); i++) {
					if (h.allObjects.get(i) instanceof EnemySmoke) {
						if (h.allObjects.get(i).getID() == rockets) {

							h.allObjects.get(i).setX(-b);

						}
					}

				}

			}

			if (counter1 == 0) {
				counter1 = 60;

			}

			y += 8;

			if (counter2 < 3) {

				counter2++;

			} else if (counter2 >= 3) {

				h.allObjects.add(
						new EnemySmoke(x - h.smoke1.getWidth() / 2 + 12, y - h.enemyRocket_steam1.getHeight(), rockets));

				counter2 = 0;
			}

			if (y > h.height + 100) {
				dead = true;

			}

			for (int i = 0; i < h.allObjects.size(); i++) {

				if (h.allObjects.get(i) instanceof Spaceship1 || h.allObjects.get(i) instanceof Spaceship2
						|| h.allObjects.get(i) instanceof Spaceship3 || h.allObjects.get(i) instanceof Yamato) {

					if (WeaponRect.intersects(h.allObjects.get(i).getRect1())
							|| WeaponRect.intersects(h.allObjects.get(i).getRect2())
							|| WeaponRect.intersects(h.allObjects.get(i).getRect3())) {
						
						
						h.changePlayerHealth(-15);

						h.Soundclass.playSound("hit2.wav", h.Volume- 5);
						
						if(h.allObjects.get(i) instanceof Yamato){
							h.Soundclass.playSound("rocket_hit.wav", h.Volume + 3);
							
						} else {
							
							h.Soundclass.playSound("rocket_hit.wav", h.Volume);
							
						}
						
						h.Explosions.add(new ExplosionSmall(x, y + h.enemy_rocket1_1.getHeight()));
						
						h.Explosions.add(new ExplosionMedium(
								x - (h.Explosion_medium_1.getWidth() / 2 + h.ship3_rocket1.getWidth() / 2),
								y - h.Explosion_medium_1.getHeight() / 2));

						// h.Explosions.add(new ExplosionSmall(x,y));
						// hier kommt noch ne explosionsanimation
						dead = true;
					}
				}

			}

			break;
		}

		}

		if (dead == true)
			return false;
		else
			return true;

	}

	@Override
	double getX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	double getY() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	void setX(double X) {

		switch (type) {
		case (1): {
			x += X * 3;

			break;
		}

		case (2): {

			x = X;

			break;
		}

		case (3): {

			x += X * 3;

			break;
		}

		}

	}

	@Override
	void setY(double Y) {

		y = Y;

	}

	@Override
	void setleft() {
		// TODO Auto-generated method stub

	}

	@Override
	void setright() {
		// TODO Auto-generated method stub

	}

	@Override
	void unsetleft() {
		// TODO Auto-generated method stub

	}

	@Override
	void unsetright() {
		// TODO Auto-generated method stub

	}

	@Override
	int getID() {
		// TODO Auto-generated method stub
		return (int) ID;
	}

	@Override
	Rectangle getRect1() {
		// TODO Auto-generated method stub
		return WeaponRect;
	}

	@Override
	Rectangle getRect2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Rectangle getRect3() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	void setHealth(double HP) {
		// TODO Auto-generated method stub

	}

	@Override
	int getType() {
		// TODO Auto-generated method stub
		return type;
	}

}
