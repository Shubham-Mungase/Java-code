package day3;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class File3 {
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
		//DataInputStream dis=new DataInputStream(fin);
		Scanner sc=new Scanner(fin);
		String str;
//		do
//		{
//			str=dis.readLine();
//			//str=sc.nextLine();
//			if(str==null)
//				break;
//			System.out.println(str);
//		}while(true);
		
		while(sc.hasNext())
		{
			str=sc.nextLine();
			System.out.println(str);
		}
		fin.close();
		//dis.close();
		sc.close();
	}
	

}
