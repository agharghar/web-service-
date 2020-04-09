package fr.insa.client;


import fr.insa.service.Product;
import fr.insa.service.ProductService;
import fr.insa.service.ProductServiceService;

public class ProductClient {
	public static void main(String[] args) {
        try {
            ProductServiceService productServiceSvc = new ProductServiceService();
            ProductService productService = productServiceSvc.getProductServicePort();
            System.out.println("toto");
            Product product = productService.getProduct("101");
            System.out.println(product.getProductId());
            System.out.println(product.getProductName());
            System.out.println(product.getProductCatg());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
