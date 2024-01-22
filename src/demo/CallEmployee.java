package demo;
import com.hexaware.employees.Employees;
class CallEmployee{
	public static void main(String []args){
		int eid=Integer.parseInt(args[0]);
		String ename=args[1];
		double basic=Double.parseDouble(args[2]);
		Employees s=new Employees(eid,ename,basic);
		System.out.println("gross - "+s.getGross());
		System.out.println("Grade - "+s.getRank());
	}

}