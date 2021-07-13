package inheritance;

public class Main {

	public static void main(String[] args) {
		
		
		IndividualCustomer sinan=new IndividualCustomer();
		sinan.customerNumber="123456";
		
		
		CorporateCustomer ssa = new CorporateCustomer();
		ssa.customerNumber="987654";
		
		IndividualCustomer ela = new IndividualCustomer();
		ela.customerNumber="001402";		
		
		SendikaCustomer abcSendikasi=new SendikaCustomer();
		abcSendikasi.customerNumber="001453";
		
		
//		Burada yapýlan iþlem polimorfizm dir
		CustomerManager customerManager=new CustomerManager();
//		customerManager.add(ssa);
//		customerManager.add(sinan);
//		customerManager.add(ela);
//		customerManager.add(abcSendikasi);
		
		Customer[] customers= {ela,ssa,sinan,abcSendikasi};
		
		customerManager.addMultiple(customers);        //Polimorfizme gerçek hayat senaryo örneði !

	}

}
