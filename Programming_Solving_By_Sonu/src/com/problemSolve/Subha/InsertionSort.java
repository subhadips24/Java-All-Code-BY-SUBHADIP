package com.problemSolve.Subha;

public class InsertionSort {
	static void inSort(int [] a) {
		int n=a.length;
		
		for(int i=1; i<n; i++)
		{
			
			int current=a[i];
			int j=i-1;
			
			while( j>=0 && a[j]>current )//while(  a[j]>current && j>=0 ) why give exception 
			{
				a[j+1]=a[j];
				j--;//for going to 
			}
			a[j+1]=current;
			
			
		}
		
	}
	static void displayArray(int arr[]) {
		
		for(int i:arr) {
			System.out.print(i+" ");
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int a[]= {5,2,7,4};
		inSort(a);
		displayArray(a);
		
		
		
	}
	

}
