package de.sollder1.engine.game;

import de.sollder1.engine.util.EngineGameCanvas;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
*@author Sollder1
*
*/

public class GameWindow {

	private int height;
	private int width;
	private String title;
	
	private StackPane root;
	
	private EngineGameCanvas c;
	
	private Scene gameScene;
	
	
	public GameWindow(int width, int height, String title) {
		
		this.height = height;
		this.width = width;
		this.title = title;
		
		this.c = new EngineGameCanvas(this.width, this.height);
		
	}
	
	
	
	public void buildScene(){

		this.root = new StackPane();
		
		root.getChildren().add(c);
		
		gameScene = new Scene(root);
		
		root.requestFocus();

	}
	
	public Stage buildStage(Stage gameStage) {
		
		gameStage.setScene(gameScene);
		gameStage.setTitle(title);
		
		return gameStage;
	}
	
	public EngineGameCanvas getCanvas() {
		
		return c;
		
	}



	public Parent getRoot() {
		return root;
	}

}
