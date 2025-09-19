import java.io.*;
class PositiveNegative
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num;
		System.out.println("Enter number : ");
		num=Integer.parseInt(br.readLine());
		if(num==0)
		{
			System.out.println("Number is Zero");
		}
		else if (num>0)
		{
			System.out.println("Number is Positive");
		}
		else if(num<0)
		{
			System.out.println("Number is Negative");
			
		}
		
	}
}