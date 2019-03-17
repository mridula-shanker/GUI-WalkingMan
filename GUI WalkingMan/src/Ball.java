/**
 * Mridula Shanker
 * Period 6
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

	@SuppressWarnings("serial")
	public class Ball extends JComponent
		{
			private Ellipse2D.Double ball;
			public Ball()
			{
					ball=new Ellipse2D.Double(20,20,10,10);
			}
			
			public void paintComponent(Graphics g) //this method already exists, we're overriding it
			{
				Graphics2D g2 = (Graphics2D)g;
				g2.fill(ball);
			}
			
		
		}

