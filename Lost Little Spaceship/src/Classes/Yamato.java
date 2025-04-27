package Classes;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Yamato extends AnimatedObject {

	private double x;
	private double y;
	private int counter1;
	private int counter2;

	private Rectangle HitBox1;
	private Rectangle HitBox2;
	private Rectangle HitBox3;

	private boolean dead;
	private double HealthPoints;

	public Yamato(double X, double Y) {

		x = X;
		y = Y;
		counter1 = 0;
		counter2 = 0;

		dead = false;
		HealthPoints = 100000;

		HitBox1 = new Rectangle();
		HitBox2 = new Rectangle();
		HitBox3 = new Rectangle();

	}

	@Override
	boolean Draw(Mainclass h, Graphics2D g2t) {

		Graphics2D g2 = g2t;

		HitBox1.setBounds((int) x + (h.Yamato_1.getWidth() / 2 - 24), (int) y + 9, 51, 48);
		HitBox2.setBounds((int) x + (h.Yamato_1.getWidth() / 2 - 45), (int) y + 54, 90, 120);
		HitBox3.setBounds((int) x + 36, (int) y + 174, 156, 87);

		if (counter1 <= 15) {

			g2.drawImage(h.Yamato_3, (int) x, (int) y, h);
			g2.drawImage(h.Yamato_3, (int) x, (int) y, h);
		} else if (counter1 <= 30) {
			g2.drawImage(h.Yamato_2, (int) x, (int) y, h);
			g2.drawImage(h.Yamato_2, (int) x, (int) y, h);
		} else if (counter1 <= 45) {
			g2.drawImage(h.Yamato_2, (int) x, (int) y, h);
			g2.drawImage(h.Yamato_2, (int) x, (int) y, h);
		} else if (counter1 < 60) {
			g2.drawImage(h.Yamato_1, (int) x, (int) y, h);
			g2.drawImage(h.Yamato_1, (int) x, (int) y, h);
		} else if (counter1 >= 60) {
			counter1 = 0;
			g2.drawImage(h.Yamato_3, (int) x, (int) y, h);
			g2.drawImage(h.Yamato_3, (int) x, (int) y, h);
		}

		if (counter1 == 30) {

			h.Soundclass.playSound("spaceship_engine.wav", h.Volume + 10);

		}

		counter1++;

		if (counter2 < 5) {

			counter2++;

		} else if (counter2 >= 5) {

			h.allObjects.add(new AnimatedDrive(x + 60, (y + h.Yamato_1.getHeight() - 27)));
			h.allObjects.add(new AnimatedDrive(x + 77, (y + h.Yamato_1.getHeight() - 27)));
			h.allObjects.add(new AnimatedDrive(x + 125, (y + h.Yamato_1.getHeight() - 27)));
			h.allObjects.add(new AnimatedDrive(x + 143, (y + h.Yamato_1.getHeight() - 27)));

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

	}

	@Override
	void setright() {

	}

	@Override
	void unsetleft() {

	}

	@Override
	void unsetright() {

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
