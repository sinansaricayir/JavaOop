package oopIntro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Product product1=new Product();
		product1.setId(1);
		product1.setName("H&P");
		product1.setDetail("8 GB RAM");
		product1.setDiscount(10);
		product1.setUnitPrice(1468);
		
		System.out.println(product1.getUnitPriceAfterDiscount());
		
	
		
		Product product2=new Product();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB RAM");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Product product3=new Product(3,"ACER",12000,"32 GB RAM",10);
		
		System.out.println(product3.getUnitPriceAfterDiscount());
		
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Yiyecek");
		
		
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Ýçecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		
		
		
		
		
		


	}

}
