package Classes;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Spaceship3 extends AnimatedObject {

	private double x;
	private double y;
	private int counter1;
	private int counter2;

	private Rectangle HitBox1;
	private Rectangle HitBox2;
	private Rectangle HitBox3;

	public boolean left = false;
	public boolean right = false;

	private boolean dead;
	private double HealthPoints;

	public Spaceship3(double X, double Y) {

		x = X;
		y = Y;
		counter1 = 0;
		counter2 = 0;

		dead = false;
		HealthPoints = 250;

		HitBox1 = new Rectangle();
		HitBox2 = new Rectangle();
		HitBox3 = new Rectangle();
	}

	@Override
	boolean Draw(Mainclass h, Graphics2D g2t) {

		HitBox1.setBounds((int) x - (h.spaceship3.getWidth() / 2) + 21, (int) y + (h.spaceship3.getHeight() / 2) + 6,
				60, 39);
		HitBox2.setBounds((int) x - (h.spaceship3.getWidth() / 2) + 9, (int) y + (h.spaceship3.getHeight() / 2) + 45,
				84, 51);
		HitBox3.setBounds((int) x - (h.spaceship3.getWidth() / 2) + 6, (int) y + (h.spaceship3.getHeight() / 2) + 96,
				90, 36);

		if (left) {

			if (counter1 <= 15) {

				g2t.drawImage(h.spaceship3_left_1, (int) x - h.spaceship3.getWidth() / 2,
						(int) y + h.spaceship3.getHeight() / 2, h);
			} else if (counter1 <= 30) {
				g2t.drawImage(h.spaceship3_left_2, (int) x - h.spaceship3_1.getWidth() / 2,
						(int) y + h.spaceship3_1.getHeight() / 2, h);
			} else if (counter1 <= 45) {
				g2t.drawImage(h.spaceship3_left_3, (int) x - h.spaceship3_2.getWidth() / 2,
						(int) y + h.spaceship3_2.getHeight() / 2, h);
			} else if (counter1 < 60) {
				g2t.drawImage(h.spaceship3_left_4, (int) x - h.spaceship3_3.getWidth() / 2,
						(int) y + h.spaceship3_3.getHeight() / 2, h);
			} else if (counter1 >= 60) {
				counter1 = 0;
				g2t.drawImage(h.spaceship3_left_1, (int) x - h.spaceship3.getWidth() / 2,
						(int) y + h.spaceship3.getHeight() / 2, h);
			}

			counter1++;

			for (int i = 0; i < h.allObjects.size(); i++) {
				if (h.allObjects.get(i) instanceof AnimatedDrive) {
					h.allObjects.get(i).setX(h.sideMod);
				}

			}

			// System.out.println("left");

		} else if (right) {

			if (counter1 <= 15) {

				g2t.drawImage(h.spaceship3_right_1, (int) x - h.spaceship3.getWidth() / 2,
						(int) y + h.spaceship3.getHeight() / 2, h);
			} else if (counter1 <= 30) {
				g2t.drawImage(h.spaceship3_right_2, (int) x - h.spaceship3_1.getWidth() / 2,
						(int) y + h.spaceship3_1.getHeight() / 2, h);
			} else if (counter1 <= 45) {
				g2t.drawImage(h.spaceship3_right_3, (int) x - h.spaceship3_2.getWidth() / 2,
						(int) y + h.spaceship3_2.getHeight() / 2, h);
			} else if (counter1 < 60) {
				g2t.drawImage(h.spaceship3_right_4, (int) x - h.spaceship3_3.getWidth() / 2,
						(int) y + h.spaceship3_3.getHeight() / 2, h);
			} else if (counter1 >= 60) {
				counter1 = 0;
				g2t.drawImage(h.spaceship3_right_1, (int) x - h.spaceship3.getWidth() / 2,
						(int) y + h.spaceship3.getHeight() / 2, h);
			}

			counter1++;

			for (int i = 0; i < h.allObjects.size(); i++) {
				if (h.allObjects.get(i) instanceof AnimatedDrive) {
					h.allObjects.get(i).setX(-h.sideMod);
				}

			}

			// System.out.println("right");

		} else {

			if (counter1 <= 15) {

				g2t.drawImage(h.spaceship3, (int) x - h.spaceship3.getWidth() / 2,
						(int) y + h.spaceship3.getHeight() / 2, h);
			} else if (counter1 <= 30) {
				g2t.drawImage(h.spaceship3_1, (int) x - h.spaceship3_1.getWidth() / 2,
						(int) y + h.spaceship3_1.getHeight() / 2, h);
			} else if (counter1 <= 45) {
				g2t.drawImage(h.spaceship3_2, (int) x - h.spaceship3_2.getWidth() / 2,
						(int) y + h.spaceship3_2.getHeight() / 2, h);
			} else if (counter1 < 60) {
				g2t.drawImage(h.spaceship3_3, (int) x - h.spaceship3_3.getWidth() / 2,
						(int) y + h.spaceship3_3.getHeight() / 2, h);
			} else if (counter1 >= 60) {
				counter1 = 0;
				g2t.drawImage(h.spaceship3, (int) x - h.spaceship3.getWidth() / 2,
						(int) y + h.spaceship3.getHeight() / 2, h);
			}

			counter1++;

		}

		if (counter1 == 30) {

			h.Soundclass.playSound("spaceship_engine.wav", h.Volume + 10);

		}

		if (counter2 < 5) {

			counter2++;

		} else if (counter2 >= 5) {

			h.allObjects.add(new AnimatedDrive(x - h.aa1.getWidth() / 2, (y + h.spaceship1.getHeight()) + 60));

			counter2 = 0;
		}

		if (HealthPoints < 0)
			dead = true;

		if (dead)
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
		x = X;

	}

	@Override
	void setY(double Y) {
		y = Y;

	}

	@Override
	void setleft() {
		left = true;

	}

	@Override
	void setright() {
		right = true;

	}

	@Override
	void unsetleft() {
		left = false;

	}

	@Override
	void unsetright() {
		right = false;

	}

	@Override
	int getID() {
		// TODO Auto-generated method stub
		return 0;
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
	void setHealth(double HP) {
		HealthPoints = HealthPoints + HP;

	}

	@Override
	int getType() {
		// TODO Auto-generated method stub
		return 0;
	}

}
