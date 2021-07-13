package Interfaces;

public class Main {
	

	public static void main(String[] args) {
		
		Logger[] loggers= {new FileLogger(),new DatabaseLogger(),new SmsLogger(),new EmailLogger()};
		
		

		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer sinan = new Customer(1,"Sinan","Sarýçayýr");
		
		customerManager.add(sinan);
		
		
		System.out.println("----------------------------------");
		
		
		
		CustomerManager customerManager2 = new CustomerManager(loggers);

		
		Customer burcu = new Customer(2,"Burcu","Sarýçayýr");
		
		customerManager2.delete(burcu);

		
		
	}

}
