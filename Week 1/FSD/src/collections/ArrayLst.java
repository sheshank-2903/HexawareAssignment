package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ArrayLst {
	public static void main(String[] args) {
		ArrayList <Integer>arr=new ArrayList<>();
		arr.add(5);
		arr.add(4);
		arr.add(6);
		arr.remove(0);
		arr.set(1, null);
		System.out.println(arr.get(1));
		
		Collections.sort(arr);
		System.out.println(arr);
		
		Iterator <Integer>i=arr.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
		
		
		
		ArrayList arr1=new ArrayList();
		arr1.add(5);
		arr1.add(2);
		arr1.add(4);
		arr1.add("Yash");
		arr1.add("Priya");
		arr1.add("Pinku");
		System.out.println(arr1);
		
		Iterator itr=arr1.iterator();
		while(itr.hasNext()) {System.out.println(itr.next());}
		
		for (Object obj:arr1){
			System.out.println(obj);
		}
		
	}

}
