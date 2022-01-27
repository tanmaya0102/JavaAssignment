package main;

import java.util.Scanner;

public class GreatestNumber {
	private static Scanner sc;
    public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		System.out.println("Enter the third number");
		int c=sc.nextInt();
		if(a>b && a>c)
		{
		   System.out.println(a+" is greatest");	
		}
		else if(b>c)
		{
			System.out.println(b+"  is greatest");
		}
		else
		{
			System.out.println(c+" is greatest");
		}
		
	}
}
