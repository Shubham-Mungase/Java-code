 class Point8
{
	int x,y;
	public void set(int a,int b)
	{
		x=a;
		y=b;
		a=30;
		b=40;
	}
	public void show()
	{
		System.out.println("Point = "+x+" , "+y);
	}
	public static void main(String one[])
	{
		Point8 p1=new Point8();
		int p=20;
		int q=10;
		p1.set(p,q);
		p1.show();
		System.out.println("P="+p);
		System.out.println("Q="+q);
	}
}
