package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapBook {

	public static void main(String[] args) {
		Book b1=new Book(101,2,"Java","XYZ","PQR");
		Book b2=new Book(102,1,"Python","ABC","XYZ");
		Book b3=new Book(103,5,"CPP","HIJ","STU");
		
		HashMap<Integer, Book> map=new HashMap<Integer, Book>();
		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);
		
		for(Map.Entry<Integer, Book> m:map.entrySet())
		{
			System.out.println(m.getKey()+"=>"+m.getValue());
		}
		Book b4=new Book(104,3,"Rust","JKL","HIJ");
		map.replace(3, b3,b4);
System.out.println("After Replace");
		for(Map.Entry<Integer, Book> m:map.entrySet())
		{
			System.out.println(m.getKey()+"=>"+m.getValue());
		}
		
	}
}
