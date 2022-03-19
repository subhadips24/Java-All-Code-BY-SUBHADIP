package com.problemSolve.Subha;

public class BubleSort {
	static void sortArray(long arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					long temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}
	static void displayArray(long arr[]) {
		
		for(long i:arr) {
			System.out.print(i+" ");
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		long a[]= {1,2,3,4,00235};
		sortArray(a);
		displayArray(a);
		
		System.out.println(025);//--->21
		System.out.println(0255);//--->173
		System.out.println(0375);//--->253
		System.out.println(02);//----->2
		
		
	}
	

}
