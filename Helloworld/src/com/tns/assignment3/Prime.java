package com.tns.assignment3;

public class Prime implements Accounts {
	public void deliverycharge() {
		System.out.println("There will be no  deliverycharges for prime users");
		}
	public static void main(String[] args) 
	{
	
		 Prime p=new Prime();
		 Non_prime NP=new Non_prime();
			p.deliverycharge();
		NP.deliverycharge();
		
	}
}