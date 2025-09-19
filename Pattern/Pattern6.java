class pattern6
{
	public static void main(String [] args)
	{
		int star=5;
		for(int r=1;r<=5;r++)
		{
			for(int sp=1;sp<r;sp++)
			{
				System.out.print(" ");
			}
		 for(int c=star;c>=1;c--)
			{
				System.out.print("* ");
			}
			System.out.println();
			star--;
		}
	}
}
