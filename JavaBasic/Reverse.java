import java.io.*;
class Reverse
{
	public static void main(String [] args) throws IOException
	{
		long num=0l,sum=0l;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number : ");
		num=Integer.parseInt(br.readLine());
		while(num!=0)
		{
			sum=(long)(sum*10+num%10);
			num=num/10;
			
		}
		System.out.print("Reverse Number = "+sum);
	}
}