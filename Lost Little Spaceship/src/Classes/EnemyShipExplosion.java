package Classes;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class EnemyShipExplosion extends AnimatedObject {

	private double x;
	private double y;
	private int counter;

	private int type;

	private int hbcounter;

	private Rectangle HitBox1;

	public EnemyShipExplosion(double X, double Y, int Type) {
		x = X;
		y = Y;
		counter = 0;
		hbcounter = 3;
		HitBox1 = new Rectangle();

		type = Type;
	}

	@Override
	boolean Draw(Mainclass h, Graphics2D g2t) {

		switch (type) {

		case (1): {

			if (counter <= 5) {

				g2t.drawImage(h.Enemy_1_exp1, (int) x, (int) y, h);
			} else if (counter <= 10) {
				g2t.drawImage(h.Enemy_1_exp2, (int) x, (int) y, h);

			} else if (counter <= 15) {
				g2t.drawImage(h.Enemy_1_exp3, (int) x, (int) y, h);

			} else if (counter <= 20) {
				g2t.drawImage(h.Enemy_1_exp4, (int) x, (int) y, h);
			} else if (counter <= 25) {
				g2t.drawImage(h.Enemy_1_exp5, (int) x, (int) y, h);
			} else if (counter <= 30) {
				g2t.drawImage(h.Enemy_1_exp6, (int) x, (int) y, h);
			} else if (counter <= 35) {
				g2t.drawImage(h.Enemy_1_exp7, (int) x, (int) y, h);
			} else if (counter <= 40) {
				g2t.drawImage(h.Enemy_1_exp8, (int) x, (int) y, h);
			}

			break;
		}

		case (2): {

			if (counter <= 5) {

				g2t.drawImage(h.Enemy_2_exp1, (int) x, (int) y, h);
			} else if (counter <= 10) {
				g2t.drawImage(h.Enemy_2_exp2, (int) x, (int) y, h);

			} else if (counter <= 15) {
				g2t.drawImage(h.Enemy_2_exp3, (int) x, (int) y, h);

			} else if (counter <= 20) {
				g2t.drawImage(h.Enemy_2_exp4, (int) x, (int) y, h);
			} else if (counter <= 25) {
				g2t.drawImage(h.Enemy_2_exp5, (int) x, (int) y, h);
			} else if (counter <= 30) {
				g2t.drawImage(h.Enemy_2_exp6, (int) x, (int) y, h);
			} else if (counter <= 35) {
				g2t.drawImage(h.Enemy_2_exp7, (int) x, (int) y, h);
			} else if (counter <= 40) {
				g2t.drawImage(h.Enemy_2_exp8, (int) x, (int) y, h);
			}


			break;
		}

		case (3): {

			if (counter <= 5) {

				g2t.drawImage(h.Enemy_3_exp1, (int) x, (int) y, h);
			} else if (counter <= 10) {
				g2t.drawImage(h.Enemy_3_exp2, (int) x, (int) y, h);

			} else if (counter <= 15) {
				g2t.drawImage(h.Enemy_3_exp3, (int) x, (int) y, h);

			} else if (counter <= 20) {
				g2t.drawImage(h.Enemy_3_exp4, (int) x, (int) y, h);
			} else if (counter <= 25) {
				g2t.drawImage(h.Enemy_3_exp5, (int) x, (int) y, h);
			} else if (counter <= 30) {
				g2t.drawImage(h.Enemy_3_exp6, (int) x, (int) y, h);
			} else if (counter <= 35) {
				g2t.drawImage(h.Enemy_3_exp7, (int) x, (int) y, h);
			} else if (counter <= 40) {
				g2t.drawImage(h.Enemy_3_exp8, (int) x, (int) y, h);
			}


			break;
		}

		}

		y -= 1;

		if (counter > 40) {
			return false;
		} else {

			counter++;
			return true;
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
	void setX(double X) {
		// TODO Auto-generated method stub
		x += X * 2;
	}

	@Override
	void setY(double Y) {
		// TODO Auto-generated method stub
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
	Rectangle getRect1() {
		// TODO Auto-generated method stub
		return HitBox1;
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
