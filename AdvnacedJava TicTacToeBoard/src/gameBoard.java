
import java.awt.*;
import javax.swing.*;

public class gameBoard extends JPanel{

	public gameBoard() {
		setBorder(BorderFactory.createStrokeBorder(new BasicStroke(10)));
		setBackground(Color.GREEN);
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		g.drawString("Tic Tac Toe", 0, 50);
		
		
	}
	
	
	
	
	
	
	
}
