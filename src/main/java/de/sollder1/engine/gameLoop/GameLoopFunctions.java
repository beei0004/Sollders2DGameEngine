package de.sollder1.engine.gameLoop;

import javafx.scene.canvas.Canvas;

/**
*@author Sollder1
*
*/

public interface GameLoopFunctions {
	
	public void processInput();
	
	public void update(double delta);
	
	public void render(Canvas gameCanvas);
	
}
