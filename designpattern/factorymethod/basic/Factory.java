package com.personal.codelib.softwarepatterns.designpattern.factorymethod.basic;

public class Factory {
	
	/**
	 * Constructor
	 */
	public Factory(){
		//does nothing
	}
	
	/**
	 * 
	 * 
	 * @param type the type of product to create
	 * @return the created product
	 */
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
