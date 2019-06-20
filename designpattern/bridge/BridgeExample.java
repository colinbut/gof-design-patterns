/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.bridge;

/**
 * @author Administrator
 *
 */
public class BridgeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Abstraction refinedAbstraction = new RefinedAbstraction();
		refinedAbstraction.setImplementor(new ConcreteImplementor1());
		refinedAbstraction.operation();
		refinedAbstraction.setImplementor(new ConcreteImplementor2());
		refinedAbstraction.operation();
	}

}
