package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	
public static void main(String[] args) {
	HashMap<Integer, String> hm=new HashMap<Integer, String>();
	System.out.println("Initial list="+hm);
	hm.put(101, "Ajay");
	hm.put(102, "Abhi");
	hm.put(103, "Vijay");
	System.out.println("After invoking put method");
	for(Map.Entry m:hm.entrySet())
	{
		System.out.println(m.getKey()+"=>"+m.getValue());
	}
	hm.putIfAbsent(104,"Ram");
	hm.putIfAbsent(104,"Sham");
	System.out.println("After invoking putIfAbsent method");
	for(Map.Entry m:hm.entrySet())
	{
		System.out.println(m.getKey()+"=>"+m.getValue());
	}
	HashMap<Integer, String> map=new HashMap<Integer, String>();
	map.put(105, "krishna");
	map.put(106, "Mahadev");
	map.putAll(hm);
	System.out.println("After invoking putAll method");
	for(Map.Entry m:map.entrySet())
	{
		System.out.println(m.getKey()+"=>"+m.getValue());
	}
	map.remove(106);
	System.out.println("Remove by key="+map);
	map.remove("Vijay");
	System.out.println("Remove by value="+map);
	map.remove(101, "Ajay");
	System.out.println(map);
	
	
}

}
