import java.io.*;
class Complex2
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
	public Complex2 add(Complex2 b)
	{
		Complex2 c=new Complex2();
		c.re=re+b.re;
		c.img=img+b.img;
		return(c);
	}
	public static void main(String args[])
	{
		Complex2 c1=new Complex2();
		Complex2 c2=new Complex2();
		Complex2 c3;
		System.out.println("Enter First Complex Number : ");
		c1.readcomplex();
		System.out.println("Enter Second Complex Number : ");
		c2.readcomplex();
		c3=c1.add(c2);
		c3.show();
	}
}
