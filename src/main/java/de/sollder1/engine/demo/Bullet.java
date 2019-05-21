package de.sollder1.engine.demo;

import de.sollder1.engine.newClasses.GameObject;
import de.sollder1.engine.newClasses.Point;
import de.sollder1.engine.newClasses.Size;
import de.sollder1.engine.newClasses.Sprite;
import javafx.scene.canvas.GraphicsContext;

/**
 * @author Sollder1
 * @date 05.03.2019 
 *
 * Dieses Werk ist lizenziert unter einer Creative Commons 
 * Namensnennung - Nicht-kommerziell - Weitergabe unter 
 * gleichen Bedingungen 4.0 International Lizenz.
 *
 * More to the Licence: http://creativecommons.org/licenses/by-nc-sa/4.0/
 * Website: http://web.sollder1.de
 * 
 */

public class Bullet implements GameObject{

	
	private double bulletSpeed = 10.;
	private Point pos;
	private Size size = new Size(10, 5);
	private int rotation = 0;
	
	public Bullet(Point pos, int rotation) {
		
		this.pos = pos;
		this.rotation = rotation;
		
	}
	
	@Override
	public double getHitbox() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Sprite getSprite() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Size getSize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSize(Size s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Point getPos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPos(Point p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getActive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setActive(boolean newState) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(double x, double y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(GraphicsContext _2dc) {
		
		
		
	}

}
