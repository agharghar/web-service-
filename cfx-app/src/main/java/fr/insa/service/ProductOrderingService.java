package fr.insa.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import fr.insa.model.ProductOrdering;

@WebService
public interface ProductOrderingService {
	@WebMethod
	public ProductOrdering createProductOrdering(ProductOrdering productOrdering);
	
	@WebMethod
	public List<ProductOrdering> getProductOrderings() ;
	
	@WebMethod
	public ProductOrdering getProductOrdering(@WebParam(name="id") String productOrdering);
	
	@WebMethod
	public void removeProductOrdering(@WebParam(name="id") String produtOrderingId);

}
