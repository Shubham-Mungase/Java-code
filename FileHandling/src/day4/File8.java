package day4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class File8 {
	public static void main(String[] args) throws IOException{
		String str;
		FileWriter fout=new FileWriter("G:\\Java-codes\\FileHandling\\src\\day4\\jkl.txt");
		BufferedWriter bout=new BufferedWriter(fout);
		//FileOutputStream fout1=new FileOutputStream("G:\\\\Java-codes\\\\FileHandling\\\\src\\\\day4\\\\jkl.txt");
		//BufferedOutputStream bout1=new BufferedOutputStream(fout1);
		//PrintWriter pout1=new PrintWriter(fout1,true);
		PrintWriter pout=new PrintWriter(fout,true);
		System.out.println("Enter INfo And Stop at the end");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do {
			str=br.readLine();
			if(str.equalsIgnoreCase("stop"))
				break;
			pout.println(str);
		}while(true);
		fout.close();
		FileReader fin=new FileReader("G:\\Java-codes\\FileHandling\\src\\day4\\jkl.txt");
		BufferedReader br1=new BufferedReader(fin);
		do
		{
			str=br1.readLine();
			if(str==null)
				break;
			System.out.println(str);
		}while(true);
		

	}

}
