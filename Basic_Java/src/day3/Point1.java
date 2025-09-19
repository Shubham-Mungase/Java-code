package day3;

public class Point1 {
//pass value as a parameter
	public static void main(String[] args) {
		int a,b;
		a=5;
		b=6;
		System.out.println("Before Function call");
		System.out.println("a="+a+"\tb="+b);
		setPoint(a,b);
		System.out.println("After Function call");
		System.out.println("a="+a+"\tb="+b);
		
	}

	private static void setPoint(int a, int b) {
		a=a+5;
		b=b+9;
		System.out.println("In Function call");
		System.out.println("a="+a+"\tb="+b);
	}
}
