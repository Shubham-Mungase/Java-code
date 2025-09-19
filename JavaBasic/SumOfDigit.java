import java.io.*;
class SumOfDigit
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num,sum=0;
		System.out.println("Enter The Number : ");
		num=Integer.parseInt(br.readLine());
		while(num!=0)
		{
			sum=sum+(num%10);
			num=num/10;
		}
		System.out.println("Addition ="+sum);
	}
}