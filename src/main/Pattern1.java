package main;

import java.util.Scanner;

public class Pattern1 {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(i);

			}
			System.out.println("");
		}
	}

}
