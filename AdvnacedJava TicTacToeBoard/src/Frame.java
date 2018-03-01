import java.awt.*;
import javax.swing.*;


import javax.swing.*;

public class Frame extends JFrame{
	
	public Frame() {
		
		setSize(622,722);
		JFrame f= new JFrame();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	
	}
	

	public void setBoard() {
		
		JPanel heading = new JPanel(new BorderLayout());
		gameBoard game = new gameBoard();
		
		
		
		//game.setSize(200, 200);
		//game.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(10)));
		
		add(heading, BorderLayout.NORTH);
		add(game, BorderLayout.CENTER);
		
		show();
		
		
	}
	
	
	
	
	
	
	
}
