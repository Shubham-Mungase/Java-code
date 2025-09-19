package threading;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MainJFrame1 extends JFrame implements Runnable{

	JFrame actualWindow;
	JPanel lightsContainer;
	Color b1,b2,b3;
	Thread t=null; 
	Container con;
	public MainJFrame1()
	{
		con=getContentPane();
		b1=Color.red;
		b2=Color.gray;
		b3=Color.gray;
		t=new Thread(this);
		t.start();
	}
	public void paint(Graphics g)
	{
		con=getContentPane();
		g.setColor(b1);
		g.fillOvel(100,100,100,100);
		g.setColor(b2);
		g.fillOvel(100,250,100,100);
		g.setColor(b3);
		g.fillOvel(100,400,100,100);
	}
	@Override
	public void run() {
		
	}
	
}
public class TrafficLight1 {

}
