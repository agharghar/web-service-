package fr.insa.mock;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.eclipse.persistence.internal.jpa.parsing.EqualsAssignmentNode;

import fr.insa.model.Product;
import fr.insa.model.ProductOrdering;

public class ProductServiceMockDaoImpl {
	private static List<Product> productList = new ArrayList<Product>();
	private static List<ProductOrdering> productOrderings = new ArrayList<>();

	static {
		Product p1 = new Product("101", "Laptop", "Electronics");
		Product p2 = new Product("102", "Bannana", "Fruits");
		Product p3 = new Product("103", "Pencil", "Stationary");
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
	}

	public static Product getProduct(String productId) {
		for (Product product : ProductServiceMockDaoImpl.getAllProducts()) {
			if (product.getProductId().equals(productId)) {
				return product;
			}
		}
		return null;

	}

	public static List<Product> getAllProducts() {
		return productList;
	}

	public static List<ProductOrdering> getProductOrderings() {
		return productOrderings;
	}

	public static Optional<ProductOrdering> getProductOrderingById(String productOrderingId) {
		return ProductServiceMockDaoImpl.getProductOrderings().stream()
				.filter(current -> current.getId().equals(productOrderingId)).findFirst();
	}

	public static List<Product> searchProductByCriteria(String productName, String category) {
		List<Product> products = new ArrayList<Product>() ; 
		for(Product product :productList)
			if(product.getProductName().equals(productName) || product.getProductCatg().equals(category))
				products.add(product);
		return products ;
	
	}
	
	
	
}