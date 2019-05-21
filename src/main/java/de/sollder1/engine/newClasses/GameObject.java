package de.sollder1.engine.newClasses;

import javafx.scene.canvas.GraphicsContext;

/**
*@author Sollder1
*
*/

/**
 * 
 * An Interface for an Item which should be represented in the Game.
 * 
 */

public interface GameObject {
	
	//Defines the Frame around the Object
	//By giving the size of it
	public double getHitbox();
	
	//For Rendering purposes:
	public Sprite getSprite();
	
	//The Size of the Object: 
	public Size getSize();
	public void setSize(Size s);
	
	//Position in the Canvas:
	public Point getPos();
	public void setPos(Point p);
	
	//Is the Objext active(needs to be Rendered 
	public boolean getActive();
	public void setActive(boolean newState);
	
	//Move it
	public void move(double x, double y);
	
	//Draw it
	public void draw(GraphicsContext _2DC);
	
}
 