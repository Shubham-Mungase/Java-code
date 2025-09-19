import java.io.*;
class EvenOdd
{
	public static void main(String []args) throws IOException
	{
		int num;
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number: ");
		num=Integer.parseInt(br.readLine());
		if(num%2==0)
		{
			System.out.println("Number is Even");
			
		}
		else if(num%2!=0)
		{
			System.out.println("Number is Odd");
		}
		else 
		{
			System.out.println("Number is zero");
		}
	}
}