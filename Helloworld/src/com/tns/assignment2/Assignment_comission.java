
package com.tns.assignment2;
public class Assignment_comission {
	String name;
	String Address;
	float salesamount;
	Assignment_comission (String name,String Address,float salesamount){
		this.name=name;
		this. Address=Address;
		 this.salesamount=salesamount;
		
	}

	void members() {
		System.out.println(salesamount + "Commision");
	
	
	
	if(salesamount>=100000) {
		System.out.println("Commisission=10%");
	}else if(salesamount<=50000&&salesamount<10000) {
		System.out.println("Commisission=5%");
	}else if(salesamount>=30000&&salesamount<50000) {
		System.out.println("Commisission=3");
	}else if(salesamount<30000){
		System.out.println("Commisission=no commision");
	}}}

	class test{
		public static void main(String[] args) {
			Assignment_comission a1=new Assignment_comission ("Rajesh","E.city",1000f);
			Assignment_comission  a2=new Assignment_comission ("Ramu","E.city II",50000f);
		a1.members();
		a2.members();
		}}