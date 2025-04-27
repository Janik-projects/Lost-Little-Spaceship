package Classes;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class ExplosionMedium extends AnimatedObject {

	private double x;
	private double y;
	private int counter;

	private int hbcounter;

	private Rectangle HitBox1;

	public ExplosionMedium(double X, double Y) {
		x = X;
		y = Y;
		counter = 0;
		hbcounter = 3;
		HitBox1 = new Rectangle();
	}

	@Override
	boolean Draw(Mainclass h, Graphics2D g2t) {

		if (hbcounter > 0) {
			HitBox1.setBounds((int) x, (int) y, h.Explosion_medium_1.getWidth(), h.Explosion_medium_1.getHeight());

			for (int i = 0; i < h.Enemies.size(); i++) {

				if (HitBox1.intersects(h.Enemies.get(i).getRect1())) {

					h.Enemies.get(i).setHealth(-2);

					h.score += 5;

					hbcounter--;
				}

			}

			
		} else {

			HitBox1.setBounds((int) 900, (int) 1000, h.Explosion_medium_1.getWidth(), h.Explosion_medium_1.getHeight());

		}

		if (counter <= 3) {
			
			g2t.drawImage(h.Explosion_medium_0, (int) x, (int) y, h);
		} else if (counter <= 6) {
			g2t.drawImage(h.Explosion_medium_0, (int) x, (int) y, h);
			
		} else if(counter <= 9){
			g2t.drawImage(h.Explosion_medium_1, (int) x, (int) y, h);
		

		} else if (counter <= 12) {
			g2t.drawImage(h.Explosion_medium_2, (int) x, (int) y, h);
		} else if (counter <= 15) {
			g2t.drawImage(h.Explosion_medium_3, (int) x, (int) y, h);
		} else if (counter <= 18) {
			g2t.drawImage(h.Explosion_medium_4, (int) x, (int) y, h);
		} else if (counter <= 21) {
			g2t.drawImage(h.Explosion_medium_5, (int) x, (int) y, h);
		} else if (counter <= 24) {
			g2t.drawImage(h.Explosion_medium_6, (int) x, (int) y, h);
		} else if (counter <= 27) {
			g2t.drawImage(h.Explosion_medium_7, (int) x, (int) y, h);
		} else if (counter <= 30) {
			g2t.drawImage(h.Explosion_medium_8, (int) x, (int) y, h);
		} else if (counter <= 33) {
			g2t.drawImage(h.Explosion_medium_9, (int) x, (int) y, h);
		} else if (counter <= 36) {
			g2t.drawImage(h.Explosion_medium_10, (int) x, (int) y, h);
		}

		y += 5;

		if (counter > 36) {
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
