package MultiThreding;

import java.util.IllegalFormatException;

public class TestByExtends extends Thread{
	
	public void run() {
		System.out.println("This is my runable statement.....");
	}
	public static void main(String[] args) {
		try {
			TestByExtends te=new TestByExtends();
			te.start();
			te.start();
		} catch (IllegalThreadStateException e) {
			System.out.println(e);
		}
		
	}
	

}
