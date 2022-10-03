package com.tns.program;
public class Inheritance extends withdraw{
	int amt_left=5000;
	public static void main(String args[]) {
		Inheritance ob1=new Inheritance();
		System.out.println("amountwitdraw"+ ob1.amt_left);
	}
}