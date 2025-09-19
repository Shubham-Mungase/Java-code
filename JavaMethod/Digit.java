class Digit
{
	static public void addDigit(int n)
	{
		int sum=0;
		while(n>0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		System.out.println("Sum of Digit="+sum);
		
	}
	public static void main(String [] args)
	{
		int num=789;
		addDigit(num);
	}
}