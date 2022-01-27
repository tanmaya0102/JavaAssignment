package main;

import java.util.Scanner;

public class ArrayReverse {
	private static Scanner sc;
	public static void main(String args[])
	{
		sc=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int n=sc.nextInt();
		int [] array=new int[n];
		System.out.print("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		int [] newarray=new int[n];
		for(int i=0;i<n;i++)
		{
			newarray[i]=array[n-i-1];
		}
		System.out.println("Reversed Array");
		for(int i=0;i<n;i++)
		{
			System.out.print(newarray[i]+" ");
		}
		
	}

}
