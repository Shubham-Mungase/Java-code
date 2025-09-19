import java.util.*;
class Perfect 
{
	public static void main(String [] args)
	{
		int num,div=1,sum=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		num=sc.nextInt();
		temp=num;
		while(div<num)
		{
			if(num%div==0)
			{
				sum=sum+div;
			}
			div++;
		}
		if(sum==temp)
		{
			System.out.println("This is Perfect Number ");
		}
		else
		{
			System.out.println("This Is Not Perfect number ");
		}

	}
}