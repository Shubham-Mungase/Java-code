class Pattern2
{
	public static void main(String [] args)
	{
		int row=5,col=5;
		for(int i=row;i>=1;i--)
		{
			for(int j=col;j>=1;j--)
			{
				if( i+j>=8)
					System.out.print(" *");
				//else if(i<j)
					//System.out.print(" *");
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}
}