package com.tns.abstraction;

public class GenericClass {
	GenericClass(){
		System.out.println("THe generic class is declared");
		
	}
public void methodgeneric(obj) {
	System.out.println("the type of the object that this class now contain is"+obj.getClass().getSimpleNmae());
}
}
public class GenericsExample{
public static void main(String[] args) {
	GenericClass<Integer> test=new GenericClass<>();
	Integer a=5;
	test.methodgeneric(a);
GenericClass<String> testString=new GenericClass<>();
String s="the name";
testString.methodgenerics(s);
}
}
