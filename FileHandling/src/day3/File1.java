package day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fout=new FileOutputStream("G:\\Java-codes\\FileHandling\\src\\day3\\abc.txt");
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
		File f1=new File("G:\\\\Java-codes\\\\FileHandling\\\\src\\\\day3\\\\abc.txt");
		FileInputStream fin=new FileInputStream(f1);
		for(long i=1;i<=f1.length();i++)
		{
			ch=(char)fin.read();
			System.out.println(ch);
		}
		fin.close();
	}
	

}
