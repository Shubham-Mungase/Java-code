import java.io.*;
class AreaOfCircle
{
	public static void main(String [] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double radius,area;
		double PI=3.14;
		System.out.println("Enter The Radius : ");
		radius=Integer.parseInt(br.readLine());
		area=PI*(radius*radius);
		System.out.println("Area of Circle = "+area);
	}
}