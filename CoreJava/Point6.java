class Point6
{
	int x,y;
	public Point6()
	{
		x=5;
		y=7;
	}
	public void show()
	{
		System.out.println("Point="+x+","+y);
	}
	public static void main(String one[])
	{
		Point6 p=new Point6();
		p.show();
	}
}
