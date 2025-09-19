class Table2
{
	public static void table(int n)
	{
		for(;n<=10;n++)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.print("\t"+i*n);
			}
			System.out.println();
		}	
	}
	
	public static void main(String [] args)
	{
	
		int num=2;
		table(num);
		
	}
}