package day1;

import java.io.File;

public class FileDemo1 {
	public static void main(String[] args) {
		File f1=new File("G:\\Java-codes\\FileHandling\\src\\abc.txt");
		System.out.println(f1.exists()?"Present":"Not Present");
		System.out.println("File Name="+f1.getName());
		System.out.println("Path ="+f1.getPath());
		System.out.println("File Parent="+f1.getParent());
		System.out.println("File Absolute Path="+f1.getAbsolutePath());
		System.out.println(f1.isFile()?"It is a file ":"It is not file");
		System.out.println(f1.isDirectory()?"It is Directory ":"It is Not Directory");
		System.out.println(f1.canRead()?"File is readable":"File is not Readable");
		System.out.println(f1.canWrite()?"File is Writable":"File is not Writable");
		File f2=new File("G:\\Java-codes\\FileHandling\\src\\xyz.txt");
		f1.renameTo(f2);
		System.out.println("File Name="+f2.getName());
	}

}
