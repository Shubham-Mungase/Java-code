package recursion;

public class Fibbonacci {
	
	public static void main(String[] args) {
		System.out.println(fiboo(5));
	}
	
	private static int fiboo(int n) {

		if(n==0 || n==1)
			return n;
		return fiboo(n-2)-fiboo(n-1);	
	}

}
