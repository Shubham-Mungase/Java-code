package tybcs;

public class Maximum {
	
	public static int max(int a,int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	public static int max(int a,int b,int c)
	{
		if(a>b && a>c)
			return a;
		else if(b>c)
			return b;
		else 
			return c;
	}
	

}
