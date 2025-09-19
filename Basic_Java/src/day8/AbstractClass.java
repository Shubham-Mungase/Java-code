package day8;

abstract class Abc3{
	int a;

	public Abc3(int a) {
		super();
		this.a = a;
	}
	public void display_abc()
	{
		System.out.println("I am in abstact class concrete method");
	}
	abstract public void show();
	
}
class Xyx3 extends Abc3{

	public Xyx3(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	public void display_xyz()
	{
		System.out.println("I am xyz class concrete method");
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("I am show in deriverd class");
	}
	
}
public class AbstractClass {

	public static void main(String[] args) {
		Xyx3 obj=new Xyx3(10);
		obj.display_abc();
		obj.display_xyz();
		obj.show();
	}
}
