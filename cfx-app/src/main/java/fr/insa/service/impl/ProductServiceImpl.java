package fr.insa.service.impl;

import java.util.List;
import java.util.Optional;

import javax.jws.WebService;
import fr.insa.mock.ProductServiceMockDaoImpl;
import fr.insa.model.Product;
import fr.insa.service.ProductService;

//mention endpoint interface and serviceName
@WebService(endpointInterface = "fr.insa.service.ProductService", serviceName = "productService")
public class ProductServiceImpl implements ProductService {
	private ProductServiceMockDaoImpl productServiceMockImpl;

	public void setProductServiceMockImpl(ProductServiceMockDaoImpl productServiceMockImpl) {
		this.productServiceMockImpl = productServiceMockImpl;
	}

	
	public Product  getProduct(String productId) {
		System.out.println("getProduct()");
		System.out.println((ProductServiceMockDaoImpl.getProduct(productId)).getProductId());
		return (ProductServiceMockDaoImpl.getProduct(productId));
	}

	
	public List<Product> getAllProducts() {
		return ProductServiceMockDaoImpl.getAllProducts();
	}


	@Override
	public List<Product> searchProductByCriteria(String productName , String category) {
		return ProductServiceMockDaoImpl.searchProductByCriteria(productName,category);
	}
}
