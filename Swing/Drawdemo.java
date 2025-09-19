import java.awt.*;
import javax.swing.*;
public class Drawdemo extends JFrame
{
	Container con;
	public void paint(Graphics g)
	{
		con=getContentPane();
		con.setBackground(Color.yellow);
		con.setForeground(Color.red);
		Font f=new Font("Times new Roman",Font.BOLD,40);
		g.setFont(f);
		g.drawString("Different Shape",250,50);
		g.drawLine(250,50,350,50);
		g.drawRect(100,60,100,100);
		g.fillRect(300,60,100,100);
		g.setColor(Color.blue);
		g.drawOval(100,170,100,100);
		g.drawRoundRect(450,170,100,100,10,10);
		Color c=new Color(200,250,100);
		g.setColor(c);
		g.fillOval(300,170,100,100);
		g.setColor(Color.red);
		g.drawArc(30,280,200,200,0,90);
		int x[]={300,350,300,250,200};
		int y[]={280,340,400,400,340};
		g.drawPolygon(x,y,5);
		g.fillPolygon(x,y,5);
		
	}
	public static void main(String args[])
	{
		Drawdemo d=new Drawdemo();
		d.setVisible(true);
		d.setSize(1000,500);
	}
}
