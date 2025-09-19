class WhileFor
{
	public static void main(String [] args)
	{
		
		int i=2;
		while(i<=10)
		{
		for(int j=1;j<=10;j++)
		{
			System.out.print("\t"+i*j);
		}
		System.out.println();
			i++;
		}
	}
}