package day6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class File17 {
	
	public static void main(String args[]) throws Exception
	{
		Studentnew1 s=new Studentnew1();
		FileOutputStream fout=new FileOutputStream("G:\\Java-codes\\FileHandling\\src\\day6\\stu.txt");
		ObjectOutputStream objout=new ObjectOutputStream(fout);
		String str;
		Scanner sc=new Scanner(System.in);
		int i=1;
		do
		{
			s.set();
			objout.reset();
			objout.writeObject(s);
			s.show();
			objout.flush();
			
			System.out.println("Do you want to continue ? then press y :");
			str=sc.next();
		}while(str.equals("y"));
		objout.close();
		System.out.println("ok");
		FileInputStream fin=new FileInputStream("G:\\Java-codes\\FileHandling\\src\\day6\\stu.txt");
		ObjectInputStream objin= new ObjectInputStream(fin);
		while(true)
		{
			try
			{
				Studentnew1 s1=(Studentnew1)objin.readObject();
				s1.show();
			}
			catch(Exception e)
			{
				break;
			}
		}
		
	}
	

}
