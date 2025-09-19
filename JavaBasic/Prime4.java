import java.util.*;
class Prime3
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int from,limit,flag=0,div=2,primeCnt=0;
		System.out.println("Enter The From: ");
		from=sc.nextInt();
		System.out.println("Enter The limit: ");
		limit=sc.nextInt();
	while(primeCnt<limit)	
	{
		div=2;
		flag=0;
		while(div<from)
		{
			if(from%div==0)
			{
				flag=1;
				break;
			}
			div++;
			
		}
		if(flag==0)
		{
			System.out.print(" "+from);
			primeCnt++;
		}
		from++;
	}
	}
}