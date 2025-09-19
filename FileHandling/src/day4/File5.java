package day4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File5 {
	public static void main(String[] args) throws IOException {
		FileWriter fout=new FileWriter("G:\\Java-codes\\FileHandling\\src\\day4\\abc.txt");
		System.out.println("Enter Info Of File And * at the End :");
		char ch;
		do {
			ch=(char)System.in.read();
			if(ch=='*')
			{
				break;
			}
			fout.write(ch);
			
		}while(true);
		fout.close();
		//char ch;
		File f1=new File("G:\\Java-codes\\FileHandling\\src\\day4\\abc.txt");
		FileReader fin=new FileReader(f1);
		for(long i=1;i<=f1.length();i++)
		{
			ch=(char)fin.read();
			System.out.println(ch);
		}
		fin.close();
	}
	

}
