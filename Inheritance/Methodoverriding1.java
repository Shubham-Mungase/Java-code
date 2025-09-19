class Base1
{
	public void show()
	{
		System.out.println("I am base");
		
	}
}
class Deriverd1 extends Base1
{
	public void show()
	{
		super.show();
		System.out.println("I am Derived");
		
	}
}
class Methodoverriding1
{
	public static void main(String[] args)
	{
		Deriverd1 obj=new Deriverd1();
		obj.show();
	}
}
