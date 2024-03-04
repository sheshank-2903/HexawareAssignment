package presentation;



import java.util.List;
import java.util.Scanner;

import dao.DepartmentDaoImpl;
import dao.IDepartmentDao;
import entities.Department;

public class Client {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		IDepartmentDao dao=new DepartmentDaoImpl();
		
		boolean flag=true;
		
		while(flag) {
		
		System.out.println("\n\nWelcome to Department Management System***************");
		System.out.println("1. Insert");
		System.out.println("2. Update");
		System.out.println("3. Delete");
		System.out.println("4. Select By Id");
		System.out.println("5. Select All");
		System.out.println("6. Exit");
		
		
		
		int choice= sc.nextInt();
		int count=0;
		//Department dept=null;
		
		switch (choice) {
		case 1:			
			Department dept=readData();
			count=dao.insertDept(dept);
			System.out.println(count+" records inserted successfully...");
			break;
			
		case 2:
			Department dept1=readUpdateData();
			count=dao.updateDept(dept1);
			System.out.println(count+" records updated successfully...");
			break;
			
		case 3:
			System.out.println("Enter the department that you want to delete");
			int dno=sc.nextInt();
			count=dao.deleteOne(dno);
			System.out.println(count+" records deleted successfully...");
			break;
			
		case 4:
			System.out.println("Enter the department number to fetch details");
			Department dept3=dao.selectOne(sc.nextInt());
			System.out.println(dept3);
			break;
			
		case 5:
			//System.out.println(dao.selectAll());
			List<Department> list=dao.selectAll();
			list.stream().forEach(System.out::println);
			break;
			
		case 6:
			flag=false;
			System.out.println("Exiting..........Thankyou for using");
			break;
			
		default:
			System.out.println("Please enter a valid value between 1 to 6");
			break;
		}
		}		
		
	}
	
	public static Department readData() {
		System.out.println("Enter dno:");
		int dno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter dname:");
		String dname=sc.nextLine();
		
		System.out.println("Enter location:");
		String location=sc.nextLine();
		
		Department dept=new Department(dno, dname, location);
		return dept;
		
		
	}
	
	public static Department readUpdateData() {
		System.out.println("Enter the dno you want to update");
		int dno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter new dname:");
		String dname=sc.nextLine();
		
		System.out.println("Enter new location:");
		String location=sc.nextLine();
		
		Department dept=new Department(dno, dname, location);
		return dept;
		
		
	}

	
	
	
	
	
	
	
	
	
}
