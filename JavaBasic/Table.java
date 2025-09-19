class Table
{
	public static void main(String []args)
	{
		int num=2,i=1,mul;
		while(num<=10)
		{
			i=1;
			while(i<=10)
			{
				mul=num*i;
				System.out.print("\t"+mul);
				i++;
			}
			System.out.println("\n");
			num++;
		}
		
	}
}