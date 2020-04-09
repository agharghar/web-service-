package fr.insa.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Product")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	private String productId;
	private String productName;
	private String productCatg;

	public Product() {
	}

	public Product(String productId, String productName, String productCatg) {
		this.productId = productId;
		this.productName = productName;
		this.productCatg = productCatg;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCatg() {
		return productCatg;
	}

	public void setProductCatg(String productCatg) {
		this.productCatg = productCatg;
	}
}
