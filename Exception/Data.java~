import java.io.*;
class DayExp extends Exception
{
	int d;
	DayExp(int x)
	{
		d=x;
	}
	public String toString()
	{
		return("Invalid day i.e="+d);
	}
}
class MonthExp extends Exception
{
	int d;
	MonthExp(int x)
	{
		d=x;
	}
	public String toString()
	{
		return("Invalid month i.e="+d);
	}
}
class Date
{
	public static void main(String args[])
	{
		int dd,mm,yy;
		int m[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter day");
			dd=Integer.parseInt(br.readLine());
			System.out.println("Enter month");
			mm=Integer.parseInt(br.readLine());
			System.out.println("Enter year");
			yy=Integer.parseInt(br.readLine());
			if(yy%4==0&&yy%100!=0 || yy%400==0)
			{
				m[2]=29;
			}
			if(mm>12||mm<=0)
			{
				throw new MonthExp(mm);
			}
			if(dd>m[mm]||dd<=0)
			{
				throw new DayExp(dd);
			}
			System.out.println("Date ="+dd+"\\"+mm+"\\"+yy);
		}
		catch(IOException e)
		{
			System.out.println("Exp"+e);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Exp"+e);
		}
		catch(DayExp e)
		{
			System.out.println("Exp"+e);
		
		}
		catch(MonthExp e)
		{
			System.out.println("Exp"+e);
		}		
	}
}
