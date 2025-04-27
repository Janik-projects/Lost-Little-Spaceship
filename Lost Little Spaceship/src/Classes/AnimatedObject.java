package Classes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.JPanel;

public abstract class AnimatedObject{
	abstract boolean Draw(Mainclass h, Graphics2D g2t);
	
	abstract double getX();
	abstract double getY();
	abstract void setX(double X); 
	abstract void setY(double Y); 
	
	abstract void setleft();
	abstract void setright();
	abstract void unsetleft();
	abstract void unsetright();
	abstract int getID();
	
	abstract int getType();
	
	abstract Rectangle getRect1();
	abstract Rectangle getRect2();
	abstract Rectangle getRect3();

	abstract void setHealth(double change);

}
