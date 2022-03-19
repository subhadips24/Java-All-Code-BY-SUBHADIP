package MultiThreding;

public class TestByImpliment implements Runnable{

	
	public void run() {
		System.out.println("It is runing .......");
	}
	public static void main(String[] args) {
		
		try {
			TestByImpliment x=new TestByImpliment();
			Thread tr=new Thread(x);
			tr.start();
			tr.start();
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("It's over.....");
			
		}
		
	}

}
