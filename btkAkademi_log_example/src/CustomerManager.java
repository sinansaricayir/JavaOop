
public class CustomerManager {
	
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger){
		
		this.logger=logger;
		
	}
	
	public void add() {
		
		System.out.println("M��teri eklendi");
		
		logger.log("Log mesaj� ba�ar�l� !");
		
	}
	
		
	
	
}
