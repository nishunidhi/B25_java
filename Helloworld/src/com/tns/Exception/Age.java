package com.tns.Exception;

public class Age {
	public static void main(String[] args) {
		String str ="no connection is proper";
		try {
			str.equals("no connection");
		}
		catch(NullPointerException ne) {
			str=new String("no connection");
			System.out.println(str.equals("no connection"));
		}
		System.out.println("continue to play");
	}

}

