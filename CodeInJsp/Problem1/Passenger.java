class Passenger{
	void travel(){
		Conductor c1= new Conductor();
		c1.issueTicket();
		System.out.println("Let's Travel....");
	}
	
	public static void main(String[] args){
		
		Passenger p1=new Passenger();
		p1.travel();
		System.out.println("Happy Journy from Main method.....");
	}
}