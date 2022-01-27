package main;

import java.util.Scanner;

public class Pattern3 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++)
        {
            for (int j = n; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
	}

}
