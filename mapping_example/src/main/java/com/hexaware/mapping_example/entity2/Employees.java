package com.hexaware.mapping_example.entity2;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employees {
	@Id
	private int eid;
	private String enmae;
	private double salary;
	public Employees() {
		super();
	}
	public Employees(int eid, String enmae, double salary) {
		super();
		this.eid = eid;
		this.enmae = enmae;
		this.salary = salary;
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
