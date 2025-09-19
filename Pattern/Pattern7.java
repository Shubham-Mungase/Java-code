/* ******
    ******
     ******
      ****** */
class Pattern7
{
	public static void main(String []agrs)
	{
		for(int i=1;i<=4;i++)
		{
			for(int sp=1;sp<i;sp++)
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