package SimpleCode;

public class SmallThred extends Thread {
	@Override
	public void run() {
		Sample.printSmall();
		
	}
}
