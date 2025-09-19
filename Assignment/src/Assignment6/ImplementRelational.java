 package Assignment6;

public class ImplementRelational implements Relational{

	int a,b;
	public ImplementRelational(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void greaterThan() {
		// TODO Auto-generated method stub
		System.out.println(a>b?a+"is greater than"+b:+b+"is greater Than"+a);
		
	}

	@Override
	public void lessThan() {
		// TODO Auto-generated method stub
		System.out.println(a<b?a+" is smaller than "+b:+b+" is smaller Than "+a);
		
	}

	@Override
	public void lessThanEqual() {
		if(a<=b)
		{
			System.out.println(a+" Is smaller or equal to "+b);
		}
		else
		{
			System.out.println(b+" Is smaller or equal to "+a);
		}
		
	}

	@Override
	public void greaterThanEqual() {
		if(a>=b)
		{
			System.out.println(a+" Is greater or equal to "+b);
		}
		else
		{
			System.out.println(b+" Is greater or equal to "+a);
		}
		
	}

}
