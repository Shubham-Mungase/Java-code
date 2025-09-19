package day5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class File12 {

	public static void main(String[] args) throws Exception {
		PrintWriter fout =new PrintWriter(new BufferedWriter(new FileWriter("G:\\Java-codes\\FileHandling\\src\\day5\\abc1.txt"),1),true);
		BufferedReader fin =new BufferedReader(new FileReader("G:\\Java-codes\\FileHandling\\src\\day5\\xyz.txt"));
		char ch;
		File f1=new File("G:\\Java-codes\\FileHandling\\src\\day5\\xyz.txt");
		long sz=f1.length();
		for(int i=0;i<=sz;i++)
		{
			ch=(char)fin.read();
			
			if(ch>='A' && ch<='Z')
			{
				ch=Character.toLowerCase(ch);
			}
			else if(Character.isLowerCase(ch))
			{
				ch=Character.toUpperCase(ch);
			}
			fout.write(ch);
		}
		fout.close();
		fin.close();
		System.out.println("After Convert");
		
		BufferedReader br1=new BufferedReader(new FileReader("G:\\Java-codes\\FileHandling\\src\\day5\\abc1.txt"));
		String str;
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
