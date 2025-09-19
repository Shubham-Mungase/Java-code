package day1;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileDemo2 implements FilenameFilter {

	String w;
	public FileDemo2(String ext)
	{
		w="."+ext;
	}
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(w);
	}
	public static void main(String[] args) throws IOException{
		
		File f1=new File(args[0]);
		if(f1.isDirectory())
		{
			FilenameFilter only=new FileDemo2(args[1]);
			String s[]=f1.list(only);
			System.out.println("List Of Files \n");
			for(int i=0;i<s.length;i++)
			{
				System.out.println(s[i]);
			}
		}
	}
	
	

}
