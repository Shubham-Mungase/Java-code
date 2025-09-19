import java.util.*;
class Gread
{
	public static void main(String [] args)
	{
		int m1,m2,m3,m4,m5,total;
		float per;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter m1 Mark :");
		m1=sc.nextInt();
		System.out.println("Enter m2 Mark :");
		m2=sc.nextInt();
		System.out.println("Enter m3 Mark :");
		m3=sc.nextInt();
		System.out.println("Enter m4 Mark :");
		m4=sc.nextInt();
		System.out.println("Enter m5 Mark :");
		m5=sc.nextInt();
		total=m1+m2+m3+m4+m5;
		System.out.println("Total"+total);
		per=(float)(total/5);
		System.out.println("Percentage"+per);
		
		if(per<50)
		{
			System.out.println("Fail");
		}
		else
		{
			if(per>=50 && per<60)
			{
				System.out.println("Pass");
			}
				else
				{
					if(per>=60 && per<70)
					{
						System.out.println("Second Class");
					}
					else
					{
						if(per>=70 && per<80)
						{
							System.out.println("First Class");
						}
						else
						{
							if(per>=80 && per<90)
							{
								System.out.println("Distinction");
							}
							else
							{
								System.out.println("Merit Holder");
							}
						}
					}
				}
		
		}
	}
}