import java.util.*;
class Fibo
{
	public static void main(String [] args)
	{
		int n1=0,n2=1,n3,N;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:");
		N=sc.nextInt();
		System.out.print(n1+"\t");
		for(int i=2;i<=N;i++)
		{
			n3=n1+n2;
			System.out.print( n3+"\t");
			n1=n2;
			n2=n3;
		}
	}
}