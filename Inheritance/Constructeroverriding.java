class Base3
{
	int x,y;
	public Base3(int a, int b)
	{
		x=a;
		y=b;
	}

	public void show()
	{
		System.out.println("X="+x);
		System.out.println("Y="+y);
	}
}
class Derived4 extends Base3
{
	int z;
	public Derived4(int a,int b,int c)
	{
		super(a,b);
		z=c;
	}
	public void show1()
	{
		System.out.println("Z="+z);
	}
}
class Constructeroverriding
{
	public static void main(String[] args)
	{
		Derived4 obj=new Derived4(2,3,4);
		obj.show();
		obj.show1();
	}
}
