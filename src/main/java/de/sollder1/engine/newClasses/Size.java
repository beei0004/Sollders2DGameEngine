package de.sollder1.engine.newClasses;

/**
*@author Sollder1
*
*/

public class Size {
	
	private double width;
	private double heigth;
	
	public Size(double width, double heigth) {

		setWidth(width);
		setHeigth(heigth);
		
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}


}
