package de.sollder1.engine.demo;

import de.sollder1.engine.gameLoop.GameLoopFunctions;
import de.sollder1.engine.input.InputHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

/**
*@author Sollder1
*
*/

public class TestGameLoopFunctions implements GameLoopFunctions {

	
	private Player p1 = new Player(100, 200, 200, 100);
	
	@Override
	public void processInput() {
		
		//Not USed because Input Handler is Used!
		
	}

	@Override
	public void update(double delta) {

		
		if(InputHandler.isInputActive("W"))
			p1.move(0, -3);
		
		if(InputHandler.isInputActive("S"))
			p1.move(0, 3);
		
		if(InputHandler.isInputActive("A"))
			p1.move(-3, 0);
		
		if(InputHandler.isInputActive("D"))
			p1.move(3, 0);
		
		if(InputHandler.isInputActive("UP"))
			p1.rotateTower(-1);
		
		if(InputHandler.isInputActive("DOWN"))
			p1.rotateTower(1);

	}

	@Override
	public void render(Canvas gameCanvas) {
		
		GraphicsContext gc = gameCanvas.getGraphicsContext2D();
		
		gc.clearRect(0, 0, gameCanvas.getWidth(), gameCanvas.getHeight());

		p1.draw(gc);
		
	}

}
