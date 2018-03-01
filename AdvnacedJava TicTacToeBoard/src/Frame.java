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
		JPanel game = new JPanel(new BorderLayout());
		
		Canvas c = new Canvas();
		c.setBackground(Color.green);
		c.size();
		
		//game.setSize(200, 200);
		game.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(10)));
		game.add(c);
		
		add(heading,BorderLayout.NORTH);
		add(game,BorderLayout.SOUTH);
		
		show();
		
		
	}
	
	
	
	
	
	
	
}
