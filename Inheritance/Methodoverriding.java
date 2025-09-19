class Base
{
	public void show()
	{
		System.out.println("I am base");
		
	}
}
class Deriverd extends Base
{
	public void show()
	{
		System.out.println("I am Derived");
		
	}
}
class Methodoverriding
{
	public static void main(String args[])
	{
		Deriverd obj=new Deriverd();
		obj.show();
	}
}
