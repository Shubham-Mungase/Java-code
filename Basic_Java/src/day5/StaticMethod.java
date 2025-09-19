package day5;

public class StaticMethod {

	public static void show()
	{
		System.out.println("Wel come to here");
		msg("Static shree");
		StaticMethod obj=new StaticMethod();
		obj.display();
	}
	private static void msg(String string) {
		System.out.println("msg="+string);
	}
	public void display()
	{
		msg("Shree");
	}
	public static void main(String[] args) {
		show();
		
	}

}
