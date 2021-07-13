package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerSevice;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {

	//Dependcy Injection 
	private ProductDao productDao;
	private LoggerSevice loggerService;
	
	
	public ProductManager(ProductDao productDao,LoggerSevice loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService=loggerService;
	}

	

	@Override
	public void add(Product product) {

		if(product.getId()==1) {
			
			System.out.println("Bu kategoride ürün kabul edilemiyor ");
			
			return;
		}
		
		this.productDao.add(product);
		this.loggerService.logToSysyem("ProductManager ile loglandý "+product.getName());
		
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
