package com.tns.ourwork;

 class Student {
	 private String name;
	 public String getName() {
		 return name;
		 
	 }
	 public void setName(String studentName) {
		 name=studentName;
	 }
 }
public class TestClass{
	public static void main(String args[]) {
		Student obj=new Student();
		//obj.name="amit";
		//studentName=obj.name;
		obj.setName("amit");
		String Name=obj.getName();
		System.out.println(Name);
	}

}
