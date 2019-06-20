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
public class ConcreteStrategyB implements Strategy{

	/**
	 * Constructor
	 */
	public ConcreteStrategyB(){
		//does nothing
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.strategy.Strategy#performStrategy()
	 */
	@Override
	public void performStrategy() {
		System.out.println("Performing Strategy B!");
	}

}
