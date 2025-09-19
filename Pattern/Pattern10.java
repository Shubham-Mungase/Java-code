class Pattern10
{
	public static void main(String [] args)
	{
		for(int r=1;r<=10;r++)
		{
			for(int c=1;c<=r;c++)
			{
				if(c==1 || c==r || r==10)
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