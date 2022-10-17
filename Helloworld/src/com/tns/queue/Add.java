package com.tns.queue;

//Java program to add elements
//to a Queue

import java.util.*;

public class Add {

	public static void main(String args[])
	{
		Queue<String> pq = new PriorityQueue<>();

		pq.add("Geeks");
		pq.add("For");
		pq.add("Geeks");
		pq.add("Aes");
		pq.add("Beak");

		System.out.println(pq);
	}
}

