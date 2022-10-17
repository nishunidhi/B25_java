package com.tns.multithreading;

public class Secondway implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//public static void main(String[] args){
			Secondway t1=new Secondway();
			Thread t2=new Thread(t1);
			t2.start();
		}
	}


