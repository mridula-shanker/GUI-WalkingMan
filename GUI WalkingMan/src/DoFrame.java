import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class DoFrame extends JFrame implements ActionListener
{
	int height;
	int wide;
	
	private JButton doButton;
	
		public DoFrame()
		{
			setBounds(100,100,500,500);
			setLayout(null);
			
			doButton = new JButton("DoButton");
			doButton.setSize(100,100);
			doButton.setLocation(getWidth()/2-doButton.getWidth()/2, getHeight()/2-doButton.getHeight()/2);
			
			add(doButton);
			Timer t1 = new Timer (100, this);
			t1.start();
			
			addKeyListener(new KeyListener()
					{
						public void keyPressed(KeyEvent e) 
						{
							if(e.getKeyCode()== KeyEvent.VK_UP)
							{
								height = 5;
							}
							else if(e.getKeyCode()== KeyEvent.VK_DOWN)
							{
								height=-5;
							}
							if(e.getKeyCode()== KeyEvent.VK_LEFT)
							{
								wide = 5;
							}
							else if(e.getKeyCode()== KeyEvent.VK_RIGHT)
							{
								wide=-5;
							}
						}
						public void keyReleased(KeyEvent e) 
						{
							if(e.getKeyCode()== KeyEvent.VK_UP)
							{
								height = 0;
							}
							else if(e.getKeyCode()== KeyEvent.VK_DOWN)
							{
								height=0;
							}
							if(e.getKeyCode()== KeyEvent.VK_LEFT)
							{
								wide = 0;
							}
							else if(e.getKeyCode()==KeyEvent.VK_RIGHT)
							{
								wide=0;
							}	
						}
						public void keyTyped(KeyEvent arg0) 
						{
						}
					});
			this.setFocusable(true);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		public void actionPerformed(ActionEvent e)
		{
			doButton.setSize(doButton.getWidth()+ wide, doButton.getHeight() + height);
			doButton.setLocation(getWidth()/2-doButton.getWidth()/2, getHeight()/2-doButton.getHeight()/2);
			repaint();
		}
		
		public static void main(String[] args) 
		{
			new DoFrame();
		}
		
}
