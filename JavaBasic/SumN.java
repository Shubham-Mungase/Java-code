import java.io.*;
class SumN
{
	public static void main(String []args) throws IOException
	{
		int num,sum=0;
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter How Many Numbers :");
		num=Integer.parseInt(br.readLine());
		for(int i=1;i<=num;i++)
		{
			System.out.print(i+"\t");
			sum=sum+i;
		}
		System.out.println("\n\nSum Of All N Numbers ="+sum);
	}
}