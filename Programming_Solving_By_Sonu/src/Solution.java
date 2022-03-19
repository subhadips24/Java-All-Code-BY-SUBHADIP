import java.util.Iterator;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		String ar[]=new String[n1];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextLine();
		}
		int n2=sc.nextInt();
		String s[]=new String[n2];
		for (int i = 0; i < s.length; i++) {
			s[i]=sc.nextLine();
		}
		
		String mA[]=new String[n1+n2];
		int j=0;
		
		for(int i=0;i<s.length;i++) {
			mA[j]=ar[i];
			j=j+1;
			mA[j]=s[i];
			j=j+1;
		}
		
		
		for (int i = 0; i < mA.length; i++) {
			System.out.println(ic);
		}
		
	}

}
