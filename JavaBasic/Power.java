import java.util.*;
class Power
{
	public static void main(String [] args)
	{
			int num,pow,res=1;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The Number :");
			num=sc.nextInt();
			System.out.println("Enter The Power Of Given Number : ");
			pow=sc.nextInt();
			for(int i=1;i<=pow;i++)
			{
				res=res*num;
			}
			System.out.println("Power Of given Number is ="+res);
		
	}
}