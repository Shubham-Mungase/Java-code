import java.io.*;
class Complex
{
	private int re,img;
	public void readcomplex()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Real Part : ");
			re=Integer.parseInt(br.readLine());
			System.out.println("Enter Img Part: ");
			img=Integer.parseInt(br.readLine());
			
		}
		catch(IOException e)
		{
			System.out.println("exp : "+e);
			
		}	
	}
	public void show()
	{
		System.out.println("Complex No ="+re+"+"+img+"i");
	} 
	public void add(Complex a,Complex b)
	{
		re=a.re+b.re;
		img=a.img+b.img;
	}
	public static void main(String args[])
	{
		Complex c1=new Complex();
		Complex c2=new Complex();
		Complex c3=new Complex();
		System.out.println("Enter First Complex Number : ");
		c1.readcomplex();
		System.out.println("Enter Second Complex Number : ");
		c2.readcomplex();
		c3.add(c1,c2);
		c3.show();
	}
}
