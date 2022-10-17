package com.tns.Exception;

import com.tns.Exception.Youtube;
import com.tns.Exception.Correct_wifi;
import com.tns.Exception.Improper;

public class Correct_wifi implements Youtube {
	public void connection() {
		System.out.println("Connection is good");
		}
	public static void main(String[] args) 
	{
	
		Correct_wifi c=new Correct_wifi();
		Improper i=new Improper();
			c.connection();
		i.connection();
		
	}
}