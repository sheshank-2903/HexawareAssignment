package extrademos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtraDemos {
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		
		list.add(30); //new Integer(30);
		list.add(10);
		list.add(15);
		list.add(15);
		
		Object[] arr=list.toArray();
		System.out.println(arr);
		
		int a[]= {};
		System.out.println(a);
		System.out.println("array size is "+a.length);
		
		int a2[]=new int[5];
		System.out.println(a2[3]);
		
		
		Integer a3[]= {1,2,33,44,55};
		List <Integer>list1=Arrays.asList(a3);
		
		

	}
	
	
}
