import java.io.*;
class Vowel extends Exception
{
	char v;
	Vowel(char ch)
	{
		v=ch;
	}
	public String toString()
	{
		return("Invalid char :It is vowel ="+v);
	}
}
class Space extends Exception
{
	char s;
	Space(char ch)
	{
		s=ch;
	}
	public String toString()
	{
		return("Invalid char :It is white or blank Space ="+s);
	}
}
class ExitExp extends Exception
{
	
	public String toString()
	{
		return("Program is ready to Exit ");
	}
}
class Expdemo4
{
	public static void main(String [] args)
	{
		char ch;
		ch=(args[0].charAt(0));
		try
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				throw new Vowel(ch);
			}
			else if(ch==' ')
			{
				throw new Space(ch);
			}
			else if(ch=='X')
			{
				throw new ExitExp();
			}
			System.out.println("Valid char ="+ch);
		}
		/*catch(IOException e)
		{
			System.out.println("Exp="+e);
		}*/
		catch(Vowel e)
		{
			System.out.println("Exp="+e);
		}
		catch(Space e)
		{
			System.out.println("Exp="+e);
		}
		catch(ExitExp e)
		{
			System.out.println("Exp="+e);
		}
	}
}

