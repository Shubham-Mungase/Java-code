import java.util.*;
class Square
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int base,pow,res=1;
		System.out.println("Enter Base :");
		base=sc.nextInt();
		System.out.println("Enter Pow :");
		pow=sc.nextInt();
		while(pow!=0)
		{
			res=res*base;
			pow--;
		}
		System.out.println("Square of Given Number = "+res);
		
		
	}
}