package basic_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pallindrom {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int num,temp,rev=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Number =");
		num=Integer.parseInt(br.readLine());
		temp=num;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println("Given Number is Pallindrom");
		}
		else
		{
			System.out.println("Given Number is Not Pallindrom");
		}
		
	}

}
