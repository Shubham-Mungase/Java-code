package day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File7 {
	public static void main(String[] args) throws IOException{
		String str;
		FileWriter fout=new FileWriter("G:\\Java-codes\\FileHandling\\src\\day4\\pqr.txt");
		PrintWriter pout=new PrintWriter(fout);
		System.out.println("Enter INfo And Stop at the end");
		Scanner sc=new Scanner(System.in);
		do {
			str=sc.nextLine();
			if(str.equalsIgnoreCase("stop"))
				break;
			pout.println(str);
		}while(true);
		fout.close();
		FileReader fin=new FileReader("G:\\Java-codes\\FileHandling\\src\\day4\\pqr.txt");
		BufferedReader br=new BufferedReader(fin);
		do
		{
			str=br.readLine();
			if(str==null)
				break;
			System.out.println(str);
		}while(true);
		

	}

}
