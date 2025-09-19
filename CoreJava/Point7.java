class Point7
{
	int x,y;
	public Point7(int a,int b)
	{
		x=a;
		y=b;
	}
	public void show()
	{
		System.out.println("Point = "+x+" , "+y);
	}
	public static void main(String one[])
	{
		Point7 p=new Point7(8,9);
		p.show();
	}
}
