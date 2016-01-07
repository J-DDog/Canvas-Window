package remekah.game.view;

import java.awt.Canvas;

import javax.swing.JFrame;

import remekah.game.controller.GameController;

public class GameFrame extends JFrame
{
	
	private GameController baseController;
	private GamePanel basePanel;
	
	public GameFrame(GameController baseController)
	{
		this.baseController = baseController;
		this.basePanel = new GamePanel(baseController);
		
		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(300, 300);
		this.setTitle("Game");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public GameController getbaseController()
	{
		return baseController;
	}
}
