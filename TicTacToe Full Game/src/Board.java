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
	String currentSymbol;
	String temp;
	
	public Board() {
		
		super(new BorderLayout());
		setBorder(BorderFactory.createMatteBorder(60, 10, 60, 10, Color.BLACK));
		setBackground(Color.WHITE);
		addMouseListener(this);
		gamePlay = new GameLogic();
		symbol = new ArrayList<Object>();
		p1 = true;
		String[] symbols = { "X","O" };
		currentSymbol = (String) JOptionPane.showInputDialog(null, "Player 1 select your symbol",
		        "Starting Symbol", JOptionPane.QUESTION_MESSAGE, null, symbols, "X");
		temp="";
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
		
		g.setColor(Color.BLUE);
		
		if(temp.equals("1,5,9")) {
			g.drawLine(450, 475, 150, 175); //diagnol
		}
		
		else if(temp.equals("7,5,3")) {
			g.drawLine(150, 475, 450, 175); //diagnol
		}
		
		else if(temp.equals("2,5,8")) {
			g.drawLine(300, 475, 300, 175); //vertical middle
		}
		
		else if(temp.equals("3,6,9")) {
			g.drawLine(380, 475, 380, 175); //verticle right
		}
		
		else if(temp.equals("1,4,7")) {
			g.drawLine(225, 475, 225, 175); //verticle left
		}
		
		
		else if(temp.equals("1,2,3")) {
			g.drawLine(500, 240, 117, 240); //horizontal top
		}
		
		else if(temp.equals("4,5,6")) {
			g.drawLine(500, 330, 117, 330); //horizontal middle
		}
		
		else if(temp.equals("7,8,9")) {
			g.drawLine(500, 410, 117, 410); //horizontal bottom
		}
			
		
			
//		else if(temp.equals("2,5,8")) {
//			g.drawLine(300, 475, 300, 175);
//		}
		
		
//		g.drawLine(350, 375, 250, 100);
		
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
		
		String current_Symbol = this.currentSymbol;
		
		int p;
		
		if(p1) {
			p = 1;
		}
		
		else {
			p = 2;
		}
		
		System.out.println(e.getX() + " " + e.getY());
		if(e.getX() >= 118 && e.getX()<=248 && e.getY()>=151 && e.getY()<=273 && gamePlay.isFree(0)) {
			System.out.println("1,1");
			gamePlay.play("1,1", p);
			symbol.add(new Object[] {current_Symbol,210,260});
			p1 = !p1;
			repaint();
			youWin(p);
		}
		
		else if(e.getX() >= 252 && e.getX() <= 349 && e.getY() >= 151 && e.getY() <= 273 && gamePlay.isFree(1)) {
			System.out.println("1,2");
			gamePlay.play("1,2", p);
			symbol.add(new Object[] {current_Symbol,285,260});
			p1 = !p1;
			repaint();
			youWin(p);
		}
		
		else if(e.getX() >= 351 && e.getX() <= 501 && e.getY() >= 150 && e.getY() <= 273 && gamePlay.isFree(2)) {
			gamePlay.play("1,3", p);
			symbol.add(new Object[] {current_Symbol,365,260});
			p1 = !p1;
			repaint();
			youWin(p);
		}
		
		else if(e.getX()>=118 && e.getX()<=248 && e.getY()>= 274 &&e.getY()<=373 && gamePlay.isFree(3)) {
			System.out.println("2,1");
			gamePlay.play("2,1", p);
			symbol.add(new Object[] {current_Symbol,210,350});
			p1 = !p1;
			repaint();
			youWin(p);
		}
		
		else if(e.getX() >= 252 && e.getX() <= 349 && e.getY() >= 274 && e.getY()<=373 && gamePlay.isFree(4)) {
			System.out.println("2,2");
			gamePlay.play("2,2", p);
			symbol.add(new Object[] {current_Symbol,285,350});
			p1 = !p1;
			repaint();
			youWin(p);
		}
		
		else if(e.getX() >= 351 && e.getX() <= 501 && e.getY() >= 274 && e.getY()<=373 && gamePlay.isFree(5)) {
			System.out.println("2,3");
			gamePlay.play("2,3", p);
			symbol.add(new Object[] {current_Symbol,365,350});
			p1 = !p1;
			repaint();
			youWin(p);
		}
		
		else if(e.getX()>=118 && e.getX()<=248 && e.getY()>= 374 &&e.getY()<=500 && gamePlay.isFree(6)) {
			System.out.println("3,1");
			gamePlay.play("3,1", p);
			symbol.add(new Object[] {current_Symbol,210,430});
			p1 = !p1;
			repaint();
			youWin(p);
		}
		
		else if(e.getX() >= 252 && e.getX() <= 349 && e.getY() >= 374 && e.getY()<=500 && gamePlay.isFree(7)) {
			System.out.println("3,2");
			gamePlay.play("3,2", p);
			symbol.add(new Object[] {current_Symbol,285,430});
			p1 = !p1;
			repaint();
			youWin(p);
		}
		
		
		else if(e.getX() >=351 && e.getX() <= 501 && e.getY() >= 374 && e.getY()<=500 && gamePlay.isFree(8)) {
			System.out.println("3,3");
			gamePlay.play("3,3", p);
			symbol.add(new Object[] {current_Symbol,365,430});
			p1 = !p1;
			repaint();
			youWin(p);
		}
		
	if(currentSymbol.equals("X")) {
		currentSymbol = "O";
	}
	else {
		currentSymbol = "X";
	}
		
	
	}
	
	
	public void youWin(int player) {
		if((boolean)gamePlay.playerWon(player)[0]) {
			
			temp = (String) gamePlay.playerWon(player)[1];
			repaint();
			JOptionPane.showMessageDialog(this, "Player "+player+" wins!");
			removeMouseListener(this);
			
		}	
	}
	
	
	
	
	
}





