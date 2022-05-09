

/**
 * 
 * @author jalp
 * 
 * This class represents a product which is present in a grocery store stacks,
 * 
 * A product has a name, stock number, Brand, and product type
 *
 */


public class Product {
	
	
	
	// this are the instance variables of the products 
	
	private String name;
	
	private int stockNumber;
	
	private String Brand;
	
	private String productType;
	
	/**
	 * Default constructor creates a garbage product which can be used for comparisons of products
	 */
	
	
	public Product() {
		this.name = null;
		this.stockNumber = -1;
		this.Brand = null;
		this.productType = null;
	}
	
	/**
	 * Creates a special products
	 * @param name
	 * @param stockNum
	 * @param Brand
	 * @param type
	 */
	
	public Product(String name, int stockNum, String Brand, String type) {
		this.name = name;
		this.stockNumber = stockNum;
		this.Brand = Brand;
		this.productType = type;
	}
	
	
	/**
	 * Getter method for name of the product
	 * @return 
	 */
	
	
	public String getName() {
		return name;
	}
	
	/**
	 * Setter method for the name 
	 * @param name
	 */

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Getter method for stock number
	 * @return
	 */

	public int getStockNumber() {
		return stockNumber;
	}
	
	/**
	 * Setter method for the stock number
	 * @param stockNumber
	 */

	public void setStockNumber(int stockNumber) {
		this.stockNumber = stockNumber;
	}
	
	/**
	 * Getter method for the brand of the product
	 * @return
	 */

	public String getBrand() {
		return Brand;
	}
	
	/**
	 * Setter method for the brand of the product
	 * @param brand
	 */

	public void setBrand(String brand) {
		Brand = brand;
	}
	
	/**
	 * Getter method for product type
	 * @return
	 */

	public String getProductType() {
		return productType;
	}
	
	/**
	 * Setter method for the product type
	 * @param productType
	 */

	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	/**
	 * String representation of the product
	 */

	@Override
	public String toString() {
		return "Product [name=" + name + ", stockNumber=" + stockNumber + ", Brand=" + Brand + ", productType="
				+ productType + "]";
	}
	
	
	
	
	
	
	

}
