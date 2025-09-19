import java.util.*;
class Prime3
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int num,flag=0,div=2;
		System.out.println("Enter a Number : ");
		num=sc.nextInt();
		while(div<num)
		{
			if(num%div==0)
			{
				flag=1;
				break;
			}
			div++;
		}
		if(flag==1)
		{
			System.out.println("Number not is Prime");
		}
		else
		{
			System.out.println("Number is Prime");
		}
	}
}