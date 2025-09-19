import java.util.*;
class Vovel
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		String str;
		char ch;
		System.out.println("Enter Character :");
		str=sc.next();
		ch=str.charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("Char is Vowel");
		}
		else
		{
			System.out.println("Char is Consonent");
		}
	}
}
