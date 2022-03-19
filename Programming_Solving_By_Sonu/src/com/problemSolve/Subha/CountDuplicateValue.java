package com.problemSolve.Subha;

import java.util.Scanner;

public class CountDuplicateValue {
	
	static void countKey(String s) {
		String sc="";
		char[] a=s.toCharArray();
		int count=0;
		for(int i=0;i<s.length();i++) {
			count=1;
			for (int j = i+1; j < s.length(); j++)
				{
				
					if(a[i]==a[j] && a[i]!='0') 
					{
						
						count++;
						a[j]='0';
					}
				
				}
				if(count==1 && a[i]!='0' ) {
					System.out.println(a[i]);
				}
				else if(count>1 && a[i]!=0) {
					System.out.println(a[i]+""+count);
				}
			}
			
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		countKey("aaabbbccc");
	}

}
