package com.tns.multithreading;

public class Threads extends Thread {
	public void run() {
		System.out.println("Thread"+Thread.currentThread().getName()+"running");
	}
	public static void main(String[] args) {
		Threads t1=new Threads();
		Threads t2=new Threads();
		t1.start();
		t2.start();
		System.out.println("Priority"+t1.getName()+":"+t1.getPriority());
		System.out.println("Priority"+t1.getName()+":"+t1.getPriority());
		
	}

}
