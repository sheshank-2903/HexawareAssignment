package com.hexaware.mapping_example.entity3;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
public class Employees {
	@Id
	private int eid;
	private String enmae;
	private double salary;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="dno") //dno column will be created in Employees class table or we can say it is foreign key in department table
	private Department department;
	public Employees() {
		super();
	}
	public Employees(int eid, String enmae, double salary) {
		super();
		this.eid = eid;
		this.enmae = enmae;
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEnmae() {
		return enmae;
	}
	public void setEnmae(String enmae) {
		this.enmae = enmae;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employees [eid=" + eid + ", enmae=" + enmae + ", salary=" + salary + "]";
	}
	
	
}
