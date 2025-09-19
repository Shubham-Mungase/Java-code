package Assignment3;

import java.util.Scanner;

public class AddDigitInString {
	
	
	public static int add(String str)
	{
		
			int sum=0;
			char ch;
			boolean flag = false;
			for(int i=0;i<str.length();i++)
			{
				 ch=str.charAt(i);
				 //flag=false;
				if(Character.isDigit(ch))
				{
					flag=true;
					sum=sum+Character.getNumericValue(ch);
				}
			}
			System.out.println("add="+sum);
			if(flag==true)
				return sum;
			else
				return 0;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.next();
		System.out.println("Addition of digits in string is ="+AddDigitInString.add(str));
	}

}
