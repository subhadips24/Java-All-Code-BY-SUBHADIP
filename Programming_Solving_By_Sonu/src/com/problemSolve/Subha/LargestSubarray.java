package com.problemSolve.Subha;

import java.util.Scanner;


public class LargestSubarray {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int ar[]=new int[l];
		for (int i = 0; i < ar.length; i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println(largestSubarray(l, ar));
	}
	
	public static int largestSubarray(int input1 ,int[] input2)
	{
		  int maxlen = 0;
		  for (int start = 0; start <input1; start++)
		  {
		    int zeroes = 0, ones = 0;
		    for (int end = start; end < input1; end++)
		    {
		      if (input2[end] == 0) 
		      {
		        zeroes++;
		      } else {
		        ones++;
		      }
		      if (zeroes == ones) 
		      {
		        maxlen = Math.max(maxlen, end - start + 1);
		      }
		    }
		  }
		  return maxlen;
		
	}
	

}
