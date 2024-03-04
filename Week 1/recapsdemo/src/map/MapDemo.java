package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	
	public static void main(String[] args) {
		Map <Integer,String>map=new HashMap<Integer,String>();
		
		map.put(101, "Yash");
		map.put(103, "ram");
		map.put(102, "ravi");
		map.put(100, "Kumar");
		map.put(100, "Chumu"); //Second value overrides first
		map.put(11, "Kuru");
		map.put(1233, "ravi");
		
		System.out.println(map); //printed with hashcode of keys
		
Map <Integer,String>map1=new LinkedHashMap<Integer,String>();
		
		map1.put(101, "Yash");
		map1.put(103, "ram");
		map1.put(102, "ravi");
		map1.put(100, "Kumar");
		map1.put(100, "Chumu"); //Second value overrides first
		map1.put(11, "Kuru");
		map1.put(1233, "ravi");
		
		System.out.println(map1); //Insertion order maintained
		
		Set<Integer> set=map1.keySet();
		
		Iterator <Integer>itr=set.iterator();
		while(itr.hasNext()) {
			Integer k=itr.next();
			System.out.println(k+" "+map1.get(k));
		}
		
		
	}

}
