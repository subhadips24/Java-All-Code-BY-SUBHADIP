package OOPS;



public class UpAndDownCasting {
	
	static void use() {
		System.out.println("Static mathod.....");
	}
	static {
		System.out.println("It is Static Block");
	}
}
class UpCasting extends UpAndDownCasting{
//	public static void main(String[] args) {
//		Object o1= new UpCasting();
//		UpAndDownCasting u1=new UpCasting();
//		UpCasting u2=new UpCasting();
//		System.out.println(u1+" "+u2+" "+o1);
//		
//	}
}
class DownCasting extends UpCasting{
//	public static void main(String[] args) {
//		UpAndDownCasting u1=new DownCasting();
//		UpCasting u2=new DownCasting();
//		DownCasting d1=(DownCasting)u2;
//		System.out.println(u2.equals(d1));
//		
//	}
//	
	
	
	
}
class  OuterClass extends UpAndDownCasting{
	void test() {
		use();
		
	}
	public static void main(String[] args) {
		
			use();
			
			try {
				
				UpAndDownCasting u1=new UpCasting();
				
				OuterClass o1=(OuterClass)u1;
				
			}catch (ClassCastException e) {
				
				System.out.println(e);
				System.out.println(e.getMessage());
			}finally {
				
				System.out.println("Finaly alwas Happen ..whether Exp ocure or not");
			}
			
		
	}
}
