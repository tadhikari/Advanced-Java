
import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame{

	public Frame() {
		setSize(622,722);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}
	
	public void start() {
		
		Board b = new Board();
		add(b);
		show();
		
	}
	
	
	
}
