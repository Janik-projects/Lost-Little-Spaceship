package Classes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class WeaponShot extends AnimatedObject {

	private double x;
	private double y;

	private int type;
	private int counter1;
	private int counter2;
	private int rockets;

	public int countHits;

	private boolean dead;
	Random r;

	BufferedImage Weapon;

	Rectangle WeaponRect;

	public WeaponShot(double X, double Y, int Type, int rocketcounter) {
		x = X;
		y = Y;

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
			counter1 = 180;
			counter2=0;
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

			g2t.drawImage(Weapon, (int) x, (int) y, Color.RED, h);

			y -= 5;

			if (y < 0) {
				dead = true;
			}

			for (int i = 0; i < h.Enemies.size(); i++) {

				if (WeaponRect.intersects(h.Enemies.get(i).getRect1())) {
					h.Enemies.get(i).setHealth(-5);

					h.Soundclass.playSound("hit.wav", h.Volume - 5);
					
					if (countHits < 1) {
						if (h.Enemies.get(i) instanceof Enemy_Small_1) {

							h.score += 10;
							countHits++;

							// h.Explosions.add(new
							// ExplosionSmall(h.Enemies.get(i).getX()+h.Enemy_1_1.getWidth()/2,h.Enemies.get(i).getY()+h.Enemy_1_1.getHeight()/2));

						} else if (h.Enemies.get(i) instanceof Enemy_Medium_1) {

							h.score += 25;
							countHits++;

							// h.Explosions.add(new
							// ExplosionSmall(h.Enemies.get(i).getX()+h.Enemy_2_1.getWidth()/2,h.Enemies.get(i).getY()+h.Enemy_2_1.getHeight()/2));

						} else if (h.Enemies.get(i) instanceof Enemy_Heavy_1) {
							h.score += 55;
							countHits++;

						}

						h.Explosions.add(new ExplosionSmall(x - h.Explosion_Small_1.getWidth()/2, y - 20));

						dead = true;
					}
				}

			}

			break;
		}

		case (2): {

			WeaponRect.setBounds((int) x, (int) y, 5, (int) (h.height - 332));
			
			if(counter2 == 0){
				h.Soundclass.playSound("laserburn.wav", h.Volume-12);
			}
			
			if(counter2>60){
			h.Soundclass.playSound("laserburn.wav", h.Volume-12);
			counter2 = 1;
			} else {
				
				counter2++;
				
			}

			g2t.setColor(Color.GREEN);
			g2t.fillRect((int) x, (int) y, 5, (int) (h.height - 332));

			for (int i = 0; i < 900; i++) {
				g2t.setColor(new Color(69, 118, 41));
				Random r = new Random();
				g2t.fillRect((int) x + r.nextInt((int) (5)), r.nextInt((int) (h.height - 332)), 1, 7);
			}

			counter1--;
			if (counter1 < 1) {
				dead = true;
			}

			for (int i = 0; i < h.Enemies.size(); i++) {

				if (WeaponRect.intersects(h.Enemies.get(i).getRect1())) {
					h.Enemies.get(i).setHealth(-0.75);

					if (h.Enemies.get(i) instanceof Enemy_Small_1) {

						h.score += 3;

						h.Explosions.add(new ExplosionSmall(
								h.Enemies.get(i).getX() + h.Enemy_1_1.getWidth() / 2
										- h.Explosion_Small_1.getWidth() / 2,
								h.Enemies.get(i).getY() + h.Enemy_1_1.getHeight() / 2
										- h.Explosion_Small_1.getHeight()));

					} else if (h.Enemies.get(i) instanceof Enemy_Medium_1) {

						h.score += 5;

						/*h.Explosions.add(new ExplosionSmall(h.Enemies.get(i).getX() + h.Enemy_2_1.getWidth() / 2,
								h.Enemies.get(i).getY() + h.Enemy_2_1.getHeight() / 2)); */
						
						h.Explosions.add(new ExplosionSmall(x + 5 - h.Explosion_Small_1.getWidth()/2,
								h.Enemies.get(i).getY() + h.Enemy_2_1.getHeight() / 2));
					}

					else if (h.Enemies.get(i) instanceof Enemy_Heavy_1) {

						h.score += 9;

						h.Explosions.add(new ExplosionSmall(x + 5 - h.Explosion_Small_1.getWidth()/2,
								h.Enemies.get(i).getY() + h.Enemy_3_1.getHeight() / 2));
					}

				}

			}

			break;
		}

		case (3): {

			counter1--;

			WeaponRect.setBounds((int) x, (int) y, 9, 15);

			int b = r.nextInt(2);

			if (counter1 > 30) {
				g2t.drawImage(h.ship3_rocket1, (int) x, (int) y, h);
				x = x + b;
				for (int i = 0; i < h.allObjects.size(); i++) {
					if (h.allObjects.get(i) instanceof AnimatedSmoke) {

						if (h.allObjects.get(i).getID() == rockets) {

							h.allObjects.get(i).setX(b);

						}

					}

				}

			} else {
				g2t.drawImage(h.ship3_rocket2, (int) x, (int) y, h);
				x = x - b;
				for (int i = 0; i < h.allObjects.size(); i++) {
					if (h.allObjects.get(i) instanceof AnimatedSmoke) {
						if (h.allObjects.get(i).getID() == rockets) {

							h.allObjects.get(i).setX(-b);

						}
					}

				}

			}

			if (counter1 == 0) {
				counter1 = 60;

			}

			y -= 8;

			if (counter2 < 3) {

				counter2++;

			} else if (counter2 >= 3) {

				h.allObjects.add(new AnimatedSmoke(x - h.smoke1.getWidth() / 2 + 12, (y + h.ship3_rocket1.getHeight()),
						rockets));

				counter2 = 0;
			}

			if (y < -100) {
				dead = true;

			}

			for (int i = 0; i < h.Enemies.size(); i++) {

				if (WeaponRect.intersects(h.Enemies.get(i).getRect1())) {
					

					h.Soundclass.playSound("rocket_hit.wav", h.Volume);
					
					h.Enemies.get(i).setHealth(-9);
					if (h.Enemies.get(i) instanceof Enemy_Small_1) {

						h.score += 10;


						h.Explosions.add(new ExplosionSmall(x, y));

						h.Explosions.add(new ExplosionMedium(
								x - (h.Explosion_medium_1.getWidth() / 2 - h.ship3_rocket1.getWidth() / 2),
								y - h.Explosion_medium_1.getHeight() / 2));

					} else if (h.Enemies.get(i) instanceof Enemy_Medium_1) {

						h.score += 50;
				

						h.Explosions.add(new ExplosionSmall(x, y));

						h.Explosions.add(new ExplosionMedium(
								x - (h.Explosion_medium_1.getWidth() / 2 - h.ship3_rocket1.getWidth() / 2),
								y - h.Explosion_medium_1.getHeight() / 2));
					}

					else if (h.Enemies.get(i) instanceof Enemy_Heavy_1) {

						h.score += 90;

						h.Explosions.add(new ExplosionSmall(x, y));

						h.Explosions.add(new ExplosionMedium(
								x - (h.Explosion_medium_1.getWidth() / 2 - h.ship3_rocket1.getWidth() / 2),
								y - h.Explosion_medium_1.getHeight() / 2));
					}

					// h.Explosions.add(new ExplosionSmall(x,y));
					// hier kommt noch ne explosionsanimation
					dead = true;
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
		// TODO Auto-generated method stub

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
		return 0;
	}

	@Override
	Rectangle getRect1() {
		// TODO Auto-generated method stub
		return null;
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
		return 0;
	}

}
