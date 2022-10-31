package com.tns.multithreading;

import java.util.List;

public class Javastream {
	public static void main(String[] args) {
		List<String> name=new List<>();
		name.add("meena");
		name.add("adinina");
		name.add("priya");
		name.add("nidhi");
		List<String>nameEndingWith_a=name.stream().filter(name->name.charAt(name.length()-1)=='a');
		.sorted()
		.collect(Collection.toList());
		namesEndingWith_a.forEach(s->System.out.println(s));
	}

}
