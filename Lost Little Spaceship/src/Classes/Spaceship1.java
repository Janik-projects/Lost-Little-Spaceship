package Classes;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Spaceship1 extends AnimatedObject {

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

	public Spaceship1(double X, double Y) {

		x = X;
		y = Y;
		counter1 = 0;
		counter2 = 0;

		dead = false;
		HealthPoints = 100;
		
		HitBox1 = new Rectangle();
		HitBox2 = new Rectangle();
		HitBox3 = new Rectangle();

	}

	@Override
	boolean Draw(Mainclass h, Graphics2D g2t) {

		Graphics2D g2 = g2t;

		HitBox1.setBounds((int) x - (h.spaceship1.getWidth() / 2) + 33, (int) y + (h.spaceship1.getHeight() / 2) + 9, 39, 21);
		HitBox2.setBounds((int) x - (h.spaceship1.getWidth() / 2) + 21, (int) y + (h.spaceship1.getHeight() / 2) + 30, 60, 30);
		HitBox3.setBounds((int) x - (h.spaceship1.getWidth() / 2) + 15, (int) y + (h.spaceship1.getHeight() / 2) + 63, 72, 66);

		if (left) {
			if (counter1 <= 15) {

				g2.drawImage(h.spaceship1_left_1, (int) x - h.spaceship1.getWidth() / 2,
						(int) y + h.spaceship1.getHeight() / 2, h);
			} else if (counter1 <= 30) {
				g2.drawImage(h.spaceship1_left_2, (int) x - h.spaceship1_1.getWidth() / 2,
						(int) y + h.spaceship1.getHeight() / 2, h);
			} else if (counter1 <= 45) {
				g2.drawImage(h.spaceship1_left_3, (int) x - h.spaceship1_2.getWidth() / 2,
						(int) y + h.spaceship1.getHeight() / 2, h);
			} else if (counter1 < 60) {
				
				g2.drawImage(h.spaceship1_left_4, (int) x - h.spaceship1_3.getWidth() / 2,
						(int) y + h.spaceship1.getHeight() / 2, h);
			} else if (counter1 >= 60) {
				
				counter1 = 0;
				g2.drawImage(h.spaceship1_left_1, (int) x - h.spaceship1.getWidth() / 2,
						(int) y + h.spaceship1.getHeight() / 2, h);
			}

			counter1++;
			for (int i = 0; i < h.allObjects.size(); i++) {
				if (h.allObjects.get(i) instanceof AnimatedDrive) {
					h.allObjects.get(i).setX(h.sideMod);
				}

			}

			//System.out.println("left");
		}

		else if (right) {

			if (counter1 <= 15) {

				g2.drawImage(h.spaceship1_right_1, (int) x - h.spaceship1.getWidth() / 2,
						(int) y + h.spaceship1.getHeight() / 2, h);
			} else if (counter1 <= 30) {
				g2.drawImage(h.spaceship1_right_2, (int) x - h.spaceship1_1.getWidth() / 2,
						(int) y + h.spaceship1.getHeight() / 2, h);
			} else if (counter1 <= 45) {
				g2.drawImage(h.spaceship1_right_3, (int) x - h.spaceship1_2.getWidth() / 2,
						(int) y + h.spaceship1.getHeight() / 2, h);
			} else if (counter1 < 60) {
				g2.drawImage(h.spaceship1_right_4, (int) x - h.spaceship1_3.getWidth() / 2,
						(int) y + h.spaceship1.getHeight() / 2, h);
			} else if (counter1 >= 60) {
				counter1 = 0;
				g2.drawImage(h.spaceship1_right_1, (int) x - h.spaceship1.getWidth() / 2,
						(int) y + h.spaceship1.getHeight() / 2, h);
			}

			counter1++;

			for (int i = 0; i < h.allObjects.size(); i++) {
				if (h.allObjects.get(i) instanceof AnimatedDrive) {
					h.allObjects.get(i).setX(-h.sideMod);
				}

			}
			//System.out.println("right");
		} else {

			if (counter1 <= 15) {

				g2.drawImage(h.spaceship1, (int) x - h.spaceship1.getWidth() / 2,
						(int) y + h.spaceship1.getHeight() / 2, h);
			} else if (counter1 <= 30) {
				g2.drawImage(h.spaceship1_1, (int) x - h.spaceship1_1.getWidth() / 2,
						(int) y + h.spaceship1.getHeight() / 2, h);
			} else if (counter1 <= 45) {
				g2.drawImage(h.spaceship1_2, (int) x - h.spaceship1_2.getWidth() / 2,
						(int) y + h.spaceship1.getHeight() / 2, h);
			} else if (counter1 < 60) {
				g2.drawImage(h.spaceship1_3, (int) x - h.spaceship1_3.getWidth() / 2,
						(int) y + h.spaceship1.getHeight() / 2, h);
			} else if (counter1 >= 60) {
				counter1 = 0;
				g2.drawImage(h.spaceship1, (int) x - h.spaceship1.getWidth() / 2,
						(int) y + h.spaceship1.getHeight() / 2, h);
			}

			counter1++;

		}
		
		
		if(counter1 == 30){
			
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
