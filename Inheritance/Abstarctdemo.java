abstract class Baseabst
{
	abstract public void show();
	public void show1()
	{
		System.out.println("Welcome to abstract class");
	}
}
class Derivedabst extends Baseabst
{
	public void show()
	{
		System.out.println("derived abstract class");
	}
	public void show2()
	{
		System.out.println("Welcome");
	}
}	
class Abstarctdemo
{
	static public void main(String args[])
	{
		Derivedabst obj=new Derivedabst();
		obj.show();
		obj.show1();
		obj.show2();
	}
}
