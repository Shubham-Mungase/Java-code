import java.io.*;
class Prime2
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int from ,to;
		//System.out.println("Enter Number From :");
		//from=Integer.parseInt(br.readLine());
		System.out.println("Enter Number To :");
		to=Integer.parseInt(br.readLine());
		if(to<2)
		{
			System.out.println("Enter Number above From 2 ");
		}
		else
		{
			for(int i=2;i<=to;i++)
			{
				if(to%i==0)
				{
					System.out.println(i+"\t");
				}
			}
		}
		
	}
}