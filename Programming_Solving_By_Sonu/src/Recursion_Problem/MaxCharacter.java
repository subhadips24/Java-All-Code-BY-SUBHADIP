package Recursion_Problem;
public class MaxCharacter{
	static public String maxEliment(String input1) {
		
		char[] s=input1.toCharArray();
		int[] fre=new int[input1.length()];
		char maxChar=input1.charAt(0);
		
		for (int i = 0; i < s.length; i++) {
			fre[i]=1;
			for (int j = i+1; j < s.length; j++) {
				if(s[i]==s[j] && s[i]!='0') {
					fre[i]++;
					s[j]='0';
				}
			}
		}
		int max;
		max=fre[0];
		for (int j = 0; j < fre.length; j++) {
			 
			if(max<fre[j]) {
				max=fre[j];
				maxChar=s[j];
			}
			
		}
		
		String x=String.valueOf(maxChar);
		
		return x;
	}
	
	
	
	
	public static void main(String[] args) {
	String string="bbbcccdeff";
		
	System.out.println(maxEliment(string));
	}

}
