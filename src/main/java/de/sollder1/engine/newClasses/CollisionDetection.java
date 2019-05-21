package de.sollder1.engine.newClasses;

/**
*@author Sollder1
*
*/

public class CollisionDetection {
	
	public static boolean rectToRect(GameObject go1, GameObject go2){
		
		return rectToRect(go1.getSize(), go2.getSize(), go1.getPos(), go2.getPos());
		
	}
	
	//Object 1 is the engaging one
	//Also der für den die Kollision gechekt werden soll.
	//TODO!
	public static boolean rectToRect(Size object1_size, Size object2_size, Point object1_pos, Point object2_pos){
		
		//Abstand 1 und 2 kleiner size
		boolean t = false;
		
		double width;
		double heigth;
		
		if(object1_size.getWidth() > object2_size.getWidth())
			width = object1_size.getWidth();
		else
			width = object2_size.getWidth();
		
		if(object1_size.getHeigth() > object2_size.getHeigth())
			heigth = object1_size.getHeigth();
		else
			heigth = object2_size.getHeigth();
		
		
		if(Math.abs(object1_pos.getX() - object2_pos.getX()) < width) {
			
			if(Math.abs(object1_pos.getY() - object2_pos.getY()) < heigth) {
			
				t = true;	
				
			}
			
		}
		
		return t;
		
	}
	
	//Eventuell: Collision Shape adden
	
}
