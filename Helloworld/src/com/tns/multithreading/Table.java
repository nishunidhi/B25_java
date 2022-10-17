package com.tns.multithreading;

public class Table {
	void printTable(int n) {
		for(int j=1;j<=5;j++) {
			System.out.println(n*j);
			try {
				Thread.sleep(400);
			}
			cath(InterruptedException ie)
			{
				System.out.println(ie);
			}
		}
	}
	public static void main(String[] args) {
		Table obj=new Table();
		Thread1 t1=new Thread1(obj);
		Thread2 t2=new Thread2(obj);
		t1.start();
		t2.start();
	}

}
