package First;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jrame=new JFrame("HelloEveryone");
		jrame.setSize(500, 500);
		JPanel jpanel=new JPanel();
		jpanel.setBackground(Color.black);
		//github Test
		JButton jbutton=new JButton();
		JButton jbutton2=new JButton();
		Dimension dimension=new Dimension(20, 20);
		jbutton2.setPreferredSize(dimension);
		jbutton2.setBackground(Color.RED);
		jbutton.setPreferredSize(dimension);
//		ImageIcon defaultIcon=new ImageIcon("xx/ljt.jpg");
//		jbutton.setIcon(defaultIcon);
		jbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
          	 Timer timer = new Timer();
          	 MyTask task=new MyTask();
          	 task.setjbutton(jbutton);
          	 timer.schedule(task, 1000, 200);
			}
		});
		jbutton.setBackground(Color.blue);
		jpanel.add(jbutton);
		jpanel.add(jbutton2);
		Container container=jrame.getContentPane();
		container.add(jpanel);
		jrame.setVisible(true);
	}
}
class MyTask extends java.util.TimerTask{
	int second;
	JButton j;
	public void run() {
//		Date date =new Date();
//		this.second=date.getSeconds();
//	 	 System.out.println(second);
		Point p=j.getLocation();
		int x=(int)p.getX();int y=(int)p.getY();

		
		    
			j.setLocation(x, y+5);
		
	
			//j.setLocation(x, y-5);	
			
		
	
	};
	public int getsecond(){
		return this.second;
	}
	public void setjbutton(JButton j){
		this.j=j;
	}
}



