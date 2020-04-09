package fr.insa.model;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;


@XmlRootElement(name = "ProductOrdering")
public class ProductOrdering {

	private String id;

	@JsonProperty("current_product")
	private String productId;

	@JsonProperty("quantity")
	private int quantity;

	public String getId() {
		return id;
	}

	public void setId(String Id) {
		this.id = Id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
}
