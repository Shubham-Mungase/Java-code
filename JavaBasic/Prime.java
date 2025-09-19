import java.util.*;
class Prime
{
	public static void main(String args[])
	{
		int n,flag=0,m;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A Number : ");
		n=sc.nextInt();
		m=n/2; 
		if(n==0||n==1)
		{
			System.out.println(n+"is Not A Prime Number");
		}
		else
		{
			for(int i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				System.out.println(n+"is Not A Prime Number");
				
			}
			else
			{
				System.out.println(n+"is A Prime Number");
			}
		}
	}
}