package day4;

public class MethodOverloading {

	
	public static void main(String[] args) {
		
	System.out.println("Addition of 2 int="+add(2,3));
		System.out.println("Addition of 2 float="+add(5.5f,2.2f));
		System.out.println("Addition of 1 float 1 int="+add(5.5f,8));;
		System.out.println("Addition of 3 int="+add(3,5,4));
	}

	private static int add(float i, int j) {
		// TODO Auto-generated method stub
		return (int) (i+j);
	}

	private static int add(int i, int j, int k) {
		// TODO Auto-generated method stub
		return i+j+k;
		
	}

	private static float add(float f, float g) {
		// TODO Auto-generated method stub
		return f+g;
		
	}

	private static int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
		
	}
}
