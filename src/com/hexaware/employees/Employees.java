package com.hexaware.employees;
public class Employees {
	int eid=0;
	double basic=0,hra=0,ta=0,da=0,gross=0;
	String ename="";
	public Employees(int eid,String ename,double basic){
		this.eid=eid;
		this.ename=ename;
		this.basic=basic;
		hra=0.12*basic;
		ta=0.05*basic;
		da=0.08*basic;
		gross = basic+hra+ta+da;
	}
	public double getGross(){
		return gross;
	}
	public String getRank(){
		if(gross>=25000) return "Grade A";
		else return "Grade B";
	}
}
