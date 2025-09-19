class Prime5
{
	public static void main(String [] args)
	{
		int i,num=4,flag=0;
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Number is Not Prime");
		}
		else
			System.out.println("Number is Prime");

	}
}