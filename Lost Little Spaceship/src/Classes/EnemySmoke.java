package Classes;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class EnemySmoke extends AnimatedObject {

	private double x;
	private double y;
	private int counter;
	private int id;

	public EnemySmoke(double X, double Y, int rocketid) {
		x = X;
		y = Y;
		counter = 0;
		id = rocketid;
	}

	@Override
	boolean Draw(Mainclass h, Graphics2D g2t) {
		
		
		
		if(counter <=7){
		g2t.drawImage(h.enemyRocket_steam1, (int)x,(int) y, h);
		} else if(counter <= 14){
			g2t.drawImage(h.enemyRocket_steam2, (int)x,(int) y, h);
		} else if(counter <= 21){
			g2t.drawImage(h.enemyRocket_steam3, (int)x,(int) y, h);
		} 
		
		
		y -=5;
		
		
		
		if(counter > 21){
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
		x += X;

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
	
	public int getID(){
		return id;
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
