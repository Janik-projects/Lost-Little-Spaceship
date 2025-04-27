package Classes;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public abstract class Backgrounds {

	abstract double getX(); 
	abstract double getY();
	abstract void setX(double X);
	abstract void setY(double Y); 
	abstract Rectangle getRect();
	
	abstract boolean Draw(Mainclass h, Graphics2D g2t);

}
