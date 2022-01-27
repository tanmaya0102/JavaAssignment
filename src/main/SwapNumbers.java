package main;

import java.util.Scanner;

public class SwapNumbers {
       private static Scanner sc;
       public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int n=sc.nextInt();
		System.out.println("Enter the second number");
		int m=sc.nextInt();
		int temp=m;
		m=n;
		n=temp;
		System.out.println("The first number after swapping:"+n);
		System.out.println("The second number after swapping:"+m);
	}
}
