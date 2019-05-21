package de.sollder1.engine.input;

import javafx.scene.input.KeyCode;

/**
*@author Sollder1
*
*/

public class InputType {
	
	private boolean active = false;
	private final String name;
	
	//Checkcode: 
	private final KeyCode keyCode;
	
	//Name equals checkCode
	public InputType(KeyCode checkCode) {
		
		this.keyCode = checkCode;
		this.name = keyCode.toString();
		
	}
	
	//Special Name
	public InputType(KeyCode keyCode, String name) {
		
		this.keyCode = keyCode;
		this.name = name;
		
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public KeyCode getKeyCode() {
		return keyCode;
	}

	public String getName() {
		return name;
	}
	
}
