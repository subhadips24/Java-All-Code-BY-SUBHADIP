package SimpleCode;

public class MainThred {
	public static void main(String[] args) {
		
		System.out.println("Main is Startedd......");
		Thread t1=new CapitalThred();
		Thread t2=new SmallThred();
		t1.start();
		t2.start();
		System.out.println("Is thread alive...?..."+t1.isAlive());
		System.out.println("Main is ended......");
		System.out.println("Thank You.....!");
		System.out.println("Is thread alive...?..."+t1.isAlive());
		
	}

}
