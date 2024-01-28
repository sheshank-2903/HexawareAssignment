package com.hexaware.mapping_example.entity2;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	private int dId;
	private String dname;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="dno") //dno column will be created in Employees class table or we can say it is foreign key in department table
	private Set<Employees> employeesSet=new HashSet<Employees>(); // Collection should be initialised to avoid null pointer exception

	
	public Department() {
		super();
	}


	public Department(int dId, String dnmae, Set<Employees> employeesSet) {
		super();
		this.dId = dId;
		this.dname = dname;
		this.employeesSet = employeesSet;
	}


	public int getdId() {
		return dId;
	}


	public void setdId(int dId) {
		this.dId = dId;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public Set<Employees> getEmployeesSet() {
		return employeesSet;
	}


	public void setEmployeesSet(Set<Employees> employeesSet) {
		this.employeesSet = employeesSet;
	}
	
	public void addEmployees(Employees employees) {
		
//		Set<Employees> set=getEmployeesSet();
//		set.add(employees);
		this.employeesSet.add(employees);
	}

	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dname=" + dname + ", employeesSet=" + employeesSet + "]";
	}
	
	
	
	
	
	
	
}
