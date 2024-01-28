package com.hexaware.mapping_example.entity4;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
// @Table (name="Order_table") -- optional you can give table name
public class Order_Details {
	
	@Id
	private int orderId;
	private LocalDate purchaseDate;
	
	@ManyToMany(cascade=CascadeType.ALL) // make sure to use lazy always so that While Calling Product only Product data comes
	// at only one side you hace to write mappedBy
	@JoinTable(name="products_orders_table", /* this name can be anything ANYTHING!!!!! */ 
				joinColumns = {@JoinColumn(name="order_id")}, //order_id is just name it can be same as orderId also
								inverseJoinColumns= {@JoinColumn(name="product_id")}	
				)
	//this side has jointable so mapped by will not come here
	private Set<Product> products=new HashSet<Product>();

	
	public Order_Details() {
		super();
	}

	public Order_Details(int orderId, LocalDate purchaseDate, Set<Product> products) {
		super();
		this.orderId = orderId;
		this.purchaseDate = purchaseDate;
		this.products = products;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", purchaseDate=" + purchaseDate + ", products=" + products + "]";
	}

	public void addProduct(Product p1) {
		// TODO Auto-generated method stub
		this.products.add(p1);
		
	}
	
	
	
}
