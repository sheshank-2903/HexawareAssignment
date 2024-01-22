package com.hexaware.student;

public class Students {
	int sid=0;
	double m1=0,m2=0,m3=0,total=0,avg=0;
	String sname="";
	public Students(int sid,String sname,double m1,double m2,double m3){
		this.sid=sid;
		this.sname=sname;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	public double getTotal(){
		return (m1+m2+m3);
	}
	public double getAvg(){
		return (m1+m2+m3)/3;
	}
	public String getRank(){
		double avg=getAvg();
		if(avg>=60) return "class 1";
		else if(avg>=50 && avg<60) return "class 2";
		else if(avg>=35 && avg <50) return "class 3";
		else return "failed";
	}
}
