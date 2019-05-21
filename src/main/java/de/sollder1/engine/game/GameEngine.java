package de.sollder1.engine.game;

import java.util.ArrayList;

import de.sollder1.engine.gameLoop.GameLoop;
import de.sollder1.engine.gameLoop.GameLoopFunctions;
import de.sollder1.engine.input.InputHandler;
import de.sollder1.engine.input.InputType;
import de.sollder1.engine.demo.TestGameLoopFunctions;
import javafx.application.Application;
import javafx.stage.Stage;

/**
*@author Sollder1
*
*/

public class GameEngine extends Application{
	
	private static GameWindow gw;
	private static GameLoopFunctions glf;
	private static GameLoop loop;
	
	
	/**
	 * This Method sets the Starting conditions of the Window, 
	 * These can be changed later if needed.
	 * 
	 * @param width - The width of the Canvas and therefore Window
	 * @param height - The height of the Canvas and therefore Window
	 * @param title - The Games Title 
	 */
	public static void initWindow(int width, int height, String title){
		
		GameEngine.gw = new GameWindow(width, height, title);
		
	}
	
	/**
	 * Pre Implemented Version for testing purposes 
	 */
	public static void initWindow(){
		
		GameEngine.gw = new GameWindow(800, 400, "Game Engine Test Szenario");
		gw.buildScene();
		
	}
	
	
	/**
	 * 
	 * This Method sets the needed Functions for the GameLoop
	 * 
	 * 
	 * @param glf - Your own Implementation of the GameLoopFunctions Interface
	 */
	public static void initGameLoopFunctions(GameLoopFunctions glf){
		
		GameEngine.glf = glf;
		
	}
	
	
	
	/**
	 * Pre Implemented Version for testing purposes 
	 */
	public static void initGameLoopFunctions(){
		
		GameEngine.glf = new TestGameLoopFunctions();
		
	}
	
	
	public static void useInputHandler(ArrayList<InputType> inputsToBeChecked) {
		
		InputHandler.init(gw.getRoot(), inputsToBeChecked);
		
		
	}
	

	public static void launchGame()  {
		
		GameEngine.loop = new GameLoop(glf, gw.getCanvas(), 60);
		GameEngine.loop.startLoop();
		launch();
		
	}
	
	
	@Override
	public void start(Stage gameStage) throws Exception {
			
		gameStage = GameEngine.gw.buildStage(gameStage);
		gameStage.show();
		
	}
	
	
}
