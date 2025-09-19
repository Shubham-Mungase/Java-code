package recursion;

public class AdditionOfNnumber {
	
	public static int add(int n)
	{
		if(n==1)
		return 1;
		else
			return n+add(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println("Addition="+add(10));
		
	}

}
