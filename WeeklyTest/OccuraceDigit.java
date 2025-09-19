class OccuraceDigit
{
	public static void main(String [] args)
	{
		int num=1234706,num2=0,onum=6,sum=0,digit,cnt=1;
		while(num!=0)
		{
			sum=sum*10+num%10;
			num=num/10;
		}
		System.out.println("Sum"+sum);
		num2=sum;
		while(num2!=0)
		{
			digit=num2%10;
			num2=num2/10;
			if(digit!=onum)
				cnt++;
			else
				break;
		}
		
		System.out.println(onum+" Digit Occurred At "+cnt);
		
	}
}