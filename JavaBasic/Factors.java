import java.io.*;
class Factors
{
	public static void main(String [] args ) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int num;
		System.out.println("Enter the Number : ");
		num=Integer.parseInt(br.readLine());
		System.out.print("Factor of Given Number = ");
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print("\t"+i);
			}
		}
	}
}