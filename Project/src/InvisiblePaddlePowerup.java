import java.awt.Color;
import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;


public class InvisiblePaddlePowerup extends Powerup{

	Timer timer = new Timer();
	resetBoard b;
	
	public InvisiblePaddlePowerup(HumanPaddle p1, HumanPaddle p2) {
		super(p1, p2);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(new Color(0,128,255));
		g.fillRect(x, y, 20, 20);
		
	}
	
	@Override
	public void effect(HumanPaddle p) {
		
		if(p.player == 1) {
			p2.color = new Color(0,0,0);
			timer.schedule(new resetBoard(p2), 5000);
		}
		else {
			p1.color = new Color(0,0,0);
			timer.schedule(new resetBoard(p1), 5000);
		}
		
		
	}
}

class resetBoard extends TimerTask{
	
	HumanPaddle p;
	
	resetBoard(HumanPaddle p){
		this.p = p;	
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		p.color = new Color(255,255,255);
	}
	
	
	
	
	
}
