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
public class FactoryStore extends AbstractFactoryStore{
	
	/**
	 * Constructor
	 */
	public FactoryStore(){
		//does nothing
	}

	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.factorymethod.version2.AbstractFactoryStore#createProduct(java.lang.String)
	 */
	@Override
	public Product createProduct(String type){
		
		if(type.equals("A")){
			return new ProductA("Product A", "A", 1);
		}
		else if(type.equals("B")){
			return new ProductB("Product B", "B", 2);
		}
		else if(type.equals("C")){
			return new ProductC("Product C", "C", 3);
		}
		else{
			return null;
		}
		
	}
}
