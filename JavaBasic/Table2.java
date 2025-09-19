class Table2
{
	public static void main(String [] args)
	{
		int num=1,i=2,mul;
		while(num<=10)
		{
			i=2;
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