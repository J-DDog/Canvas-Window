package remekah.game.view;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import remekah.game.controller.GameController;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class GamePanel extends JPanel
{
	
	private GameController baseController;
	private SpringLayout baseLayout;
	
	public GamePanel(GameController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		
		setupPanel();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		
	}

	private void setupListeners()
	{
		// TODO Auto-generated method stub
		
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.RED);
		g2d.fillOval(0, 0, 30, 30);
		g2d.drawOval(0, 50, 30, 30);		
		g2d.fillRect(50, 0, 30, 30);
		g2d.drawRect(50, 50, 30, 30);

		g2d.draw(new Ellipse2D.Double(0, 100, 30, 30));
	}
	
}
