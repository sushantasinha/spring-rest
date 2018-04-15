package spring.sample.spring_rest.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

import spring.sample.spring_rest.Model.Emp;
import spring.sample.spring_rest.Model.Product;

@Service("productService")
public class ProductServiceImpl {
	
	List<Product> productList = new ArrayList<Product>(Arrays.asList(
			new Product("PRO1", "Product Description One"),
			new Product("PRO2", "Product Description Two"),
			new Product("PRO3", "Product Description Three")
			));
	
	
	public List<Product> getAllProductDetails(){
		return 	productList;
	}
	
	public Product getProductDetails(String productId) {
		return productList.stream().filter(p -> p.getProductId().equals(productId)).findAny().get();
	}
	
}