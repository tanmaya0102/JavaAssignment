package main;

import java.util.Scanner;

public class EvenorOdd {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Even Number");
			
		}
		else
		{
			System.out.println("Odd Number");
		}
	}

}
