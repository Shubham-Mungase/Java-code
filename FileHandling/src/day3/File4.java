package day3;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class File4 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fout=new FileOutputStream("G:\\Java-codes\\FileHandling\\src\\day3\\stu.txt");
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
		FileInputStream fin=new FileInputStream("G:\\Java-codes\\FileHandling\\src\\day3\\stu.txt");
		BufferedInputStream bin=new BufferedInputStream(fin);
		Scanner sc=new Scanner(bin);
		String str;
		while(sc.hasNext())
		{
			str=sc.nextLine();
			System.out.println(str);
		}
		
		
	}

}
