package day3;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class File2 {
	public static void main(String[] args) throws Exception{
		FileOutputStream fout=new FileOutputStream("G:\\Java-codes\\FileHandling\\src\\day3\\pqr.txt");
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
		
		FileInputStream fin =new FileInputStream("G:\\Java-codes\\FileHandling\\src\\day3\\pqr.txt");
		BufferedInputStream bin=new BufferedInputStream(fin);
		long sz=fin.available();
		for(int i=1;i<=sz;i++)
		{
			ch=(char)bin.read();
			System.out.println(ch);
		}
		fin.close();
		bin.close();
	}

}
