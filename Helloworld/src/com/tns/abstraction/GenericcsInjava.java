package com.tns.abstraction;

import java.util.ArrayList;

public class GenericcsInjava {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("java");
		//list.add(123);
		for(Object object:list) {
			String str=(String)object;
		System.out.println(str);	
		}
	}

}
