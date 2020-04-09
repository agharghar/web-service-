package fr.insa.client;

import java.util.List;

import fr.insa.service.Product;
import fr.insa.service.ProductService;
import fr.insa.service.ProductServiceService;

public class ProductSearch {

	public List<Product> getResult(String productName, String catergory) {
		ProductServiceService productServiceService= new ProductServiceService() ; 
		ProductService productService = productServiceService.getProductServicePort() ; 
		return productService.searchProductsByCriteria(productName,catergory); 
	}
	
	public static void main(String[] args) {
		ProductSearch productSearch = new ProductSearch() ; 
		System.out.println(productSearch.getResult("Laptop", "Electronics"));
		
	}

}
