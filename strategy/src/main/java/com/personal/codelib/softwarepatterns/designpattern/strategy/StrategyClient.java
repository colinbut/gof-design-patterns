/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.strategy;

/**
 * @author Administrator
 *
 */
public class StrategyClient {
	
	/* private fields */
	
	private Strategy strategy = null;
	
	/**
	 * Constructor
	 */
	public StrategyClient(){
		ConcreteStrategyA strategyA = new ConcreteStrategyA();
		ConcreteStrategyB strategyB = new ConcreteStrategyB();
		ConcreteStrategyC strategyC = new ConcreteStrategyC();
		
		setStrategy(strategyA);
		executeStrategy();
		
		setStrategy(strategyC);
		executeStrategy();
		
		setStrategy(strategyB);
		executeStrategy();
	}
	
	/**
	 * Executing the stategy
	 */
	public void executeStrategy(){
		strategy.performStrategy();
	}
	
	/**
	 * Sets the strategy to use
	 * 
	 * @param strategy the strategy chosen
	 */
	public void setStrategy(Strategy strategy){
		this.strategy = strategy;
	}

}
