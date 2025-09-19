package day2;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Date;

public class Filedemo3 implements FilenameFilter{

	Date d1;
	
	public Filedemo3(int dd,int mm,int yy)
	{
		d1=new Date(yy,mm,dd);
	}
	
	@Override
	public boolean accept(File dir, String name) {
		
		File f2 =new File(dir.getPath()+"//"+name);
		System.out.println("directory path="+dir.getPath());
		Date d2=new Date(f2.lastModified());
		System.out.println("Data ="+d2);
		System.out.println("Date="+d2.getDate());
		if(d1.getDate()==d2.getDate())
			return true;
		else
			return false;
	}
	public static void main(String[] args) throws IOException{
		File f1=new File("F:\\Java\\CoreJava");
		int dd,mm,yy;
		dd=Integer.parseInt(args[0]);
		mm=Integer.parseInt(args[1]);
		yy=Integer.parseInt(args[2]);
		if(f1.isDirectory())
		{
		FilenameFilter only =new Filedemo3(dd,mm,yy);
		String s[]=f1.list(only);
		System.out.println("List of Files :\n");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		}
		
		
	}

}
