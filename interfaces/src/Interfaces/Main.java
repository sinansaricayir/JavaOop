package Interfaces;

public class Main {
	

	public static void main(String[] args) {
		
		Logger[] loggers= {new FileLogger(),new DatabaseLogger(),new SmsLogger(),new EmailLogger()};
		
		

		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer sinan = new Customer(1,"Sinan","Sar��ay�r");
		
		customerManager.add(sinan);
		
		
		System.out.println("----------------------------------");
		
		
		
		CustomerManager customerManager2 = new CustomerManager(loggers);

		
		Customer burcu = new Customer(2,"Burcu","Sar��ay�r");
		
		customerManager2.delete(burcu);

		
		
	}

}
