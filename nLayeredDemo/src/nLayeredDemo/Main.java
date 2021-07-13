package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product= new Product(2,1,"Elma",12,50);
		Product product2= new Product(2,1,"Armut",24,60);


		
		//ToDo : Spring IoC ile çözülecek !
		ProductService productService = new ProductManager(new HibernateProductDao(),new JLoggerManagerAdapter());
		productService.add(product);
		
		System.out.println("------------------------------");
		
		ProductService productService2 = new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
		productService2.add(product2);
		
		
		
		
	}

}
