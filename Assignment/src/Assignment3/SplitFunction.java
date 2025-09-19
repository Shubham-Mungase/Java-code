package Assignment3;

import java.util.Iterator;

public class SplitFunction {
	
	public static void main(String[] args) {
		String str="Omkar is my Friend";
		String[] arrofstr=str.split(" ",5);
		for(String a : arrofstr)
			System.out.println(a);
	}

}
