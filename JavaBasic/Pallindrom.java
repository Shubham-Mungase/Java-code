import java.util.*;
class Pallindrom
{
	public static void main(String args[])
	{
		int num,X,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		num=sc.nextInt();
		X=num;
		while(num!=0)
		{
			sum=(sum*10)+num%10;
			num=num/10;
		}
		if(X==sum)
		{
			System.out.println("Number Is Pallindrom");
		}
		else
		{
			System.out.println("Number  Not Is Pallindrom");		
		}	
	}
}