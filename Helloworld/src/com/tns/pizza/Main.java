package com.tns.pizza;

public class Main extends pizza{
	public Main(Boolean veg) {
		super(veg);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		pizza basepizza=new pizza(false);
	basepizza.addExtraTopping();
	basepizza.addExtraCheese();
	basepizza.takeaway();
	basepizza.getbill();
	
	}
}
