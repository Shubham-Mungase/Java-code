class Base2
{
	public void show()
	{
		System.out.println("I am base");
		
	}
}
class Deriverd2 extends Base2
{
	public void show()
	{
		super.show();
		System.out.println("I am Derived 2");
		
	}
}
class Deriverd21 extends Deriverd2
{
	public void show()
	{
		super.show();
		System.out.println("I am Derived 21");
		
	}
}
class Methodoverriding2
{
	public static void main(String[] args)
	{
		Deriverd21 obj=new Deriverd21();
		obj.show();
	}
}
