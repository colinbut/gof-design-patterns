/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.builder;

/**
 * 
 * 
 * @author Administrator
 *
 */
public abstract class Builder {
	
	protected Product product;
	
	public abstract void build();
	
	/**
	 * Gets the product
	 * 
	 * @return the product 
	 */
	public Product getResult(){
		return product;
	}
	
	/**
	 * Creates the product
	 */
	public void createProduct(){
		product = new Product();
	}

}
