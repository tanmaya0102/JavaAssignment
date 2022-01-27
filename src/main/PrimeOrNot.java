package main;

import java.util.Scanner;

public class PrimeOrNot {
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
		System.out.print("Enter the number:");
		int n = sc.nextInt();
		if (!isPrime(n)) {
			System.out.println(n + " is not a prime number.");
		} else {
			System.out.println(n + " is a prime number.");
		}

	}


}
