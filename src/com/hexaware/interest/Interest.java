package com.hexaware.interest;

public class Interest {
	public double Si(double r,double t,double p){
		double ans=(p * r * t)/100;
		return ans;
	}
	public double Ci(double r,double t,double p){
		double ans = p*(Math.pow((1 + r / 100), t)); 
		return ans;
	}
}
