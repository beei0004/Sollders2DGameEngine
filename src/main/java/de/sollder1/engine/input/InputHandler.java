package de.sollder1.engine.input;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import javafx.scene.Parent;

/**
*@author Sollder1
*
*/

public class InputHandler {
	
	//just Keyboard Inputs yet
	//You can use this Class to detect UserInput
	//Alternatively you can write your own Class To Do So.
	
	static Parent toExecuteOn;
	static ArrayList<InputType> inputsToBeChecked;
	
	
	public static void init(Parent toExecuteOn, ArrayList<InputType> inputsToBeChecked) {
		
		InputHandler.toExecuteOn = toExecuteOn;
		InputHandler.inputsToBeChecked = inputsToBeChecked;
		
		
		toExecuteOn.setOnKeyPressed(keyPressed ->{
			
			for (InputType inputType : inputsToBeChecked) {
				
				if(keyPressed.getCode().equals(inputType.getKeyCode())) {
					
					inputType.setActive(true);
					
				}
				
			}
			
		});
		
		toExecuteOn.setOnKeyReleased(keyReleased ->{
			
			for (InputType inputType : inputsToBeChecked) {
				
				if(keyReleased.getCode().equals(inputType.getKeyCode())) {
					
					inputType.setActive(false);
					
				}
				
			}
			
		});
		
		
	}
	
	public static boolean isInputActive(String name) {
		
		for (InputType inputType : inputsToBeChecked) {
			
			if(inputType.getName().equals(name)) {
				
				return inputType.isActive();
				
			}
		}
		
		throw new NoSuchElementException();
		
	}
	
	public static boolean isInputActive(int index) {
		
		boolean b = inputsToBeChecked.get(index).isActive();
		
		return b;
		
	}
	
}
