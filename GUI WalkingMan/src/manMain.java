import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class manMain extends JFrame implements ActionListener {
	Man person = new Man(10, 10);
	// ArrayList<Ball> balls = new ArrayList<Ball>();
	

	public manMain() {
		JFrame myFrame = new JFrame();
		myFrame.setLayout(null);
		myFrame.setBounds(100, 100, 600, 600);// X,Y,Width,Height

		myFrame.add(person);
		person.setLocation(300, 300);
		final Ball ball1 = new Ball();
		myFrame.add(ball1);
		

		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Timer t1 = new Timer(10, this);
		t1.start();

		myFrame.addKeyListener(new KeyListener() {

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
					if (e.getKeyCode() == KeyEvent.VK_SPACE) {
						ball1.setBounds(70, 70, 100, 100);
						//int pos =0;
						//while(pos<=70){
							ball1.setLocation(person.getX()+10,person.getY());
							ball1.update();
							//pos++;
						//}//repaint();
					}
				}

			}

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

			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

	}

	public void actionPerformed(ActionEvent arg0) {
		person.update();
		repaint();

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
