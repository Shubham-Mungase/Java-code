import java.util.*;
class AddFact
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int num,sum=0;
		System.out.println("Enter the Number : ");
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			int fact=1;
			for(int j=1;j<=i;j++)
			{
				fact=fact*j;
			}
			sum=sum+fact;
		}
		
		System.out.println("Sum Of Factorial is ="+sum);
	}
}