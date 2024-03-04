package employee;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmpTreeSet {
	public static void main(String[] args) {
		Set<Employee> set=new HashSet<Employee>();
		
		set.add(new Employee(101,"Yash",1000));
		set.add(new Employee(101,"Ram",1500)); //not added because of hashcode and equals override
		set.add(new Employee(102,"Kiran",90000));
		
		System.out.println(set);
		
		Set<Employee> set1=new TreeSet<Employee>(new EmpComparator());
		
		set1.add(new Employee(101,"Yash",1000));
		set1.add(new Employee(101,"Ram",1500)); //not added because of hashcode and equals override
		set1.add(new Employee(102,"Kiran",90000));
		
		System.out.println(set1);
		
	}

}
