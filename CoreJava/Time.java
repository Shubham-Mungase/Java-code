import java.io.*;
class Time
{
	private int ss,mm,hh;
	public void settime()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter hours :");
			hh=Integer.parseInt(br.readLine());
			System.out.println("Enter Minutes:");
			mm=Integer.parseInt(br.readLine());
			System.out.println("Enter Second :");
			ss=Integer.parseInt(br.readLine());
		}
		catch(IOException e)
		{
			System.out.println("exp="+e);
		}
	}
	public void showtime()
	{
		System.out.println("Time = "+hh+":"+mm+":"+ss);
	}
	public void add(Time a,Time b)
	{
		mm=hh=0;
		ss=a.ss+b.ss;
		if(ss>=60)
		{
			mm=ss/60;
			ss=ss%60;
		}
		mm=a.mm+b.mm+mm;
		if(mm>=60)
		{
			hh=mm/60;
			mm=mm%60;
		}
		hh=a.hh+b.hh+hh;
	}
	public void sub(Time a,Time b)
	{
		if(a.ss<b.ss)
		{
			a.mm=a.mm-1;
			a.ss=a.ss+60;
		}
		ss=a.ss-b.ss;
		if(a.mm<b.mm)
		{
			a.hh=a.hh-1;
			a.mm=a.mm+60;
		}
		mm=a.mm-b.mm;
		hh=a.hh-b.hh;
	}
	public static void main(String args[])
	{
		Time t1=new Time();
		Time t2=new Time();
		Time t3=new Time();
		int choice;
		BufferedReader br;
		try
		{
			br=new BufferedReader(new InputStreamReader(System.in));
			do
			{
				System.out.println("1.Add of Time");
				System.out.println("2.Sub of Time");
				System.out.println("3.Exit");
				System.out.println("Enter Your choice :");
				choice=Integer.parseInt(br.readLine());
				switch(choice)
				{
					case 1:
						System.out.println("Enter first time : ");
						t1.settime();
						System.out.println("Enter Second time : ");
						t2.settime();
						t3.add(t1,t2);
						System.out.println("Addition of Time is = ");
						t3.showtime();
						break;
					case 2:
						System.out.println("Enter first time : ");
						t1.settime();
						System.out.println("Enter Second time : ");
						t2.settime();
						t3.sub(t1,t2);
						System.out.println("Subtraction of Time is = ");
						t3.showtime();
						break;
					case 3:
						break;		
				}
			}while(choice!=3);
		}
		catch(IOException e)
		{
			System.out.println("exp="+e);
		}
	}
}
