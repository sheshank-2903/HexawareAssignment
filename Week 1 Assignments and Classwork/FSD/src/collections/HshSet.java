package collections;
import java.util.HashSet;
import java.util.Set;


public class HshSet {
	public static void main(String[] args) {
		Set s=new HashSet<>();
		s.add(1);
		s.add("Yash");
		s.add(2);
		s.add(10);
		s.add(23);
		s.add("Kumar");
		s.add("Yash");
		s.add(null);
		s.add(null);
		System.out.println(s);
	}
	

}
