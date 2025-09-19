import java.util.*;
abstract cube
{
	 int methodcube();
}
class Cube implements cube
{
	public int methodcube(int n)
	{
		return (n*n*n);
	}
	public static void main(String [] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		Cube obj=new Cube();
		System.out.println("Enter a Number : ");
		n=sc.nextInt();
		obj.methodcube(n);
	}
}
