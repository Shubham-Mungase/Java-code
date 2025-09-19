class Table5
{
	public static void main(String [] args)
	{
		int i=2,j=1;
		while(i<=10)
		{
			j=1;
			while(j<=10)
			{
				System.out.print("\t"+j*i);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}