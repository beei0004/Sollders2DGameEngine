package de.sollder1.engine;

import java.util.ArrayList;

import de.sollder1.engine.game.GameEngine;
import de.sollder1.engine.game.GameWindow;
import de.sollder1.engine.input.InputHandler;
import de.sollder1.engine.input.InputType;
import javafx.scene.input.KeyCode;

/**
*@author Sollder1
*
*/

public class Test extends GameEngine {
	
	public static void main(String[] args) {
		
		//Always Call( in this particular Order, OR an Exception will be thrown):
		
		/*
		- initWindow
		- initGameLoopFunctions
		- launchGame
		*/
		
		ArrayList<InputType> inputs = new ArrayList<>();
		inputs.add(new InputType(KeyCode.W));
		inputs.add(new InputType(KeyCode.S));
		inputs.add(new InputType(KeyCode.A));
		inputs.add(new InputType(KeyCode.D));
		inputs.add(new InputType(KeyCode.UP));
		inputs.add(new InputType(KeyCode.DOWN));
		
		
		initWindow();
		initGameLoopFunctions();
		useInputHandler(inputs);
		launchGame();
		
	}
	
}
