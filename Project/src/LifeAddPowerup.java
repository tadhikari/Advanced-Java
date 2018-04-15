import java.awt.Color;
import java.awt.Graphics;


public class LifeAddPowerup extends Powerup{
	
	public LifeAddPowerup(HumanPaddle p1,HumanPaddle p2) {
		
		super(p1,p2);
		
	}
	
	@Override 
	public void draw(Graphics g) {
		g.setColor(new Color(255,0,95));
		g.fillRect(x, y, 20, 20);
	}

	@Override
	public void effect(HumanPaddle p) {
		// TODO Auto-generated method stub
		
	}
	
	
}
