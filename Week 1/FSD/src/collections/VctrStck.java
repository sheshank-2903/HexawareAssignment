package collections;

import java.util.Stack;
import java.util.Vector;

public class VctrStck {
	public static void main(String[] args) {
		Vector <Integer>v=new Vector<>();
		v.add(1);
		v.add(null);
		v.add(null);
		v.add(4);
		v.remove(0);
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		
		
		Stack<String> s=new Stack<>();
		s.push("apple");
		s.push("mango");
		s.push("banana");
		s.push("kela");
		s.pop();
		System.out.println(s.peek());
		System.out.println(s.empty());
	}
	
	

}
