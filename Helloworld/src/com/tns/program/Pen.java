package com.tns.program;

import java.security.PublicKey;

class Pen{
	String color;
	String type;//ballpoint;gel
	
	public void write() {//function
		System.out.println("writing something");
		
	}
	public void printColor(){//function
		System.out.println(this.color);
			
		
	}
}
public class OOPS {  
	public static void main(String args[]) {
		Pen pen1=new Pen();
		pen1.color="blue";
		pen1.type="gel";
		//pen1.write();
		Pen pen2=new Pen();
		pen2.color="black";
		pen2.type="ballpoint";
		pen1.write();//calling the function of pen1
		pen2.printColor();
		
	}


}