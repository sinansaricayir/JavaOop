package inheritance2;

public class Main {

	public static void main(String[] args) {

		
		LogManager logManager = new LogManager();
		logManager.log(1);
		logManager.log(2);
		logManager.log(3);
		
		System.out.println("------------------------");
		
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(new DatabaseLogger());
		customerManager.add(new FileLogger());
		customerManager.add(new EmailLogger());
		

		
		
				
		
	}

}
