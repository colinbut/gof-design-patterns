/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.factorymethod.basic;

/**
 * @author Administrator
 *
 */
public class FactoryStore {
	
	/* private fields */
	
	private Factory factory;
	
	/**
	 * Constructor
	 * 
	 * @param factory
	 */
	public FactoryStore(Factory factory){
		this.factory = factory;
	}
	
	
	/**
	 * Orders the product
	 * 
	 * @param type the type of the product to order
	 * @return the ordered product
	 */
	public Product orderProduct(String type){
		
		Product product = factory.createProduct(type);
		
		//do additional stuff with Product
		
		return product;
	}

}
