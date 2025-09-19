package day5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class File11 {
	
	public static void main(String[] args) throws IOException {
		PrintWriter pout=new PrintWriter(new BufferedWriter(new FileWriter("G:\\Java-codes\\FileHandling\\src\\day5\\abc.txt",true),1),true);
		BufferedReader br =new BufferedReader(new FileReader("G:\\Java-codes\\FileHandling\\src\\day5\\xyz.txt"));
		String str;
		do {
			str=br.readLine();
			if(str==null)
			{
				break;
				
			}
			pout.println(str);
		}while(true);
		pout.close();
		BufferedReader br1=new BufferedReader(new FileReader("G:\\Java-codes\\FileHandling\\src\\day5\\abc.txt"));
		System.out.println("After Copy");
		do
		{
			str=br1.readLine();
			if(str==null)
			{
				break;
			}
			System.out.println(str);
		}while(true);
	}

}
