package fr.insa.client;

import java.rmi.RemoteException;

import fr.insa.service.Product;
import fr.insa.service.ProductService;
import fr.insa.service.ProductServiceService;

public class MyClass {

	public Product getResult() throws RemoteException {

		ProductServiceService productServiceSvc = new ProductServiceService();
		ProductService productService = productServiceSvc.getProductServicePort();
		System.out.println("toto");
		Product product = productService.getProduct("102");
		return product;
	}

	public static void main(String[] args) throws RemoteException {

		MyClass c = new MyClass();
		System.out.println(c.getResult());

	}
}
