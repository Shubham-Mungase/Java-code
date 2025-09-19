package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet set=new HashSet();
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
