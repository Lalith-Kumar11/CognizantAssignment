package Products;

public class product {
	public int productId;
	public String productName;
	public String productCategory;
	public Double productPrice;
	
	public product(int productId,String productName, String productCategory,Double productPrice) {
		this.productId=productId;
		this.productName=productName;
		this.productCategory=productCategory;
		this.productPrice=productPrice;
	}
	
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public Double getProductPrice() {
		return productPrice;
	}

	
	
}
