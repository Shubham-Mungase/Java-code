package day4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class File9 {
	public static void main(String[] args) throws IOException{
		char ch;
		FileWriter fout=new FileWriter("G:\\Java-codes\\FileHandling\\src\\day4\\jkl.txt");
		BufferedWriter bout=new BufferedWriter(fout);
		PrintWriter pout=new PrintWriter(fout,true);
		System.out.println("Enter INfo And Stop at the end");
		do {
			ch=(char)System.in.read();
			if(ch=='*')
			{
				break;
			}
			fout.write(ch);
			
		}while(true);
		fout.close();
		File f1=new File("G:\\Java-codes\\FileHandling\\src\\day4\\jkl.txt");
		FileReader fin=new FileReader("G:\\Java-codes\\FileHandling\\src\\day4\\jkl.txt");
		BufferedReader br1=new BufferedReader(fin);
		for(long i=1;i<=f1.length();i++)
		{
			ch=(char)fin.read();
			System.out.println(ch);
		}
		fin.close();
		

	}


}
