/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.builder;

/**
 * @author Administrator
 *
 */
public class ConcreteBuilder extends Builder{
	
	/**
	 * Constructor
	 */
	public ConcreteBuilder(){
		//does nothing
	}

	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.builder.Builder#build()
	 */
	@Override
	public void build() {
		product.setNumber(235);
		product.setPrice(1.99);
		product.setText("Concrete Product");
	}
	
	

}
