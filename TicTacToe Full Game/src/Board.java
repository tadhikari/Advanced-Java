import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.awt.event.*;

public class Board extends JPanel implements MouseListener{
	
	int Winner = 0;
	GameLogic gamePlay;
	ArrayList<Object> symbol;
	boolean p1;
	
	public Board() {
		
		super(new BorderLayout());
		setBorder(BorderFactory.createMatteBorder(60, 10, 60, 10, Color.BLACK));
		setBackground(Color.WHITE);
		addMouseListener(this);
		gamePlay = new GameLogic();
		symbol = new ArrayList<Object>();
		p1 = true;
		
	}
	
	@Override
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		g.setColor(Color.RED);
		g.setFont(new Font("Trebuchet MS", Font.PLAIN, 50));
		g.drawString("Tic Tac Toe", ((getWidth()+ 50)/2)-150, 110);
		
		//Line2D lin = new Line2D.Float(100,100,250,260);
		
		g.drawLine(350, 500, 350, 150);
		g.drawLine(250, 500, 250, 150);
		
		
		g.drawLine(500, 275, 117, 275);
		g.drawLine(500, 375, 117, 375);
		
		//symbol.add(new Object[] {"X",200,200});
		
		for(int i =0;i<symbol.size();i++) {
			
			Object[] a = (Object[]) symbol.get(i);
			g.drawString((String) a[0], (int) a[1], (int)a[2]);
			
		}
		
		
		
//		g.drawString("X", 210, 260); //1,1
//		g.drawString("X", 285, 260); //1,2
//		g.drawString("X", 365, 260); //1,3
//		
//		g.drawString("X", 210, 350); //2,1
//		g.drawString("X", 285, 350); //2,2
//		g.drawString("X", 365, 350); //2,3
//		
//		g.drawString("X", 210, 430); //3,1
//		g.drawString("X", 285, 430); //3,2
//		g.drawString("O", 365, 430); //3,3
						
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		String current_Symbol;
	
		if(p1) {
			
			current_Symbol = "X";
			
		}
		
		else {
			current_Symbol = "O";
		}
		
		System.out.println(e.getX() + " " + e.getY());
		if(e.getX() >= 118 && e.getX()<=248 && e.getY()>=151 && e.getY()<=273) {
			System.out.println("1,1");
			symbol.add(new Object[] {current_Symbol,210,260});
			p1 = !p1;
		}
		
		else if(e.getX() >= 252 && e.getX() <= 349 && e.getY() >= 151 && e.getY() <= 273) {
			System.out.println("1,2");
		}
		
		else if(e.getX() >= 351 && e.getX() <= 501 && e.getY() >= 150 && e.getY() <= 273) {
			System.out.println("1,3");
		}
		
		else if(e.getX()>=118 && e.getX()<=248 && e.getY()>= 274 &&e.getY()<=373) {
			System.out.println("2,1");
		}
		
		else if(e.getX() >= 252 && e.getX() <= 349 && e.getY() >= 274 && e.getY()<=373) {
			System.out.println("2,2");
		}
		
		else if(e.getX() >= 351 && e.getX() <= 501 && e.getY() >= 274 && e.getY()<=373) {
			System.out.println("2,3");
		}
		
		else if(e.getX()>=118 && e.getX()<=248 && e.getY()>= 374 &&e.getY()<=500) {
			System.out.println("3,1");
		}
		
		else if(e.getX() >= 252 && e.getX() <= 349 && e.getY() >= 374 && e.getY()<=500) {
			System.out.println("3,2");
		}
		
		
		else if(e.getX() >=351 && e.getX() <= 501 && e.getY() >= 374 && e.getY()<=500) {
			System.out.println("3,3");
		}
		
		
	}
	
	
	public void youWin(int winner) {
		JOptionPane.showMessageDialog(this,"Player "+winner+" wins!");
	}
	
	
	
	
	
}





