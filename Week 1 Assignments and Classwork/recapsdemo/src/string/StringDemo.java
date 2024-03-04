package string;

public class StringDemo {
	public static void main(String[] args) {
		StringDemo d1=new StringDemo();
		StringDemo d2=new StringDemo();
		
		//System.out.println(d1.equals(d2));
		
		String str1=new String("Hello");
		String str2=new String("Hello");
		
		System.out.println("Comparing values: "+str1.equals(str2));
		System.out.print("Comparing hashcode: ");
		System.out.println(str1==str2);
		
		String str3="Yash";
		String str4="Yash"; //both are stored in same object as new is not used
		System.out.println("Comparing values: "+str3.equals(str4));
		System.out.print("Comparing hashcode: ");
		System.out.println(str3==str4);
	}
	
	
	
	

}
