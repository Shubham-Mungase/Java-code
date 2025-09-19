package day8;

class Abc{
	
	public void display_abc()
	{
		System.out.println("I am display in abc");
	}
	public void show()
	{
		System.out.println("I am show in abc");
	}
}
class Xyz extends Abc{
	
	public void display_xyz()
	{
		System.out.println("I am display in XYZ");
	}
	@Override
	public void show()
	{
		super.show();
		System.out.println("I am show in XYZ");
		
	}
}
public class Overriding {
	public static void main(String[] args) {
		
		Xyz obj=new Xyz();
		obj.display_abc();
		obj.display_xyz();
		obj.show();
		
	}
}
