package com.tns.program;

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
