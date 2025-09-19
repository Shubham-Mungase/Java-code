class Point2
{
	int x,y;
	public Point2(int a,int b)
	{
		x=a;
		y=b;
	}
	public void show()
	{
		System.out.println("x="+x+" , "+y);
	}
	public static void main(String args[])
	{
		Point2 p =new Point2(4,5);
		p.show();
		Point2 p1=new Point2(3,5);
		p1.show();
	}
}
