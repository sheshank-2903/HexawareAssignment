package com.hexaware.mapping_example.entity4;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Product {
	@Id
	private int pId;
	private String productName;
	
	@ManyToMany(mappedBy="products",fetch=FetchType.LAZY) // make sure to use lazy always While Calling Order only Order data comes
	// this side has mapped by sp joinTable will not be here
	private Set<Order_Details> orders=new HashSet<Order_Details>();

	public Product() {
		super();
	}

	public Product(int pId, String productName, Set<Order_Details> orders) {
		super();
		this.pId = pId;
		this.productName = productName;
		this.orders = orders;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Set<Order_Details> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order_Details> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", productName=" + productName + ", orders=" + orders + "]";
	}

	public void addOrder(Order_Details o1) {
		this.orders.add(o1);
		
	}
	
}
