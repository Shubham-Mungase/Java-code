package day1;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo3 implements FilenameFilter{
	
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.startsWith("A"
				);
	}
	public static void main(String[] args) {
		
		File f1=new File(args[0]);
		if(f1.isDirectory())
		{
			FilenameFilter only=new FileDemo3();
			String s[]=f1.list(only);
			System.out.println("List Of Files \n");
			for(int i=0;i<s.length;i++)
			{
				System.out.println(s[i]);
			}
	}

	}
}
