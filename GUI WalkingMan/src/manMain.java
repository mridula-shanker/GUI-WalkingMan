/**
 * Mridula Shanker
 * Period 6
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.Timer;

public class manMain extends JFrame implements ActionListener {

	Man person = new Man(10, 10);
	ArrayList<Ball> balls = new ArrayList<Ball>();
	

	public manMain() {
 		setLayout(null);
		setBounds(100, 100, 600, 600);// X,Y,Width,Height

		add(person);
		person.setLocation(300, 300);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Timer t1 = new Timer(10, this);
		t1.start();

		addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				{

					if (e.getKeyCode() == KeyEvent.VK_LEFT) {
						// person.setLocation(person.getX()-3,
						// person.getLocation().y);
						person.setDx(-3);
						if (person.getX() <= 0) {
							person.setDx(0);
						}
					}

					if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
						// person.setLocation(person.getX()+3,
						// person.getLocation().y);
						person.setDx(3);
						if (person.getX() >= 549) {
							person.setDx(0);
						}
					}

					if (e.getKeyCode() == KeyEvent.VK_UP) {
						// person.setLocation(person.getLocation().x,
						// person.getY()-3);
						person.setDy(-3);
						if (person.getY() <= 0) {
							person.setDy(0);
						}
					}

					if (e.getKeyCode() == KeyEvent.VK_DOWN) {
						// person.setLocation(person.getLocation().x,
						// person.getY()+3);
						person.setDy(3);
						if (person.getY() >= 514) {
							person.setDy(0);
						}
					}
				}

			}
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					person.setDx(0);
				}

				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					person.setDx(0);
				}

				if (e.getKeyCode() == KeyEvent.VK_UP) {
					person.setDy(0);
				}

				if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					person.setDy(0);
				}
				

			}
			
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(e.getKeyChar() == ' ') 
				{
					Ball ball1 = new Ball();
					ball1.setBounds(100, 100, 600, 600);
					ball1.setLocation(person.getX(), person.getY());
					add(ball1);
					balls.add(ball1);
				}
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		person.update();
		repaint();
		
		for(Ball b : balls) 
		{
			b.setLocation(b.getLocation().x + 10, b.getLocation().y);
		}


		if (person.getX() <= 0) {
			person.setDx(0);
		}

		if (person.getX() >= 549) {
			person.setDx(0);
		}

		if (person.getY() <= 0) {
			person.setDy(0);
		}

		if (person.getY() >= 514) {
			person.setDy(0);
		}
	}

	public static void main(String[] args) {
		new manMain();
	}

}
