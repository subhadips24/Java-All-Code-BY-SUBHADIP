package Recursion_Problem;

public class Nto1 {
	static void printN(int n) {
		if(n>1){
			
		 printN(n-1);
		
		}
		System.out.println(n);
		//printN(n+1);
	}
	public static void main(String[] args) {
		printN(5);
	}

}
