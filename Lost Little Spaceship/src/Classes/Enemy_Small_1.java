package Classes;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

public class Enemy_Small_1 extends AnimatedObject {

	private double x;
	private double y;
	private int counter1;
	private int counter2;

	private Rectangle HitBox1;
	private Rectangle HitBox2;
	private Rectangle HitBox3;

	private boolean left;
	private boolean right;

	private double rightMod;
	private double leftMod;

	private boolean dead;
	private double HealthPoints;

	private Random r1;

	private int kamInt;

	private int kamIntMod;

	private boolean doAIC;
	
	private boolean PSound;

	public Enemy_Small_1(double X, double Y) {
		x = X;
		y = Y;
		dead = false;
		HealthPoints = 2;

		kamIntMod = 30;

		counter1 = 0;

		HitBox1 = new Rectangle();
		HitBox2 = new Rectangle();
		HitBox3 = new Rectangle();

		r1 = new Random();

		kamInt = r1.nextInt(kamIntMod);

		rightMod = 0.5;
		leftMod = -0.5;

		doAIC = true;
		
		PSound = false;
	}

	@Override
	boolean Draw(Mainclass h, Graphics2D g2t) {
		// TODO Auto-generated method stub

		
		if(y < h.height && x + h.Enemy_3_1.getWidth() > 0 && x <h.width){
			PSound = true;
		} else {
			PSound = false;
		}
		
		
		HitBox1.setBounds((int) x + 9, (int) y, h.Enemy_1_1.getWidth() - 18, h.Enemy_1_1.getHeight() - 6);

		if (counter1 < 20) {

			g2t.drawImage(h.Enemy_1_1, (int) x, (int) y, h);
			counter1++;

		} else if (counter1 < 40) {
			g2t.drawImage(h.Enemy_1_2, (int) x, (int) y, h);
			counter1++;

		} else if (counter1 < 60) {
			g2t.drawImage(h.Enemy_1_3, (int) x, (int) y, h);
			counter1++;
		} else {

			g2t.drawImage(h.Enemy_1_1, (int) x, (int) y, h);
			counter1 = 0;

		}

		WeaponControl(h, 2500, 0, 0);

		AIControl(h);

		if (HealthPoints < 0) {
			dead = true;
		}

		if (y > 1000) {
			dead = true;
		}

		for (int i = 0; i < h.allObjects.size(); i++) {

			if (h.allObjects.get(i) instanceof Spaceship1 || h.allObjects.get(i) instanceof Spaceship2
					|| h.allObjects.get(i) instanceof Spaceship3) {
				if (HitBox1.intersects(h.allObjects.get(i).getRect1())
						|| HitBox1.intersects(h.allObjects.get(i).getRect2())
						|| HitBox1.intersects(h.allObjects.get(i).getRect3())) {
					h.Soundclass.playSound("hit2.wav", h.Volume- 5);
					
					h.changePlayerHealth(-2);

					h.Explosions
							.add(new ExplosionSmall(x + h.Enemy_1_1.getWidth() / 2 - h.Explosion_Small_1.getWidth() / 2,
									y + h.Enemy_1_1.getHeight() / 2));

					dead = true;
				}
			}

		}

		if (dead) {
			
			
		if(PSound && h.chooseship != 3)	
			h.Soundclass.playSound("explosion.wav", h.Volume - 7);
			
			
			
			h.Explosions.add(new EnemyShipExplosion(x, y, 1));
			return false;
		} else
			return true;
	}

	private void WeaponControl(Mainclass h, int chance1, int chance2, int chance3) {
		if (r1.nextInt(chance1) < 10) {

			if(PSound)
			h.Soundclass.playSound("shootufo.wav", h.Volume + 3);
			
			h.EnemyWeapons.add(new WeaponShotEnemy(x + 9, y + 42, 1, 0, 0));
			h.EnemyWeapons.add(new WeaponShotEnemy(x + 27, y + 42, 1, 0, 0));

		}
	}

	private void AIControl(Mainclass h) {

		for (int i = 0; i < h.allObjects.size(); i++) {

			if (h.allObjects.get(i) instanceof Spaceship1 || h.allObjects.get(i) instanceof Spaceship2
					|| h.allObjects.get(i) instanceof Spaceship3) {
				double xP = h.allObjects.get(i).getX();
				double yP = h.allObjects.get(i).getY();

				// x coordinate control of the enemy

				if (doAIC) {
					
					
					// AIC control

					if (y > 600) {
						doAIC = false;
					}
					
					
					if (xP - (x + r1.nextInt(150)) > 0) {

						right = true;
						left = false;

					} else if (xP - (x + r1.nextInt(150)) < 0) {

						left = true;
						right = false;

					} else {

						right = false;
						left = false;

					}

					if (right) {
						x += rightMod;
					} else if (left) {
						x += leftMod;
					} else {

					}

					if (h.left) {

						rightMod = 1;

					} else if (h.right) {

						leftMod = -1;

					} else {

						rightMod = 1 + r1.nextInt(1);
						leftMod = -(1 + r1.nextInt(1));
					}
				}

				// y coordinate control of the enemy

				if (kamInt < 5 && yP - y < 200 && xP - x < 80) {

					y += 10;

					doAIC = true;

				} else if (yP - y < 100 && kamInt > 5 && kamInt <= 10) {

					y += 10;

					doAIC = true;

				}

				else {

					y += 2.5;
				}

			}

		}

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
	Rectangle getRect1() {
		// TODO Auto-generated method stub
		return HitBox1;
	}

	@Override
	Rectangle getRect2() {
		// TODO Auto-generated method stub
		return HitBox2;
	}

	@Override
	Rectangle getRect3() {
		// TODO Auto-generated method stub
		return HitBox3;
	}

	@Override
	void setX(double X) {
		x = x + X * 2;

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
		return 0;
	}

	@Override
	void setHealth(double HP) {
		HealthPoints = HealthPoints + HP;

	}

	@Override
	int getType() {
		// TODO Auto-generated method stub
		return 0;
	}
}
