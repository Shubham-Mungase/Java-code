import java.util.*;
class Pattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int row,col;
		System.out.print("Enter How Many Rows :");
		row=sc.nextInt();
		System.out.print("Enter How Many Col :");
		col=sc.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(" *"); 
			}
			System.out.println();
		}
	}
}
