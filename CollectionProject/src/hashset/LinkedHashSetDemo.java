package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		//LinkedHashSet set=new LinkedHashSet();
		LinkedHashSet<String> set =new LinkedHashSet<String>(10);
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("five");
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
