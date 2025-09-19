/*
	******
   ******
  ******
 ****** */
class Pattern8
{
	public static void main(String []agrs)
	{
		for(int i=4;i>=1;i--)
		{
			for(int sp=i;sp>=1;sp--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}