package SimpleCode;

public class Sample {
	public static void printCapital() {
		for (char i = 'A'; i <='Z'; i++) {
			try {
				
				
				System.out.println(i);
				Thread.sleep(300);
				
				
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			
		}
	
	}
	public static void printSmall() {
		for (char i = 'a'; i <='z'; i++) {
			try {
				
				
				System.out.println(i);
				Thread.sleep(300);
				
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	

}
