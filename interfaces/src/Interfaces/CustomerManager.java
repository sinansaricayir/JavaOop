package Interfaces;

public class CustomerManager {
	
	private Logger[] loggers;


	public CustomerManager(Logger[] loggers) {
		
		this.loggers = loggers;

	}

	
	//Loosly - tightly coupled(gevþek-sýký baðlý)
	public void add(Customer customer) {
		
		
		System.out.println("Müþteri Eklendi " + customer.getFirstName() + " " + customer.getLastName());  
		
		Utils.runLoggers(loggers, customer.getFirstName());
		

		
	}
	
	public void delete(Customer customer) {
		
		
		System.out.println("Müþteri Silindi " + customer.getFirstName() + " " + customer.getLastName());
		
		Utils.runLoggers(loggers, customer.getLastName());
		
		
		

		
	}
}
