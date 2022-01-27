package main;

import java.util.Scanner;

public class EvenNumberToN {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}

}
