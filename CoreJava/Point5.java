class Point5
{
	int x,y;
	public void set(int a,int b)
	{
		x=a;
		y=b;
	}
	public void show()
	{
		System.out.println("Point = "+x+","+y);
	}
	public static void main(String args[])
	{
		Point5 p1=new Point5();
		p1.set(4,5);
		p1.show();
		Point5 p2=p1;
		p2.show();
		System.out.println("After Change");
		p2.set(7,9);
		p1.show();
	}
}
