package fr.insa.service.impl;

import java.util.List;
import java.util.Optional;

import javax.jws.WebService;

import fr.insa.mock.ProductServiceMockDaoImpl;
import fr.insa.model.Product;
import fr.insa.model.ProductOrdering;
import fr.insa.service.*;

@WebService(endpointInterface = "fr.insa.service.ProductOrderingService", serviceName = "productOrderingService")
public class ProductOrderingServiceImpl implements ProductOrderingService {
	private ProductServiceMockDaoImpl productServiceMockImpl;

	public void setProductServiceMockImpl(ProductServiceMockDaoImpl productServiceMockImpl) {
		this.productServiceMockImpl = productServiceMockImpl;
	}

	public ProductOrdering createProductOrdering(ProductOrdering productOrdering) {
		System.out.println("createProductOrdering()");

		Product findFirst = ProductServiceMockDaoImpl.getProduct(productOrdering.getProductId());

		// if (!findFirst.isPresent()) {
		// throw new Exception("No matches found.");
		// }

		ProductOrdering newOrderProduct = new ProductOrdering();
		newOrderProduct.setQuantity(productOrdering.getQuantity());
		newOrderProduct.setProductId(findFirst.getProductId());
		newOrderProduct.setId(Long.toString(System.currentTimeMillis()));

		ProductServiceMockDaoImpl.getProductOrderings().add(newOrderProduct);

		return newOrderProduct;
	}

	public List<ProductOrdering> getProductOrderings() {
		System.out.println("getProductOrderings()");

		return ProductServiceMockDaoImpl.getProductOrderings();
	}

	public ProductOrdering getProductOrdering(String productOrderingId) {
		System.out.println("getProductOrdering()");

		Optional<ProductOrdering> findFirst = ProductServiceMockDaoImpl.getProductOrderingById(productOrderingId);

		/*
		 * if (findFirst.isPresent()) { return findFirst.get(); } else { throw new
		 * Exception("No matches found."); }
		 */
		return findFirst.get();
	}

	@Override
	public void removeProductOrdering(String produtOrderingId) {
		System.out.println("removeProductOrdering()");

		Optional<ProductOrdering> findFirst = ProductServiceMockDaoImpl.getProductOrderingById(produtOrderingId);

		if (findFirst.isPresent()) {
			ProductServiceMockDaoImpl.getProductOrderings().remove(findFirst.get());
		}
	}

}
