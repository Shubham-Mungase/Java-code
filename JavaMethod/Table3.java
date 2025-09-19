class Table3
{
	public static void table(int n)
	{
		for(;n<=10;n++)
		{
			for(int i=2;i<=10;i++)
			{
				System.out.print("\t"+i*n);
			}
			System.out.println();
		}	
	}
	
	public static void main(String [] args)
	{
	
		int num=1;
		table(num);
		
	}
}