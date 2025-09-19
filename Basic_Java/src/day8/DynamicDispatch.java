package day8;
class A{
	public void show()
	{
		System.out.println("I am A");
	}
}
class B extends A{
	public void show()
	{
		System.out.println("I am B");
	}
}
class C extends B{
	public void show()
	{
		System.out.println("I am C");
	}
}

public class DynamicDispatch {
	public static void main(String[] args) {
		
		A obj;
		A a=new A();
		B b=new B();
		C c=new C();
		obj=a;
		obj.show();
		obj=b;
		obj.show();
		obj=c;
		obj.show();
		
	}
}
