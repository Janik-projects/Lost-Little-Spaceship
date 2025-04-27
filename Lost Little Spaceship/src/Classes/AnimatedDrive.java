package Classes;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class AnimatedDrive extends AnimatedObject {
	
	
	private double x;
	private double y;
	private int counter;

	public AnimatedDrive(double X, double Y) {
		x = X;
		y = Y;
		counter = 0;
	}

	@Override
	boolean Draw(Mainclass h, Graphics2D g2t) {
		
		
		
		if(counter <=5){
		g2t.drawImage(h.aa1, (int)x,(int) y, h);
		} else if(counter <= 10){
			g2t.drawImage(h.aa2, (int)x,(int) y, h);
		} else if(counter <= 15){
			g2t.drawImage(h.aa3, (int)x,(int) y, h);
		} else if(counter <= 20){
			g2t.drawImage(h.aa4, (int)x,(int) y, h);
		}else if(counter <= 25){
			g2t.drawImage(h.aa5, (int)x,(int) y, h);
		}else if(counter <= 30){
			g2t.drawImage(h.aa6, (int)x,(int) y, h);
		}
		
		
		y +=5;
		
		
		
		if(counter > 30){
			return false;
		} else{
		
			counter ++;
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
		x += X * 3;

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
