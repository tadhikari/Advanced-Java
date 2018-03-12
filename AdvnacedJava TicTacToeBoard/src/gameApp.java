
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;

public class gameApp extends JPanel{

	private boolean player1turn;
	ArrayList<DrawnX> xList;
	ArrayList<DrawnO> oList;
	
	
	
	
	public gameApp() {
		setBorder(BorderFactory.createMatteBorder(60, 10, 60, 10, Color.BLACK));
		setBackground(Color.GREEN);
		player1turn = true;
		xList = new ArrayList<DrawnX>();
		oList = new ArrayList<DrawnO>();
		MouseListen mouseEL = new MouseListen();
		addMouseListener(mouseEL);
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.setFont(new Font("Arial", Font.PLAIN, 50));
		
		g.drawString("           Tic Tac Toe", 0, 100);
		
		for (DrawnX thisX: xList) {
			g.drawString("X", thisX.xCoord, thisX.yCoord);
		}
		
		for ( DrawnO thisO: oList) {
			g.drawString("O", thisO.xCoord, thisO.yCoord);
		}
	}
	
	class MouseListen implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			if (player1turn)
			{
				System.out.println(e.getX() + " " + e.getY());
				xList.add(new DrawnX(e.getX()-10, e.getY()+10));
				repaint();
			}
			else
			{
				System.out.println(e.getX() + " " + e.getY());
				oList.add(new DrawnO(e.getX()-10, e.getY()+10));
				repaint();
			}
			player1turn = ! player1turn;
			
		}
	}
}

class DrawnX {
	int xCoord = 200;
	int yCoord = 200;
	
	DrawnX(int xCoord, int yCoord){
		
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		
	}
}

class DrawnO {
	
	int xCoord = 200;
	int yCoord = 200;
	
	DrawnO(int xCoord, int yCoord) {
		
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		
	}
}






