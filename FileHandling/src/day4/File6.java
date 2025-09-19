package day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File6 {
	public static void main(String[] args) throws IOException{
		FileWriter fout=new FileWriter("G:\\Java-codes\\FileHandling\\src\\day4\\xyz.txt");
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
		//File f1=new File("G:\\Java-codes\\FileHandling\\src\\day4\\xyz.txt");
		FileReader fin=new FileReader("G:\\Java-codes\\FileHandling\\src\\day4\\xyz.txt");
		BufferedReader br=new BufferedReader(fin);
		//FileInputStream fin=new FileInputStream("G:\\\\Java-codes\\\\FileHandling\\\\src\\\\day4\\\\xyz.txt");
		//BufferedReader br =new BufferedReader(new InputStreamReader(fin));
		String str;
		do
		{
			str=br.readLine();
			if(str==null)
				break;
			System.out.println(str);
		}while(true);
		
	}

}
