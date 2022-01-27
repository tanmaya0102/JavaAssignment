package main;

import java.util.Scanner;

public class VowelOrConsonant {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter a character:");
		char c=sc.next().charAt(0);
		switch(c){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u': System.out.println("Vowel");
		break;
		default:System.out.println("Not Vowel");
	
	}
		
	}
}
