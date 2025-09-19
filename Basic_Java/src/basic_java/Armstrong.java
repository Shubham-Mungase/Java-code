package basic_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Armstrong {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int num,temp,i=1,rev=0,ct=0,res=1;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Number =");
		num=Integer.parseInt(br.readLine());
		temp=num;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
			ct++;
		}
		for(i=1;i<=ct;i++)
		{
			res=res*num;
		}
		
	}
}
