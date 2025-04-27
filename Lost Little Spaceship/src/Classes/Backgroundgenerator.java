package Classes;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;
import java.util.Vector;

public class Backgroundgenerator extends AnimatedObject {

	private double x;
	private double y;
	private double valueMove;
	private Mainclass MC;
	private Rectangle rect;
	private Random r1;
	private int dotcounter;
	private int dotcounter2;

	private double xpos1;
	private double xpos2;

	private int maxdots;
	private int maxdots2;

	private Random r2;
	private Random r3;

	private double ypos;

	public Backgroundgenerator(double X, double Y, Mainclass mc) {
		MC = mc;
		rect = new Rectangle();

		maxdots = 75;
		maxdots2 = 75;

		MC.Backgrounds = new Vector<>();
		MC.Backgrounds2 = new Vector<>();
		MC.BackgroundsBehind = new Vector<>();
		x = X;
		y = Y;

		ypos = 0;
		xpos1 = 0;
		xpos2 = 0;

		valueMove = 0;

		r1 = new Random();
		r2 = new Random(2000);
		r3 = new Random(r2.nextInt(23000));

		// seeds: 1: 1246565 2:

		MC.BackgroundsBehind.add(new BackgroundBehind(x, y, r1.nextInt(mc.MaxDifferentBackgroundTypes)));
		MC.BackgroundsBehind.add(new BackgroundBehind(x, y + mc.Background1.getHeight(), r1.nextInt(mc.MaxDifferentBackgroundTypes)));
		MC.BackgroundsBehind.add(new BackgroundBehind(x, y + (2 * mc.Background1.getHeight()), r1.nextInt(mc.MaxDifferentBackgroundTypes)));
		MC.BackgroundsBehind.add(new BackgroundBehind(x, y - mc.Background1.getHeight(), r1.nextInt(mc.MaxDifferentBackgroundTypes)));

		MC.BackgroundsBehind.add(new BackgroundBehind(x, y - (2 * mc.Background1.getHeight()), r1.nextInt(mc.MaxDifferentBackgroundTypes)));

		for (int i = 1; i < 4; i++) {
			MC.BackgroundsBehind.add(new BackgroundBehind(x + (i * mc.Background1.getWidth()), y, r1.nextInt(mc.MaxDifferentBackgroundTypes)));
			MC.BackgroundsBehind.add(new BackgroundBehind(x + (i * mc.Background1.getWidth()),
					y + mc.Background1.getHeight(), r1.nextInt(mc.MaxDifferentBackgroundTypes)));
			MC.BackgroundsBehind.add(new BackgroundBehind(x + (i * mc.Background1.getWidth()),
					y + (2 * mc.Background1.getHeight()), r1.nextInt(mc.MaxDifferentBackgroundTypes)));
			MC.BackgroundsBehind.add(new BackgroundBehind(x + (i * mc.Background1.getWidth()),
					y - mc.Background1.getHeight(),r1.nextInt(mc.MaxDifferentBackgroundTypes)));

			MC.BackgroundsBehind.add(new BackgroundBehind(x + (i * mc.Background1.getWidth()),
					y - (2 * mc.Background1.getHeight()), r1.nextInt(mc.MaxDifferentBackgroundTypes)));

		}

		for (int i = 1; i < 4; i++) {
			MC.BackgroundsBehind.add(new BackgroundBehind(x - (i * mc.Background1.getWidth()), y, r1.nextInt(mc.MaxDifferentBackgroundTypes)));
			MC.BackgroundsBehind.add(new BackgroundBehind(x - (i * mc.Background1.getWidth()),
					y + mc.Background1.getHeight(), r1.nextInt(mc.MaxDifferentBackgroundTypes)));
			MC.BackgroundsBehind.add(new BackgroundBehind(x - (i * mc.Background1.getWidth()),
					y + (2 * mc.Background1.getHeight()), r1.nextInt(mc.MaxDifferentBackgroundTypes)));
			MC.BackgroundsBehind.add(new BackgroundBehind(x - (i * mc.Background1.getWidth()),
					y - mc.Background1.getHeight(), r1.nextInt(mc.MaxDifferentBackgroundTypes)));

			MC.BackgroundsBehind.add(new BackgroundBehind(x - (i * mc.Background1.getWidth()),
					y - (2 * mc.Background1.getHeight()), r1.nextInt(mc.MaxDifferentBackgroundTypes)));

		}

		for (int i = 0; i < maxdots2; i++) {
			MC.Backgrounds2.add(new BackgroundForeground2(0 + r2.nextInt(mc.width), 0 + r2.nextInt(mc.height)));

		}
		
		for (int i = 0; i < maxdots; i++) {
			MC.Backgrounds.add(new BackgroundForeground(0 + r1.nextInt(mc.width), 0 + r1.nextInt(mc.height)));

		}
		
		

	}

