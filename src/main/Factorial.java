package main;

import java.util.Scanner;

public class Factorial {
	public static long factorialcalc(int n)
	
	{
		if(n==0||n==1)
			return 1;
		else
			return n*factorialcalc(n-1);
		
	}
	
	private static Scanner sc;
	public static void main(String args[]) {
		sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n = sc.nextInt();
		long  r=factorialcalc(n);
		System.out.println("The Factorial is "+r);

	}

}
