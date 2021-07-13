package Interfaces;

public class CustomerManager {
	
	private Logger[] loggers;


	public CustomerManager(Logger[] loggers) {
		
		this.loggers = loggers;

	}

	
	//Loosly - tightly coupled(gev�ek-s�k� ba�l�)
	public void add(Customer customer) {
		
		
		System.out.println("M��teri Eklendi " + customer.getFirstName() + " " + customer.getLastName());  
		
		Utils.runLoggers(loggers, customer.getFirstName());
		

		
	}
	
	public void delete(Customer customer) {
		
		
		System.out.println("M��teri Silindi " + customer.getFirstName() + " " + customer.getLastName());
		
		Utils.runLoggers(loggers, customer.getLastName());
		
		
		

		
	}
}
