package string;

public class StringModification {
	public static void main(String[] args) {
//		String s1="Hello";
//		System.out.println(s1.hashCode());
//	    s1=s1.concat(" World");
//		System.out.println(s1.hashCode());
//		
//		
//		StringBuffer sb1=new StringBuffer("Yash");
//		System.out.println(sb1.hashCode());
//		sb1.append(" Dubey");
//		System.out.println(sb1.hashCode());
//		System.out.println(sb1.reverse());
//		System.out.println(sb1);
		
		
		String name1=new String("A"); //Asci 65
		String name2=new String("B"); //66
		
		System.out.println(name1.compareTo(name2)); // 65-66=-1 can also return -8,10 etc..
		
	}

}
