package Classes;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;

public class BackgroundBehind extends Backgrounds {

	private double x;
	private double y;
	private Rectangle rect;
	private int Type;

	public BackgroundBehind(double X, double Y, int type) {
		x = X;
		y = Y;
		rect = new Rectangle();
		Type = type;
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
		x += X;

	}

	@Override
	void setY(double Y) {
		y = Y;

	}

	@Override
	boolean Draw(Mainclass h, Graphics2D g2t) {
		Graphics2D g2 = g2t;

		y += 2;

		switch (Type) {

		case (0):{
			
			g2.drawImage(h.Background12, (int)x, (int)y, h);
			
			break;
		}
		
		case (1): {
			g2.drawImage(h.Background1, (int)x, (int)y, h);
			break;
		}

		case (2): {
			g2.drawImage(h.Background2, (int)x, (int)y, h);
			break;
		}

		case (3): {
			g2.drawImage(h.Background3, (int)x, (int)y, h);
			break;
		}

		case (4): {
			g2.drawImage(h.Background4, (int)x, (int)y, h);
			break;
		}

		case (5): {
			g2.drawImage(h.Background5, (int)x, (int)y, h);
			break;
		}
		case (6): {
			g2.drawImage(h.Background6, (int)x, (int)y, h);
			break;
		}
		case (7): {
			g2.drawImage(h.Background7, (int)x, (int)y, h);
			break;
		}
		case (8): {
			g2.drawImage(h.Background8, (int)x, (int)y, h);
			break;
		}
		case (9): {
			g2.drawImage(h.Background9, (int)x, (int)y, h);
			break;
		}
		case (10): {
			g2.drawImage(h.Background10, (int)x, (int)y, h);
			break;
		}
		case (11): {
			g2.drawImage(h.Background11, (int)x, (int)y, h);
			break;
		}
		case (12): {
			g2.drawImage(h.Background12, (int)x, (int)y, h);
			break;
		}
		case (13): {
			g2.drawImage(h.Background13, (int)x, (int)y, h);
			break;
		}
		case (14): {
			g2.drawImage(h.Background14, (int)x, (int)y, h);
			break;
		}
		case (15): {
			g2.drawImage(h.Background15, (int)x, (int)y, h);
			break;
		}
		case (16): {
			g2.drawImage(h.Background16, (int)x, (int)y, h);
			break;
		}
		case (17): {
			g2.drawImage(h.Background17, (int)x, (int)y, h);
			break;
		}
		case (18): {
			g2.drawImage(h.Background18, (int)x, (int)y, h);
			break;
		}
		case (19): {
			g2.drawImage(h.Background19, (int)x, (int)y, h);
			break;
		}
		case (20): {
			g2.drawImage(h.Background20, (int)x, (int)y, h);
			break;
		}
		case (21): {
			g2.drawImage(h.Background21, (int)x, (int)y, h);
			break;
		}
		case (22): {
			g2.drawImage(h.Background22, (int)x, (int)y, h);
			break;
		}
		case (23): {
			g2.drawImage(h.Background23, (int)x, (int)y, h);
			break;
		}
		case (24): {
			g2.drawImage(h.Background24, (int)x, (int)y, h);
			break;
		}
		
		case (25): {
			g2.drawImage(h.Background25, (int)x, (int)y, h);
			break;
		}
		
		case (26): {
			g2.drawImage(h.Background26, (int)x, (int)y, h);
			break;
		}
		
		case (27): {
			g2.drawImage(h.Background27, (int)x, (int)y, h);
			break;
		}
		
		case (28): {
			g2.drawImage(h.Background28, (int)x, (int)y, h);
			break;
		}
		
		case (29): {
			g2.drawImage(h.Background29, (int)x, (int)y, h);
			break;
		}
		
		case (30): {
			g2.drawImage(h.Background30, (int)x, (int)y, h);
			break;
		}
		
		case (31): {
			g2.drawImage(h.Background31, (int)x, (int)y, h);
			break;
		}
		
		case (32): {
			g2.drawImage(h.Background32, (int)x, (int)y, h);
			break;
		}
		
		case (33): {
			g2.drawImage(h.Background33, (int)x, (int)y, h);
			break;
		}
		
		case (34): {
			g2.drawImage(h.Background34, (int)x, (int)y, h);
			break;
		}
		
		case (35): {
			g2.drawImage(h.Background35, (int)x, (int)y, h);
			break;
		}
		
		case (36): {
			g2.drawImage(h.Background36, (int)x, (int)y, h);
			break;
		}
		
		case (37): {
			g2.drawImage(h.Background37, (int)x, (int)y, h);
			break;
		}
		
		case (38): {
			g2.drawImage(h.Background38, (int)x, (int)y, h);
			break;
		}
		
		case (39): {
			g2.drawImage(h.Background39, (int)x, (int)y, h);
			break;
		}
		
		case (40): {
			g2.drawImage(h.Background40, (int)x, (int)y, h);
			break;
		}
		
		case (41): {
			g2.drawImage(h.Background41, (int)x, (int)y, h);
			break;
		}
		
		case (42): {
			g2.drawImage(h.Background42, (int)x, (int)y, h);
			break;
		}
		case (43): {
			g2.drawImage(h.Background43, (int)x, (int)y, h);
			break;
		}
		case (44): {
			g2.drawImage(h.Background44, (int)x, (int)y, h);
			break;
		}
		case (45): {
			g2.drawImage(h.Background45, (int)x, (int)y, h);
			break;
		}
		case (46): {
			g2.drawImage(h.Background46, (int)x, (int)y, h);
			break;
		}
		case (47): {
			g2.drawImage(h.Background47, (int)x, (int)y, h);
			break;
		}
		case (48): {
			g2.drawImage(h.Background48, (int)x, (int)y, h);
			break;
		}
		case (49): {
			g2.drawImage(h.Background49, (int)x, (int)y, h);
			break;
		}
		case (50): {
			g2.drawImage(h.Background50, (int)x, (int)y, h);
			break;
		}
		case (51): {
			g2.drawImage(h.Background51, (int)x, (int)y, h);
			break;
		}
		case (52): {
			g2.drawImage(h.Background52, (int)x, (int)y, h);
			break;
		}
		case (53): {
			g2.drawImage(h.Background53, (int)x, (int)y, h);
			break;
		}
		case (54): {
			g2.drawImage(h.Background54, (int)x, (int)y, h);
			break;
		}
		case (55): {
			g2.drawImage(h.Background55, (int)x, (int)y, h);
			break;
		}
		case (56): {
			g2.drawImage(h.Background56, (int)x, (int)y, h);
			break;
		}
		case (57): {
			g2.drawImage(h.Background57, (int)x, (int)y, h);
			break;
		}
		
		}

		// rect.setBounds((int)x,(int) y, h.backgroundTest.getWidth(),
		// h.backgroundTest.getHeight());

		/*
		 * if( y > 2 * h.backgroundTest.getHeight()){ y = 0; }
		 * 
		 * g2.drawImage(h.backgroundTest, (int) x, (int) y, h);
		 * g2.drawImage(h.backgroundTest, (int) x, (int)
		 * y-h.backgroundTest.getHeight(), h); g2.drawImage(h.backgroundTest,
		 * (int) x, (int) y-h.backgroundTest.getHeight()*2, h);
		 * 
		 * 
		 */

		if(y < h.height){
		return true;
		}
		else{
			return false;
		}
	}

	@Override
	Rectangle getRect() {
		// TODO Auto-generated method stub
		return rect;
	}

}
