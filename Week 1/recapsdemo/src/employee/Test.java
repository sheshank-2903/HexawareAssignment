package employee;

public class Test {
	public static void main(String[] args) {
		Employee emp1=new Employee(101, "Yash", 100);
		System.out.println(emp1);
		
		Employee emp3=new Employee(101, "Yash", 100);
		System.out.println(emp3);
		
		Employee emp2=new Employee();
		emp2.setEid(102);
		System.out.println(emp2);
	}

}
