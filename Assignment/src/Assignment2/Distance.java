package Assignment2;

import java.util.Scanner;

public class Distance {
	
	float km,m;
	public Distance() {
		super();
		// TODO Auto-generated constructor stub
	}	
	public Distance(float km, float m) {
		super();
		this.km = km;
		this.m = m;
		normalize();
	}
	public void normalize()
	{
		if(m>=1000)
		{
			km+=m/1000;
			m=m%1000;
		}
	}
	public Distance  addDistance(Distance dist2)
	{
		float totalkm=this.km+dist2.km;
		float totalm=this.m+dist2.m;
		return new Distance(totalkm,totalm);
	}

	@Override
	public String toString() {
		return "Distance [km=" + km + ", m=" + m + "]";
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first distance :");
		System.out.println("Enter Kilometer :");
		float km=sc.nextFloat();
		System.out.println("Enter Meter:");
		float m=sc.nextFloat();
		System.out.println("Enter Second distance :");
		System.out.println("Enter Kilometer :");
		float km1=sc.nextFloat();
		System.out.println("Enter Meter:");
		float m1=sc.nextFloat();
		
		Distance dist1= new Distance(km,m);
		Distance dist2= new Distance(km1,m1);
		Distance res=dist1.addDistance(dist2);
		System.out.println("Addition : "+res);
		
		
		
	}
}
