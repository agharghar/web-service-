
package fr.insa.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.insa.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Product_QNAME = new QName("http://service.insa.fr/", "Product");
    private final static QName _GetAllProducts_QNAME = new QName("http://service.insa.fr/", "getAllProducts");
    private final static QName _GetAllProductsResponse_QNAME = new QName("http://service.insa.fr/", "getAllProductsResponse");
    private final static QName _GetProduct_QNAME = new QName("http://service.insa.fr/", "getProduct");
    private final static QName _GetProductResponse_QNAME = new QName("http://service.insa.fr/", "getProductResponse");
    private final static QName _SearchProductsByCriteria_QNAME = new QName("http://service.insa.fr/", "searchProductsByCriteria");
    private final static QName _SearchProductsByCriteriaResponse_QNAME = new QName("http://service.insa.fr/", "searchProductsByCriteriaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.insa.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link GetAllProducts }
     * 
     */
    public GetAllProducts createGetAllProducts() {
        return new GetAllProducts();
    }

    /**
     * Create an instance of {@link GetAllProductsResponse }
     * 
     */
    public GetAllProductsResponse createGetAllProductsResponse() {
        return new GetAllProductsResponse();
    }

    /**
     * Create an instance of {@link GetProduct }
     * 
     */
    public GetProduct createGetProduct() {
        return new GetProduct();
    }

    /**
     * Create an instance of {@link GetProductResponse }
     * 
     */
    public GetProductResponse createGetProductResponse() {
        return new GetProductResponse();
    }

    /**
     * Create an instance of {@link SearchProductsByCriteria }
     * 
     */
    public SearchProductsByCriteria createSearchProductsByCriteria() {
        return new SearchProductsByCriteria();
    }

    /**
     * Create an instance of {@link SearchProductsByCriteriaResponse }
     * 
     */
    public SearchProductsByCriteriaResponse createSearchProductsByCriteriaResponse() {
        return new SearchProductsByCriteriaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.insa.fr/", name = "Product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProducts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.insa.fr/", name = "getAllProducts")
    public JAXBElement<GetAllProducts> createGetAllProducts(GetAllProducts value) {
        return new JAXBElement<GetAllProducts>(_GetAllProducts_QNAME, GetAllProducts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.insa.fr/", name = "getAllProductsResponse")
    public JAXBElement<GetAllProductsResponse> createGetAllProductsResponse(GetAllProductsResponse value) {
        return new JAXBElement<GetAllProductsResponse>(_GetAllProductsResponse_QNAME, GetAllProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.insa.fr/", name = "getProduct")
    public JAXBElement<GetProduct> createGetProduct(GetProduct value) {
        return new JAXBElement<GetProduct>(_GetProduct_QNAME, GetProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.insa.fr/", name = "getProductResponse")
    public JAXBElement<GetProductResponse> createGetProductResponse(GetProductResponse value) {
        return new JAXBElement<GetProductResponse>(_GetProductResponse_QNAME, GetProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchProductsByCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.insa.fr/", name = "searchProductsByCriteria")
    public JAXBElement<SearchProductsByCriteria> createSearchProductsByCriteria(SearchProductsByCriteria value) {
        return new JAXBElement<SearchProductsByCriteria>(_SearchProductsByCriteria_QNAME, SearchProductsByCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchProductsByCriteriaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.insa.fr/", name = "searchProductsByCriteriaResponse")
    public JAXBElement<SearchProductsByCriteriaResponse> createSearchProductsByCriteriaResponse(SearchProductsByCriteriaResponse value) {
        return new JAXBElement<SearchProductsByCriteriaResponse>(_SearchProductsByCriteriaResponse_QNAME, SearchProductsByCriteriaResponse.class, null, value);
    }

}
