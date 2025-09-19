import java.util.*;
class EvenOddSum
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int num,evenSum=0,oddSum=0,allSum;
		System.out.println("Enter Rage OF Number : ");
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				evenSum=evenSum+i;
			}
			else
			{
				oddSum=oddSum+i;
			}
		}
		System.out.println("Even Number Sum="+evenSum);
		System.out.println("Odd Number Sum="+oddSum);
		allSum=evenSum+oddSum;
		System.out.println("Sum Of All Number="+allSum);
	}
}