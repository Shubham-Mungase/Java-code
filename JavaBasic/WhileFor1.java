class WhileFor1
{
	public static void main(String [] args)
	{
		
		int i=1;
		while(i<=10)
		{
		for(int j=2;j<=10;j++)
		{
			System.out.print("\t"+i*j);
		}
		System.out.println();
			i++;
		}
	}
}