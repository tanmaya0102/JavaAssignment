package main;

import java.util.Scanner;

public class PrimeNumber {
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static Scanner sc;

	public static void main(String args[]) {
		sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) 
			{
				System.out.print(i + " ");
			}

		}

	}

}
