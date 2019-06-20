/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.factorymethod.basic;

/**
 * @author Administrator
 *
 */
public abstract class Product {
	
	/* private fields */
	private String productName = "";
	private String productDesc = "";
	private int productSerial = 02345;
	
	/**
	 * Constructor
	 * 
	 * @param name
	 * @param desc
	 * @param serial
	 */
	public Product(String name, String desc, int serial){
		productName = name;
		productDesc = desc;
		productSerial = serial;
	}

	/**
	 * Gets the product name
	 * 
	 * @return the name of the product
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * Sets the product name
	 * 
	 * @param productName the name of the product
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * Gets the product description
	 * 
	 * @return the description of the product
	 */
	public String getProductDesc() {
		return productDesc;
	}

	/**
	 * Sets the product description
	 * 
	 * @param productDesc the description of the product
	 */
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	/**
	 * Gets the product serial
	 * 
	 * @return the serial of the product
	 */
	public int getProductSerial() {
		return productSerial;
	}

	/**
	 * Sets the product serial
	 * 
	 * @param productSerial the serial of the product
	 */
	public void setProductSerial(int productSerial) {
		this.productSerial = productSerial;
	}
	
	

}
