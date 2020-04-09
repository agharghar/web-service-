package fr.insa.service;

import java.util.List;
import java.util.Optional;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import fr.insa.model.Product;

@WebService
public interface ProductService {
	@WebMethod
	public Product getProduct(@WebParam(name = "productId") String productId);

	@WebMethod
	public List<Product> getAllProducts();
	
	@WebMethod
	public List<Product> searchProductByCriteria(@WebParam(name = "productName") String productName ,
			@WebParam(name = "category")String category);
	
}
