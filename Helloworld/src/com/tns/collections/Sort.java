package com.tns.collections;
import java.util.*;  
public class Sort  
{  
public static void main(String args[])  
{  
ArrayList<Integer> list = new ArrayList<Integer>();  
list.add(55);  
list.add(34);  
list.add(98);  
list.add(67);  
list.add(39);  
list.add(76);  
list.add(81);  
Collections.sort(list,Collections.reverseOrder());  
System.out.println("ArrayList After Sorting:");  
for(int marks: list)  
{  
System.out.println(marks);  
}  
}  
}  