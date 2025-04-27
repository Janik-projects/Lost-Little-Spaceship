package Classes;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

public class BackgroundForeground extends Backgrounds {

	private double x;
	private double y;
	private Rectangle rect;
	private Random r1;

	public BackgroundForeground(double X, double Y) {
		x = X;
		y = Y;
		r1 = new Random();
		rect = new Rectangle();
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
		x += (X * 3);

	}

	@Override
	void setY(double Y) {
		y = Y;

	}

	@Override
	boolean Draw(Mainclass h, Graphics2D g2t) {
		Graphics2D g2 = g2t;

		y += 5;

		rect.setBounds((int) x, (int) y, 3, 3);

		g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f));
		g2.setColor(Color.WHITE);
		g2.fillRect((int) x, (int) y, 3, 3);
		g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));

		Rectangle rect1 = new Rectangle();
		rect1.setBounds(0, 0, h.width, h.height);

		if (y > h.height) {

			return false;
		} else {

			return true;
		}
	}

	@Override
	Rectangle getRect() {
		// TODO Auto-generated method stub
		return rect;
	}

}
