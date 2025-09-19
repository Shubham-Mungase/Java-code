import java.util.*;
class Perfect2 
{
	public static void main(String [] args)
	{
		int num=1,div=1,sum=0,temp,maxP,pCnt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		maxP=sc.nextInt();
		temp=num;
		while(pCnt<maxP)
		{
			div=1;sum=0;
		while(div<num)
		{
			if(num%div==0)
			{
				sum=sum+div;
			}
			div++;
		}
		if(sum==num)
		{
			System.out.print(" "+sum);
			pCnt++;
		}
	num++;
		}
	}
}