package de.sollder1.engine.demo;

import de.sollder1.engine.newClasses.GameObject;
import de.sollder1.engine.newClasses.Point;
import de.sollder1.engine.newClasses.Size;
import de.sollder1.engine.newClasses.Sprite;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;
import javafx.scene.transform.Rotate;

/**
*@author Sollder1
*
*/

public class Player implements GameObject {

	private Point pos;
	private Size size;
	private int currentRot = 0;
	
	
	public Player(double x, double y, double width, double heigth) {
		
		 pos = new Point(x, y);
		 size = new Size(width, heigth);
	}
	
	public Player(double x, double y) {
		
		//TODO with Sprites
		 pos = new Point(x, y);
	}
	
	@Override
	public Sprite getSprite() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Size getSize() {
		return size;
	}

	@Override
	public void setSize(Size s) {
		// TODO Auto-generated method stub

	}

	@Override
	public Point getPos() {
		return pos;
	}

	@Override
	public void setPos(Point p) {

		this.pos = p;

	}

	@Override
	public boolean getActive() {
		
		return true;
	}

	@Override
	public void setActive(boolean newState) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getHitbox() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void move(double x, double y) {

		pos.setX(pos.getX() + x);
		pos.setY(pos.getY() + y);
		
		
	}

	public void rotateTower(int grad) {
		
		if(currentRot + grad > 360) {
			
			currentRot = currentRot + grad - 360;
			
		}else {
			
			currentRot += grad;
			
		}
		
	}
	
	@Override
	public void draw(GraphicsContext _2DC) {
		
		_2DC.fillRect(pos.getX(), pos.getY(), size.getWidth(), size.getHeigth());
		
		_2DC.save();
		
		Rotate r = new Rotate(currentRot, pos.getX() + size.getWidth()/2, pos.getY() + size.getHeigth()/2);
		_2DC.setTransform(r.getMxx(), r.getMyx(), r.getMxy(), r.getMyy(), r.getTx(), r.getTy());

		
		_2DC.setFill(Paint.valueOf("Green"));
		_2DC.fillRect(pos.getX() + size.getWidth()/2, pos.getY() + size.getHeigth()/2 - 10, 100, 20);
		
		
		
		
		_2DC.restore();
		
		
		
		
	}

}
