package Classes;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class ShipExplosion1 extends AnimatedObject {

	private double x;
	private double y;
	private int counter;
	
	private int type;

	private int hbcounter;

	private Rectangle HitBox1;

	public ShipExplosion1(double X, double Y, int Type) {
		x = X;
		y = Y;
		counter = 0;
		hbcounter = 3;
		HitBox1 = new Rectangle();
		
		type = Type;
	}

	@Override
	boolean Draw(Mainclass h, Graphics2D g2t) {

		switch(type){
		
		case(1):{
		
		if (counter <= 5) {

			g2t.drawImage(h.Explosion_ship_1_1, (int) x, (int) y, h);
		} else if (counter <= 10) {
			g2t.drawImage(h.Explosion_ship_1_2, (int) x, (int) y, h);

		} else if (counter <= 15) {
			g2t.drawImage(h.Explosion_ship_1_3, (int) x, (int) y, h);

		} else if (counter <= 20) {
			g2t.drawImage(h.Explosion_ship_1_4, (int) x, (int) y, h);
		} else if (counter <= 25) {
			g2t.drawImage(h.Explosion_ship_1_5, (int) x, (int) y, h);
		} else if (counter <= 30) {
			g2t.drawImage(h.Explosion_ship_1_6, (int) x, (int) y, h);
		} else if (counter <= 35) {
			g2t.drawImage(h.Explosion_ship_1_7, (int) x, (int) y, h);
		} else if (counter <= 40) {
			g2t.drawImage(h.Explosion_ship_1_8, (int) x, (int) y, h);
		} else if (counter <= 45) {
			g2t.drawImage(h.Explosion_ship_1_9, (int) x, (int) y, h);
		} else if (counter <= 50) {
			g2t.drawImage(h.Explosion_ship_1_10, (int) x, (int) y, h);
		} else if (counter <= 55) {
			g2t.drawImage(h.Explosion_ship_1_11, (int) x, (int) y, h);
		} else if (counter <= 60) {
			g2t.drawImage(h.Explosion_ship_1_12, (int) x, (int) y, h);
		} else if (counter <= 65) {
			g2t.drawImage(h.Explosion_ship_1_13, (int) x, (int) y, h);
		} else if (counter <= 70) {
			g2t.drawImage(h.Explosion_ship_1_14, (int) x, (int) y, h);
		} else if (counter <= 75) {
			g2t.drawImage(h.Explosion_ship_1_15, (int) x, (int) y, h);
		} else if (counter <= 80) {
			g2t.drawImage(h.Explosion_ship_1_16, (int) x, (int) y, h);
		} else if (counter <= 85) {
			g2t.drawImage(h.Explosion_ship_1_17, (int) x, (int) y, h);
		} else if (counter <= 90) {
			g2t.drawImage(h.Explosion_ship_1_18, (int) x, (int) y, h);
		} else if (counter <= 95) {
			g2t.drawImage(h.Explosion_ship_1_19, (int) x, (int) y, h);
		}
		
		
		break;
		}
		
		case(2):{
			
			if (counter <= 5) {

				g2t.drawImage(h.Explosion_ship_2_1, (int) x, (int) y, h);
			} else if (counter <= 10) {
				g2t.drawImage(h.Explosion_ship_2_2, (int) x, (int) y, h);

			} else if (counter <= 15) {
				g2t.drawImage(h.Explosion_ship_2_3, (int) x, (int) y, h);

			} else if (counter <= 20) {
				g2t.drawImage(h.Explosion_ship_2_4, (int) x, (int) y, h);
			} else if (counter <= 25) {
				g2t.drawImage(h.Explosion_ship_2_5, (int) x, (int) y, h);
			} else if (counter <= 30) {
				g2t.drawImage(h.Explosion_ship_2_6, (int) x, (int) y, h);
			} else if (counter <= 35) {
				g2t.drawImage(h.Explosion_ship_2_7, (int) x, (int) y, h);
			} else if (counter <= 40) {
				g2t.drawImage(h.Explosion_ship_2_8, (int) x, (int) y, h);
			} else if (counter <= 45) {
				g2t.drawImage(h.Explosion_ship_2_9, (int) x, (int) y, h);
			} else if (counter <= 50) {
				g2t.drawImage(h.Explosion_ship_2_10, (int) x, (int) y, h);
			} else if (counter <= 55) {
				g2t.drawImage(h.Explosion_ship_2_11, (int) x, (int) y, h);
			} else if (counter <= 60) {
				g2t.drawImage(h.Explosion_ship_2_12, (int) x, (int) y, h);
			} else if (counter <= 65) {
				g2t.drawImage(h.Explosion_ship_2_13, (int) x, (int) y, h);
			} else if (counter <= 70) {
				g2t.drawImage(h.Explosion_ship_2_14, (int) x, (int) y, h);
			} else if (counter <= 75) {
				g2t.drawImage(h.Explosion_ship_2_15, (int) x, (int) y, h);
			} else if (counter <= 80) {
				g2t.drawImage(h.Explosion_ship_2_16, (int) x, (int) y, h);
			} else if (counter <= 85) {
				g2t.drawImage(h.Explosion_ship_2_17, (int) x, (int) y, h);
			} else if (counter <= 90) {
				g2t.drawImage(h.Explosion_ship_2_18, (int) x, (int) y, h);
			} else if (counter <= 95) {
				g2t.drawImage(h.Explosion_ship_2_19, (int) x, (int) y, h);
			}
			
			
			break;
			}
		
			case(3):{
			
			if (counter <= 5) {

				g2t.drawImage(h.Explosion_ship_3_1, (int) x, (int) y, h);
			} else if (counter <= 10) {
				g2t.drawImage(h.Explosion_ship_3_2, (int) x, (int) y, h);

			} else if (counter <= 15) {
				g2t.drawImage(h.Explosion_ship_3_3, (int) x, (int) y, h);

			} else if (counter <= 20) {
				g2t.drawImage(h.Explosion_ship_3_4, (int) x, (int) y, h);
			} else if (counter <= 25) {
				g2t.drawImage(h.Explosion_ship_3_5, (int) x, (int) y, h);
			} else if (counter <= 30) {
				g2t.drawImage(h.Explosion_ship_3_6, (int) x, (int) y, h);
			} else if (counter <= 35) {
				g2t.drawImage(h.Explosion_ship_3_7, (int) x, (int) y, h);
			} else if (counter <= 40) {
				g2t.drawImage(h.Explosion_ship_3_8, (int) x, (int) y, h);
			} else if (counter <= 45) {
				g2t.drawImage(h.Explosion_ship_3_9, (int) x, (int) y, h);
			} else if (counter <= 50) {
				g2t.drawImage(h.Explosion_ship_3_10, (int) x, (int) y, h);
			} else if (counter <= 55) {
				g2t.drawImage(h.Explosion_ship_3_11, (int) x, (int) y, h);
			} else if (counter <= 60) {
				g2t.drawImage(h.Explosion_ship_3_12, (int) x, (int) y, h);
			} else if (counter <= 65) {
				g2t.drawImage(h.Explosion_ship_3_13, (int) x, (int) y, h);
			} else if (counter <= 70) {
				g2t.drawImage(h.Explosion_ship_3_14, (int) x, (int) y, h);
			} else if (counter <= 75) {
				g2t.drawImage(h.Explosion_ship_3_15, (int) x, (int) y, h);
			} else if (counter <= 80) {
				g2t.drawImage(h.Explosion_ship_3_16, (int) x, (int) y, h);
			} else if (counter <= 85) {
				g2t.drawImage(h.Explosion_ship_3_17, (int) x, (int) y, h);
			} else if (counter <= 90) {
				g2t.drawImage(h.Explosion_ship_3_18, (int) x, (int) y, h);
			} else if (counter <= 95) {
				g2t.drawImage(h.Explosion_ship_3_19, (int) x, (int) y, h);
			}
			
			
			break;
			}
		
		
		
		
		}

		y += 0.5;

		if (counter > 95) {
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
