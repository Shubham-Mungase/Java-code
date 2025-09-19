import java.io.*;
class Expdemo2
{
	public static void main(String args[]) throws IOException,NumberFormatException,ArithmeticException
	{
		int a,b,c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter 1st value:");
			a=Integer.parseInt(br.readLine());
			System.out.println("Enter 2nd value:");
			b=Integer.parseInt(br.readLine());
			c=a/b;
			System.out.println("Result ="+c);
	}
	
}
