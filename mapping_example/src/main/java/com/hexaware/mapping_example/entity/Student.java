package com.hexaware.mapping_example.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.FetchMode;

@Entity
public class Student implements Serializable{
	@Id
	private int studentId;
	private String studentName;
	
	@OneToOne(cascade=CascadeType.ALL) //(cascade=CascadeType.ALL) this line is option it gets auto generated it means 
										//	whatever happens to this class will happen to Address
	
	
	@JoinColumn(name="aid")
	private Address sAddress;
	public Student() {
		super();
	}
	public Student(int studentId, String studentName, Address sAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.sAddress = sAddress;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Address getsAddress() {
		return sAddress;
	}
	public void setsAddress(Address sAddress) {
		this.sAddress = sAddress;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", sAddress=" + sAddress + "]";
	}
	
	
}
