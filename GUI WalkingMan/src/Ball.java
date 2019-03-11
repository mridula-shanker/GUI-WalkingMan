/**
 * Mridula Shanker
 * Period 6
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

	public class Ball extends JComponent
		{
			private Ellipse2D.Double ball;
			private int dx=0, dy=0;
			public Ball()
			{
					ball=new Ellipse2D.Double(20,20,10,10);
			}
			
			public void paintComponent(Graphics g) //this method already exists, we're overriding it
			{
				Graphics2D g2 = (Graphics2D)g;
				g2.draw(ball);
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

