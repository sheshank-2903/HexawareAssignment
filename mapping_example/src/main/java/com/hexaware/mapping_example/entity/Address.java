package com.hexaware.mapping_example.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address implements Serializable {
	@Id
	private int aId;
	private String city;
	private String State;
	
	//for mapping one to one between Student and Address
//	@OneToMany(mappedBy = "address", cascade = CascadeType.ALL)
//	Student student;
	
	
	//for changing lazy and early
	//@OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
	
	
	public Address() {
		super();
	}
	public Address(int aId, String city, String state) {
		super();
		this.aId = aId;
		this.city = city;
		State = state;
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	@Override
	public String toString() {
		return "Address [aId=" + aId + ", city=" + city + ", State=" + State + "]";
	}
	
}
