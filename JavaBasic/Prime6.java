class Prime6
{
	public static void main(String [] args)
	{
		int i,j,num=2,flag=0;
		for(j=1;j<=10;j++)
		{
			flag=0;
			for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(num+"Number is Not Prime");
		}
		}

	}
}