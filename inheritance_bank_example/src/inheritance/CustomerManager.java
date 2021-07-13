package inheritance;

public class CustomerManager {
	
//	public void add(IndividualCustomer customer) {
//		
//		System.out.println(customer.customerNumber + " sisteme kaydedildi.");
//		
//	}
//
//	public void add(CorporateCustomer customer) {
//		
//		System.out.println(customer.customerNumber + " sisteme kaydedildi.");
//	}
	
	
	
	public void add(Customer customer) {        //Referanslar sayesinde di�er �zelliklere eri�ebiliyor !
		
		System.out.println(customer.customerNumber + " sisteme eklendi.");
	}
	
	//SOLID - open closed principle
	
	public void addMultiple(Customer[] customers) {
		
		for(Customer customer:customers) {
			
			add(customer);
		}
		
	}
}
