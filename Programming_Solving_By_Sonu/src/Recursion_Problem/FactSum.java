package Recursion_Problem;
import java.util.Scanner;

public class FactSum {
	
	public static int check(int[] A) {
		int sum=0;
		for (int i = 0; i < A.length; i++) {
			sum+=A[i];
		}
	
		return sum*A.length;
	}
	
	public static void main(String[] args) {	
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int ar[]=new int[n];
//		for(int i=0;i<n;i++) {
//			ar[i]=sc.nextInt();
//		}
//		int l=0,sl=0;
//		for (int i = 0; i < ar.length; i++) {
//			if(ar[i]>l) {
//				sl=l;
//				l=ar[i];
//			}
//		}
//		int avg=(l+sl)/2;
//		
//		
//		System.out.println("First largest is "+l+" Second lergest "+sl+" and aerage is "+avg);
		
		int a[]= {23,45};
		System.out.println(check(a));
	}
}
