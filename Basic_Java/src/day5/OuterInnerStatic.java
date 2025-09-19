package day5;


public class OuterInnerStatic {
	private int x=5;
	public void showOuter()
	{
		System.out.println("Wel Come to non static");
	}
	public static void showOuter1()
	{
		System.out.println("Wel come to static ");
	}
	public void display()
	{
		Inner obj1=new Inner();
		obj1.showInner();
		
	}
	static class Inner
	{
		
		//in static class we can not access non static methods or variable
		private int a=7;

		public void showInner() {
			
			//System.out.println("x="+x);
			System.out.println("a="+a);
			//showOuter();
			OuterInnerStatic oinc=new OuterInnerStatic();
			oinc.showOuter();
			showOuter1();
		}
		
	}
	public static void main(String[] args) {
		OuterInnerStatic oinc=new OuterInnerStatic();
		oinc.display();
	}

}
