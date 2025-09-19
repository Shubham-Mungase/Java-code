import java.io.*;
class Point
{
	int x,y;
	public Point()
	{
		x=5;
		y=7;
		
	}
	
	public void show()
	{
		System.out.println("x="+x+" , "+y);
	}
	public static void main(String args[])
	{
		Point p = new Point();
		p.show();
	}
}
