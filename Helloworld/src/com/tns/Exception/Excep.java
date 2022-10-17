package com.tns.Exception;

public class Excep{  
	  public static void main(String args[]){  
	   try{  
	      //code that may raise exception  
	      String str ="null"  ;
	   }catch(NullPointerException ne){
		   System.out.println(str.length());
		   }  
	   //rest code of the program   
	   System.out.println("rest of the code...");  
	  }  
	}  