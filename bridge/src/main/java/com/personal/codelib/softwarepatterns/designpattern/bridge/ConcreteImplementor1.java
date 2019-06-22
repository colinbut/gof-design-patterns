/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.bridge;

/**
 * @author Administrator
 *
 */
public class ConcreteImplementor1 extends Implementor{

	/**
	 * Constructor
	 */
	public ConcreteImplementor1(){
		//does nothing
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.bridge.Implementor#operation()
	 */
	@Override
	public void operation() {
		System.out.println("ConcreteImplementor1 Operation");
	}

}
