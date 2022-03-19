package com.problemSolve;

public class LargestWord {
	
	public static String lWord(String st) {
		String s="";
		int  n=0;
		
		String[] sa=st.split(" ");
		for (int i = 0; i < sa.length; i++) {
			if(sa[i].length()>n) {
				n=sa[i].length();
				s=sa[i];
			}
		}
		
		return s;
	}
	public static void main(String[] args) {
		String s="I love You fuckigBitch";
		System.out.println(lWord(s));
	}

}
