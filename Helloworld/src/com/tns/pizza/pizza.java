package com.tns.pizza;

public class pizza {
	private int price;
	private boolean veg;//if fasle its non veg
	private int ExtraCheeseprice=100;
	private int ExtraToppingprice=150;
	private int bagpackprice=20;
	public pizza(Boolean veg) {
		this.veg = veg;
		if(this.veg) {
			this.price=300;
		}else {
			this.price=400;
			}
		}
	public void addExtraCheese() {
		System.out.println("Extra cheese added");
		this.price+=ExtraCheeseprice;
		
	}
	public void addExtraTopping() {
		System.out.println("Extra topping added");
		this.price+=ExtraToppingprice;
		
	}
	public void takeaway() {
		System.out.println("Take away opted");
		this.price+=bagpackprice;
		
	}
	public void getbill() {
		System.out.println(this.price);
	}
	
	

}
