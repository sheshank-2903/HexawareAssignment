package employee;

import java.util.Objects;

public class Employee{ //POJO,BEAN,ENTITY
	
	private int eid;
	private String ename;
	private double salary;
	
	public Employee() {
		super();
	}
	
	public Employee(int eid, String ename, double salary) {
		this();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	
	public void setEid(int eid) {
		this.eid=eid;
	}
	
	public void setEname(String ename) {
		this.ename=ename;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}

	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + "]";
	}

	public int getEid() {
		return eid;
	}
	
	public String getEname() {
		return ename;
	}
	
	public double getSalary() {
		return salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(eid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return eid == other.eid;
	}

	
	
	
	
	
	
	
	

}
