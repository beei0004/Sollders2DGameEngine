package de.sollder1.engine.gameLoop;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;

/**
*@author Sollder1
*The Class should not be edited 
*/

public class GameLoop {
	
	private final GameLoopFunctions glf;
	private final Canvas gameCanvas;
	
	private AnimationTimer a;
	
	
	public GameLoop(GameLoopFunctions glf, Canvas gameCanvas, int FPS) {
		
		this.glf = glf;
		this.gameCanvas = gameCanvas;
		
		initLoop2();
		
	}
	
	public void stopLoop() {
		
		a.stop();
		
	}
	
	public void startLoop() {
		
		a.start();
		
	}
	
	//private Methods(Dont you dare change them :D):
	
	private void initLoop() {
		
		a = new AnimationTimer() {
			
			final double targetFPS = 10;
			final double bestCaseDuration = 1_000_000_000 / targetFPS; //in Ns
			
			long lastUpdate = System.nanoTime();;
			
			
			@Override
			public void handle(long now) {

				//TODO: http://svanimpe.be/blog/game-loops
				
				long duration = now - lastUpdate;
				lastUpdate = now;
				
				double delta = duration / bestCaseDuration;
				
				glf.processInput();
				
				glf.update(delta);
				
				glf.render(gameCanvas);
				
				
				//System.out.println((bestCaseDuration - duration)/1_000_000 + "");
				
				if(bestCaseDuration - duration > 0) {
					
					try {
						Thread.sleep((long) (bestCaseDuration - duration)/1_000_000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}

				
			}
		};
		
	}
	
	
	//Current Implementation: 
	private void initLoop2() {
		
		a = new AnimationTimer() {
			
			final double targetDelta = 0.0166;
			final double maxDelta = 0.05;
			long previousTime = System.nanoTime();
			
			@Override
			public void handle(long now) {

				//TODO: http://svanimpe.be/blog/game-loops
			
				
				double delta = (now - previousTime) / 1_000_000_000.0;
				
				if (delta > maxDelta) {
					delta = maxDelta;
			    }
				
				
				glf.processInput();
				
				glf.update(delta + 1);
				
				glf.render(gameCanvas);
				
				//System.out.println((now - previousTime)/1_000_000 + "ms");
				
				previousTime = now;
				
				
				double frameTime = (System.nanoTime() - now) / 1_000_000_000.0;
				
				 if (frameTime < targetDelta) {
					 
					 try {
						Thread.sleep((long) (targetDelta - frameTime));
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 
				 }

				
			}
		};
		
	}
	
	
	private void initLoop3() {
		
		a = new AnimationTimer() {
			
			@Override
			public void handle(long now) {

				
				
				glf.processInput();
				
				glf.update(1);
				
				glf.render(gameCanvas);

				
			}
		};
		
	}
	
	
	
}
