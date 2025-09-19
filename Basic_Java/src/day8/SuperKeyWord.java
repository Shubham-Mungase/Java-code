package day8;
class Abc1{
	int a;

	public Abc1()
	{
		this.a=7;
	}
	public Abc1(int a) {
		this.a = a;
	}
	public void show_abc()
	{
		System.out.println("A="+a);
	}
}
class Xyz1 extends Abc1{
	private int x;

	public Xyz1(int x,int a) {
		super(a);
		this.x = x;
	}
	public Xyz1()
	{
		this.x=10;
	}
	public void show_xyz()
	{
		System.out.println("X="+x);
	}
	
}
public class SuperKeyWord {

	public static void main(String[] args) {
		Xyz1 obj=new Xyz1();
		obj.show_abc();
		obj.show_xyz();
		Xyz1 obj1=new Xyz1(2,3);
		obj1.show_abc();
		obj1.show_xyz();

	}
}
