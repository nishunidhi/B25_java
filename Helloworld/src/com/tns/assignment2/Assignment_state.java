package com.tns.assignment2;
public class Assignment_state
{
   public void methodAssignment_state()
   {
     System.out.println(" state method");
   }
}
class city extends Assignment_state
{
public void methodcity()
{
System.out.println("s city method");
}
}
class district extends city
{
   public void methoddistrict()
   {
     System.out.println("s district method");
   }
   public static void main(String args[])
   {
     district obj = new district();
     obj.methodAssignment_state(); // super class method
     obj.methodcity(); // sub class1 method
     obj.methoddistrict(); // sub class2 method
  }
}
