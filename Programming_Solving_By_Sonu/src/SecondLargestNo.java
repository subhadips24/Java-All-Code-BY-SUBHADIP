import java.util.Arrays;

import java.util.Scanner;

public class SecondLargestNo {	
	
	static int secondLergest(int input1,int input2[])
	{
		
		
		Arrays.sort(input2);
		if(input2[0]==input2[input1-1]) 
		{
			return -1;
		}
		
		int fL=0,snL=0;
		fL=input2[input1-1];
		snL=input2[input1-2];
		
		if(fL==snL) {
			return secondLergest(input1-1, input2);
		}
		
		return snL;
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int ar[]=new int[l];
		for (int i = 0; i < ar.length; i++)
		{
			ar[i]=sc.nextInt();
		}
		int s=secondLergest(l, ar);
		System.out.println(s);
	}
}
