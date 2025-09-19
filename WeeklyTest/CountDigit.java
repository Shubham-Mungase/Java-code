class CountDigit
{
	public static void main(String [] args)
	{
		int num=1286617,digit,cnt=0;
		while(num!=0)
		{
			digit=num%10;
			
				cnt++;
			num=num/10;
		}
		System.out.println("Digit present in the Number is ="+cnt);
		
	}
}