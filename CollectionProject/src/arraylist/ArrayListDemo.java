package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		arr.add("hello");
		arr.add(5);
		arr.add(5.5);
		arr.add(7.7f);
		arr.add(true);
		System.out.println("Array list="+arr);
		ArrayList<String> arr1=new ArrayList<String>();
		String[] str= {"Hello","By","Go","Thanks"};
		//Collections.addAll(arr1,str);
		for(int i=0;i<str.length;i++)
		{
			arr1.add(str[i]);
		}
		Iterator<String> it=arr1.iterator();
		while(it.hasNext())
		{
			String str1=(String)it.next();
			System.out.println("Iterator list="+str1);
		}
		arr1.add(2,"Come");
		System.err.println("After Add at specific position="+arr1);
		
		
	}
}
