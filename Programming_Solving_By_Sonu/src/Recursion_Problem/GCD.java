package Recursion_Problem;

public class GCD {
	/*static int gcd(int n,int t) {
		if(t==0) {
			return t;
		}
		else if(n==0){
		
			return n;
		}
		else if(n==t) {
			return n;
		}
		else if(n>t) {
			return gcd(n-t,t);
		}
		
	return gcd(n,t-n);	
	}*/
	static int gcd(int a,int b) {
		if(b==0) {
			return a;
		}
		if(b>a) {
			return gcd(b, a);
		}
	return gcd(b, a%b);
		
	}
	public static void main(String[] args) {
		System.out.println(gcd(0,5));
	}

}
