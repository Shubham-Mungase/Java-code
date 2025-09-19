package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ReverseStringList {
	public static void main(String[] args) {
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
		Collections.reverse(arr1);
		 it=arr1.iterator();
			while(it.hasNext())
			{
				String str1=(String)it.next();
				System.out.println("Iterator list="+str1);
			}
	}

}
