package com.tns.assignment;
import java.util.Scanner;
class Assignment_Light {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//syntax
        int hrs=sc.nextInt();
        if(hrs>18)
        {
            System.out.println("lights on");
        }
        else if(hrs<=24&&hrs>18){
        System.out.println("lights off");    
        }
        
    }
}
