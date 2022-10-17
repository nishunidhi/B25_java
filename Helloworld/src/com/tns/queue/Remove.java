package com.tns.queue;

//Java program to remove elements
//from a Queue

import java.util.*;

public class Remove {

	public static void main(String args[])
	{
		Queue<String> pq = new PriorityQueue<>();

		pq.add("Geeks");
		pq.add("For");
		pq.add("Geeks");

		System.out.println("Initial Queue " + pq);

		pq.remove("Geeks");

		System.out.println("After Remove " + pq);

		System.out.println("Poll Method " + pq.poll());

		System.out.println("Final Queue " + pq);
	}
}
