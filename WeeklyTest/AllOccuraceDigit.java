class AllOccuraceDigit
{
	public static void main(String [] args)
	{
		int num=122246,onum=2,digit,cnt=0;
		while(num!=0)
		{
			digit=num%10;
			num=num/10;
			if(digit==onum)
				cnt++;
		}
		System.out.println(onum+" Digit Occurres  "+cnt);
		
	}
}