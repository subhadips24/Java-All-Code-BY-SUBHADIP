package Fnd_Code_Solving;

public class ProblemAccen {
	static public String contain(String input1,String input2)
	{
		String x="no";
		
		
		if(input1.contains(input2)) {
			x="yes";
		}
		return x;
		
	}
	public static void main(String[] args) {
		String s1="abcd";
		String s2="bcd";
		System.out.println(contain(s1, s2));
	}
}
