class Pattern11
{
	public static void main(String [] args)
	{
		for(int r=10;r>=1;r--)
		{
			for(int c=1;c<=10;c++)
			{
				if(r==1 || c==r || c==10)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}