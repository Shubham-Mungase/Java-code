import java.util.*;
class Factorial
{
	static int facto(int num)
	{
	   int fact=1;
		while(num!=0)
		{
			fact=fact*num;
			num--;
		}
		return fact;
		}
	public static void main(String [] args)
	{
		/*int num,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		num=sc.nextInt();
		while(num!=0)
		{
			fact=fact*num;
			num--;
			
		}
		System.out.println("Factorial ="+fact);
		*/
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		num=sc.nextInt();
		System.out.println("Factorial ="+facto(num));
	}
}