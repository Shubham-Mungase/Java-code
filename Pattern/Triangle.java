/*
			  *
             ***
            *****
           *******
*/
class Triangle
{
	public static void main(String [] args)
	{
			int max=4,star=1;
		for(int i=1;i<=5;i++)
		{
			for(int sp=1;sp<=max;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			max--;
			star++;
			System.out.println();
		}
		
		for(int i=1;i<=4;i++)
		{
			for(int sp=1;sp<=i;sp++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=4;j++)
			{
			System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}