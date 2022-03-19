package com.problemSolve.Subha;

public class SelectionSort {
	static void seSort(int[] a)
	{
		int n=a.length;
		//1st traverse the element and find the minimum number of index
		for(int i=0;i<n-1;i++) {
			int midInd=i;
			for(int j=i+1;j<n;j++) {//After 1th position of array to find small elements.....
				
				if(a[j]<a[midInd]) {// Check same is a[0] then a[1] the small = a[1];
					
					midInd=j;
					
				}
			}
			//Swapping technique 
			
			int temp=a[midInd];
			a[midInd]=a[i];
			a[i]=temp;
			
		}
	}
static void displayArray(int arr[]) {
		
		for(int i:arr) {
			System.out.print(i+" ");
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,00235};
		seSort(a);
		displayArray(a);
		
		
		
	}
	

}
