class Point9
{
	int x,y;
	public Point9(int a,int b)
	{
		x=a;
		y=b;
		
	}
	public Point9()
	{}
	public void show()
	{
		System.out.println("Point="+x+","+y);
	}
	public static void swap(Point9 a,Point9 b)
	{
		Point9 t=new Point9();
		
		t.x=a.x;
		t.y=a.y;
		a.x=b.x;
		a.y=b.y;
		b.x=t.x;
		b.y=t.y;
	}
	public static void main(String args[])
	{
		Point9 p1=new Point9(9,5);
		Point9 p2=new Point9(30,20);
		System.out.println("Before Swap=");
		p1.show();
		p2.show();
		Point9.swap(p1,p2);
		System.out.println("After Swap=");
		p1.show();
		p2.show();
	}
}
