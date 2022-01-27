package main;

import java.util.Scanner;

public class ArraySwap {
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
		
		for(int i=0;i<n-1;i+=2)
		{     
			    int j=i+1;
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			
		}
		System.out.println("After Swap:");
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}