package recursion;

public class PowerOfNum {
	
	public static void main(String[] args) {
		int num=power(2,10);
		System.out.println("Power ="+num);
	}
	private static int power(int i, int j) {
		if(j==1)
			return i;
		return i*power(i,j-1);
	}

}
