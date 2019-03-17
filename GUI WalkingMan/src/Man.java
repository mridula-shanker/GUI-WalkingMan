/**
 * Mridula Shanker
 * Period 6
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class Man extends JComponent
{
	private Ellipse2D.Double head;
	private Rectangle leftArm, rightArm, leftLeg, rightLeg, body;
	private int dx=0, dy=0;
	public Man(int x, int y)
	{
			setLocation(x,y);
			setSize(31,56);
			head     = new Ellipse2D.Double(10,0,10,10);
			body     = new Rectangle(14,9,3,25);
			leftArm  = new Rectangle(7,15,10,3);
			rightArm = new Rectangle(15,15,10,3);
			leftLeg  = new Rectangle(12,32,3,10);
			rightLeg = new Rectangle(17,32,3,10);
	}
	
	public void paintComponent(Graphics g) 
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.fill(head);
		g2.fill(body);
		g2.fill(leftArm);
		g2.fill(rightArm);
		g2.fill(leftLeg);
		g2.fill(rightLeg);
	}

	public void setDx(int x)
	{
		dx = x;
	}
	
	public void setDy(int y)
	{
		dy = y;
	}
	
	public int getDx()
	{
		return dx;
	}
	
	public int getDy()
	{
		return dy;
	}
	
	public void update()
	{
		setLocation(getX()+dx, getY()+dy);
	}
	 
}
