
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
public class Pong extends Applet implements Runnable, KeyListener {
	
	
	final int WIDTH = 700, HEIGHT = 600;
	
	Thread thread;
	HumanPaddle p1;
	HumanPaddle p2;
	ScoreBoard scoreB;
	Powerup life,l2;
	Plist list;
	GeneratePowerup gp;
	Timer timer = new Timer();
	
	
	
	Ball b1;
	boolean gameStarted;
	Graphics gfx;
	Image img;
	
	public void init() {
		this.resize(WIDTH,HEIGHT);
		gameStarted = false;
		this.addKeyListener(this);
		p1 = new HumanPaddle(1);
		p2 = new HumanPaddle(2);
		scoreB = new ScoreBoard();
		img = createImage(WIDTH, HEIGHT);
		gfx = img.getGraphics();
		b1 = new Ball();
		thread = new Thread(this);
		thread.start();
		list = new Plist();
		l2 = new InvisiblePaddlePowerup(p1, p2);
		
		/*Adding random powerups to the list of powerups on the screen*/
		gp = new GeneratePowerup(list.getList(), p1, p1); 
		timer.scheduleAtFixedRate(gp, 12000, 12000);
	}
	
	public void paint(Graphics g) {
		
		gfx.setColor(Color.black);
		gfx.fillRect(0, 0, WIDTH, HEIGHT);
		if(b1.getX()< -10) {
			gfx.setColor(Color.red);
			gfx.drawString("PLayer 1 Loses Life", 350, 250);
			//Player 1 loses life
		}
		else if (b1.getX()>710) {
			gfx.setColor(Color.red);
			gfx.drawString("Player 2 Loses Life", 350, 250);
			//player 2 loses life
		}
		else {
		//l2.effect(p2);
		drawPowerup();
		p1.draw(gfx);
		p2.draw(gfx);
		b1.draw(gfx);
		scoreB.draw(gfx);
		scoreB.drawHeart(gfx, 20, 550, 40, 40);
		scoreB.drawHeart(gfx, 80, 550, 40, 40);
		scoreB.drawHeart(gfx, 140, 550, 40, 40);
		scoreB.drawHeart(gfx, 510, 550, 40, 40);
		scoreB.drawHeart(gfx, 570, 550, 40, 40);
		scoreB.drawHeart(gfx, 630, 550, 40, 40);
		
		}
		
		if(!gameStarted) {
			
		}
		g.drawImage(img, 0, 0, this);
	}
	
	public void drawPowerup() {
		for(int i=0;i < list.getLength();i++) {
			System.out.println(list.getLength());
			Powerup temp = list.getElement(i);
			temp.draw(gfx);
		}
	}
	
	private void generatePowerup() {
//		Timer timer = new Timer();
		
	}
	
	public void update(Graphics g) {
		paint(g);
		
	}
	
	
	
	
	public void run() {
		for(;;) {
			if(gameStarted) {
			p1.move();
			p2.move();
			b1.move();
			b1.checkPaddleCollision(p1, p2);
			for(int i=0;i < list.getLength();i++) {
				if(b1.checkPowerUpCollision(list.getElement(i))){
					//removes power ups from list
				//list.remove(list.getElement(i));
				
				}
			
			}
			
			}
			repaint();
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			p2.setUpAccel(true);
			
		}
		
		else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			p2.setDownAccel(true);
			
		}
		else if (e.getKeyCode()== KeyEvent.VK_ENTER) {
			gameStarted = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_W) {
			p1.setUpAccel(true);
			
		}
		
		else if (e.getKeyCode() == KeyEvent.VK_S) {
			p1.setDownAccel(true);
			
		}
		//if (e.getKeyCode() == KeyEvent.VK_E) {
			
		//}
		//if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
		
		//}
			
		
	}
	
	
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			p2.setUpAccel(false);
			
		}
		
		else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			p2.setDownAccel(false);
			
		}
		if(e.getKeyCode() == KeyEvent.VK_W) {
			p1.setUpAccel(false);
			
		}
		
		else if (e.getKeyCode() == KeyEvent.VK_S) {
			p1.setDownAccel(false);
			
		}
		
		
	}
	
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}