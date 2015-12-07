package First;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		
		JFrame jrame = new JFrame("HelloEveryone");
		jrame.setSize(500, 500);
		JPanel jpanel = new JPanel();
		jpanel.setBackground(Color.black);
		jpanel.setLayout(null);
		
		JButton jbutton = new JButton();
		jbutton.setBounds(250, 250, 20, 20);
		jbutton.setText("s");

		jbutton.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
				jbutton.setText((String.valueOf(e.getKeyChar())));
				

			}

			public void keyReleased(KeyEvent e) {
			}

			public void keyPressed(KeyEvent e) {
			}
		});

		JButton jbutton2 = new JButton();
		jbutton2.setBounds(280, 250, 20, 20);
		Dimension dimension = new Dimension(20, 20);
		jbutton2.setPreferredSize(dimension);
		jbutton2.setBackground(Color.RED);
		jbutton.setPreferredSize(dimension);
		// ImageIcon defaultIcon=new ImageIcon("xx/ljt.jpg");
		// jbutton.setIcon(defaultIcon);
		jbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Timer timer = new Timer();
				MyTask task = new MyTask();
				task.setjbutton(jbutton);
				timer.schedule(task, 1000, 200);
			}
		});

		jbutton.setBackground(Color.blue);
		jpanel.add(jbutton);
		jpanel.add(jbutton2);
		Container container = jrame.getContentPane();
		container.add(jpanel);
		jrame.setVisible(true);
	}
}

class MyTask extends java.util.TimerTask {
	int second;
	JButton j;

	public void run() {

		String i = j.getText();
		int x=(int) j.getLocation().getX();
		int y=(int) j.getLocation().getY();

		if (i.equals("s")) {
			j.setLocation(x, y+5);
			
		} else if (i.equals("w")) {
			j.setLocation(x, y - 5);

		} else if (i.equals("a")) {
			j.setLocation(x - 5, y);

		} else if (i.equals("d")) {

			j.setLocation(x + 5, y);
			

		}

		// j.setLocation(x, y+5);

		// j.setLocation(x, y+5);

		// j.setLocation(x, y-5);

	};

	public int getsecond() {
		return this.second;
	}

	public void setjbutton(JButton j) {
		this.j = j;
	}
}
