package main;

import java.util.Scanner;

public class ReverseOfNumber {
	private static Scanner sc;

	public static void main(String args[]) {
		sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		int t=0;
	    while(n>0)
	    {
	    	int r=n%10;
	    	t=t*10+r;
	    	n=n/10;
	    }
	    System.out.println("Reverse of the number is "+t);

	}
}
