/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.factorymethod.enhanced;

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
	 * 
	 * @return
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * 
	 * @param productName
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * 
	 * @return
	 */
	public String getProductDesc() {
		return productDesc;
	}

	/**
	 * 
	 * @param productDesc
	 */
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	/**
	 * 
	 * @return
	 */
	public int getProductSerial() {
		return productSerial;
	}

	/**
	 * 
	 * @param productSerial
	 */
	public void setProductSerial(int productSerial) {
		this.productSerial = productSerial;
	}
	
	

}
