/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.strategy;

/**
 * A concrete strategy object.
 * 
 * @author Administrator
 *
 */
public class ConcreteStrategyC implements Strategy{

	/**
	 * Constructor
	 */
	public ConcreteStrategyC(){
		//does nothing
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.strategy.Strategy#performStrategy()
	 */
	@Override
	public void performStrategy() {
		System.out.println("Performing Strategy C!");
	}

}
