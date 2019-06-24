/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.factory.enhanced;


/**
 * @author Administrator
 *
 */
public abstract class AbstractFactoryStore {
	
	public abstract Product createProduct(String type); 
	
	/**
	 * Orders a product based on the type inputted.
	 * 
	 * @param type
	 * @return
	 */
	public Product orderProduct(String type){
		
		Product product = createProduct(type);
		
		//do additional stuff with Product
		
		return product;
	}

}
