import java.io.*;
class Maximum3
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a,b,c;
		System.out.println("Enter First Number :");
		a=Integer.parseInt(br.readLine());
		System.out.println("Enter Second Number :");
		b=Integer.parseInt(br.readLine());
		System.out.println("Enter Third Number :");
		c=Integer.parseInt(br.readLine());
		if(a>b && a>c)
		{
			System.out.println("First Number is maximum");
		}
		else if (b>c && b>a)
		{
			System.out.println("Second Number is maximum");
		}
		else if(c>a && c>b)
		{
			System.out.println("Third Number is maximum");
		}
		else
		{
			System.out.println("All Number is Equal");
		}
	}
}