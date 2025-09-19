import java.awt.*;
import javax.swing.*;
public class Smile extends JFrame
{
	Container con;
	public void paint(Graphics g)
	{
		con=getContentPane();
		con.setBackground(Color.red);
		con.setForeground(Color.red);
		Font f=new Font("Times new Roman",Font.BOLD,40);
		g.setFont(f);
		g.drawString("Smile",100,80);
		g.setColor(Color.yellow);
		g.fillOval(95,100,250,250);
		g.setColor(Color.black);
		g.fillOval(150,180,30,30);
		g.fillOval(250,180,30,30);
		g.setColor(Color.white);
		g.fillOval(155,190,10,10);
		g.fillOval(255,190,10,10);
		g.setColor(Color.red);
		g.drawArc(150,200,150,100,0,-180);
	}
	public static void main(String args[])
	{
		Smile d=new Smile();
		d.setVisible(true);
		d.setSize(1000,500);
	}
}