	@Override
	boolean Draw(Mainclass h, Graphics2D g2t) {

		rect.setBounds(0, 0, h.width, h.height);

		for (int i = 0; i < h.Backgrounds.size(); i++) {
			if (h.Backgrounds.get(i) instanceof BackgroundForeground) {
				if (h.Backgrounds.get(i).getRect().intersects(rect)) {
					dotcounter++;

				}

			}

		}
		
		for (int i = 0; i < h.Backgrounds2.size(); i++) {
			if (h.Backgrounds2.get(i) instanceof BackgroundForeground2) {
				if (h.Backgrounds2.get(i).getRect().intersects(rect)) {
					dotcounter2++;

				}

			}

		}

		if (ypos < 1200) {
			ypos += 2;
		} else {

			Integer BackID[] = new Integer[18];

			BackID[0] = r2.nextInt(h.MaxDifferentBackgroundTypes);
			BackID[1] = r2.nextInt(h.MaxDifferentBackgroundTypes);
			BackID[2] = r2.nextInt(h.MaxDifferentBackgroundTypes);
			BackID[3] = r2.nextInt(h.MaxDifferentBackgroundTypes);
			BackID[4] = r2.nextInt(h.MaxDifferentBackgroundTypes);
			BackID[5] = r2.nextInt(h.MaxDifferentBackgroundTypes);
			BackID[6] = r2.nextInt(h.MaxDifferentBackgroundTypes);
			BackID[7] = r2.nextInt(h.MaxDifferentBackgroundTypes);
			BackID[8] = r2.nextInt(h.MaxDifferentBackgroundTypes);
			BackID[9] = r2.nextInt(h.MaxDifferentBackgroundTypes);
			BackID[10] = r2.nextInt(h.MaxDifferentBackgroundTypes);
			BackID[11] = r2.nextInt(h.MaxDifferentBackgroundTypes);
			BackID[12] = r2.nextInt(h.MaxDifferentBackgroundTypes);
			BackID[13] = r2.nextInt(h.MaxDifferentBackgroundTypes);
			BackID[14] = r2.nextInt(h.MaxDifferentBackgroundTypes);
			BackID[15] = r2.nextInt(h.MaxDifferentBackgroundTypes);
			BackID[16] = r2.nextInt(h.MaxDifferentBackgroundTypes);
			BackID[17] = r2.nextInt(h.MaxDifferentBackgroundTypes);

			for (int t = 0; t < 20; t++) {
				for (int i = 0; i < 18; i++) {

					for (int j = i + 1; j < 18; j++) {

						if (BackID[i] == BackID[j]) {
							BackID[j] = r3.nextInt(h.MaxDifferentBackgroundTypes);

						}

					}

				}
			}

			MC.BackgroundsBehind.add(new BackgroundBehind(0, y - h.Background1.getHeight(), BackID[4]));
			MC.BackgroundsBehind
					.add(new BackgroundBehind(0 + h.Background1.getWidth(), y - h.Background1.getHeight(), BackID[5]));
			MC.BackgroundsBehind
					.add(new BackgroundBehind(0 - h.Background1.getWidth(), y - h.Background1.getHeight(), BackID[3]));
			MC.BackgroundsBehind.add(
					new BackgroundBehind(0 - 2 * h.Background1.getWidth(), y - h.Background1.getHeight(), BackID[2]));
			MC.BackgroundsBehind.add(
					new BackgroundBehind(0 + 2 * h.Background1.getWidth(), y - h.Background1.getHeight(), BackID[6]));
			MC.BackgroundsBehind.add(
					new BackgroundBehind(0 + 3 * h.Background1.getWidth(), y - h.Background1.getHeight(), BackID[7]));
			MC.BackgroundsBehind.add(
					new BackgroundBehind(0 - 3 * h.Background1.getWidth(), y - h.Background1.getHeight(), BackID[1]));
			MC.BackgroundsBehind.add(
					new BackgroundBehind(0 + 4 * h.Background1.getWidth(), y - h.Background1.getHeight(), BackID[8]));
			MC.BackgroundsBehind.add(
					new BackgroundBehind(0 - 4 * h.Background1.getWidth(), y - h.Background1.getHeight(), BackID[0]));

			MC.BackgroundsBehind.add(new BackgroundBehind(0, y - 2 * h.Background1.getHeight(), BackID[12]));
			MC.BackgroundsBehind.add(
					new BackgroundBehind(0 + h.Background1.getWidth(), y - 2 * h.Background1.getHeight(), BackID[13]));
			MC.BackgroundsBehind.add(
					new BackgroundBehind(0 - h.Background1.getWidth(), y - 2 * h.Background1.getHeight(), BackID[11]));
			MC.BackgroundsBehind.add(new BackgroundBehind(0 - 2 * h.Background1.getWidth(),
					y - 2 * h.Background1.getHeight(), BackID[10]));
			MC.BackgroundsBehind.add(new BackgroundBehind(0 + 2 * h.Background1.getWidth(),
					y - 2 * h.Background1.getHeight(), BackID[14]));
			MC.BackgroundsBehind.add(new BackgroundBehind(0 + 3 * h.Background1.getWidth(),
					y - 2 * h.Background1.getHeight(), BackID[15]));
			MC.BackgroundsBehind.add(new BackgroundBehind(0 - 3 * h.Background1.getWidth(),
					y - 2 * h.Background1.getHeight(), BackID[9]));
			MC.BackgroundsBehind.add(new BackgroundBehind(0 + 4 * h.Background1.getWidth(),
					y - 2 * h.Background1.getHeight(), BackID[16]));
			MC.BackgroundsBehind.add(new BackgroundBehind(0 - 4 * h.Background1.getWidth(),
					y - 2 * h.Background1.getHeight(), BackID[17]));

			ypos = 0;
		}
		
		
		if (dotcounter2 < maxdots2) {

			if (h.left) {
				for (int i = 0; i < 7; i++) {

					h.Backgrounds2.add(new BackgroundForeground2(-70 + r1.nextInt(h.width / 3 + 70),
							h.height - r1.nextInt(h.height / 2)));
					h.Backgrounds2.add(new BackgroundForeground2(-70 + r1.nextInt(h.width + 140),
							-70 + r1.nextInt(h.height / 2 + 70)));
				}
				dotcounter2 = 0;

			} else if (h.right) {

				for (int i = 0; i < 7; i++) {

					h.Backgrounds2.add(new BackgroundForeground2(h.width + 70 - r1.nextInt(h.width / 3 + 70),
							h.height - r1.nextInt(h.height / 2)));
					h.Backgrounds2.add(new BackgroundForeground2(-70 + r1.nextInt(h.width + 140),
							-70 + r1.nextInt(h.height / 2 + 70)));

					// h.Backgrounds.add(new Background2(0 +
					// r1.nextInt(h.width), 0 + r1.nextInt(h.height / 2)));
				}
				dotcounter2 = 0;

			} else {
				for (int i = 0; i < 7; i++) {

					h.Backgrounds2.add(new BackgroundForeground2(-70 + r1.nextInt(h.width + 140),
							-70 + r1.nextInt(h.height / 2 + 70)));
					h.Backgrounds2.add(new BackgroundForeground2(-70 + r1.nextInt(h.width + 140),
							-70 + r1.nextInt(h.height / 2 + 70)));
				}

			}
			dotcounter2 = 0;

		} else {
			dotcounter2 = 0;
		}

		if (dotcounter < maxdots) {

			if (h.left) {
				for (int i = 0; i < 7; i++) {

					h.Backgrounds.add(new BackgroundForeground(-70 + r1.nextInt(h.width / 3 + 70),
							h.height - r1.nextInt(h.height / 2)));
					h.Backgrounds.add(new BackgroundForeground(-70 + r1.nextInt(h.width + 140),
							-70 + r1.nextInt(h.height / 2 + 70)));
				}
				dotcounter = 0;

			} else if (h.right) {

				for (int i = 0; i < 7; i++) {

					h.Backgrounds.add(new BackgroundForeground(h.width + 70 - r1.nextInt(h.width / 3 + 70),
							h.height - r1.nextInt(h.height / 2)));
					h.Backgrounds.add(new BackgroundForeground(-70 + r1.nextInt(h.width + 140),
							-70 + r1.nextInt(h.height / 2 + 70)));

					// h.Backgrounds.add(new Background2(0 +
					// r1.nextInt(h.width), 0 + r1.nextInt(h.height / 2)));
				}
				dotcounter = 0;

			} else {
				for (int i = 0; i < 7; i++) {

					h.Backgrounds.add(new BackgroundForeground(-70 + r1.nextInt(h.width + 140),
							-70 + r1.nextInt(h.height / 2 + 70)));
					h.Backgrounds.add(new BackgroundForeground(-70 + r1.nextInt(h.width + 140),
							-70 + r1.nextInt(h.height / 2 + 70)));
				}

			}
			dotcounter = 0;

		} else {
			dotcounter = 0;
		}

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
		valueMove = X;
		x += valueMove;
		
		for (int i = 0; i < MC.Backgrounds2.size(); i++) {
			MC.Backgrounds2.get(i).setX(valueMove);

		}
		
		for (int i = 0; i < MC.Backgrounds.size(); i++) {
			MC.Backgrounds.get(i).setX(valueMove);

		}

		for (int i = 0; i < MC.BackgroundsBehind.size(); i++) {
			MC.BackgroundsBehind.get(i).setX(valueMove);

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
