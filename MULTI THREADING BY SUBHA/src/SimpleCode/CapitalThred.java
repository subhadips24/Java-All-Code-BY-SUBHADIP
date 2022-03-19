package SimpleCode;

public class CapitalThred extends Thread {
	@Override
	public void run() {
		Sample.printCapital();
	}
}
