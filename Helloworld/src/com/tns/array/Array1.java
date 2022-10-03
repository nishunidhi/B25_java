package com.tns.array;

public class Array1 {
	public static void main(String[] args) {
		//int arr[3];
		int arr[]= {12,13,14};//declaration & initialization
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}}