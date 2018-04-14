package spring.sample.spring_rest.Model;

public class Product {
	
	public Product(String productId, String productDesc) {
		super();
		this.productId = productId;
		this.productDesc = productDesc;
	}
	private String productId;
	private String productDesc;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

}
