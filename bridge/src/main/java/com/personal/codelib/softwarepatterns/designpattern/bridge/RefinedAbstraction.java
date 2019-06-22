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
public class RefinedAbstraction extends Abstraction {
	
	/**
	 * Constructor
	 */
	public RefinedAbstraction(){
		//does nothing
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.bridge.Abstraction#operation()
	 */
	public void operation(){
		super.operation();
	}

}
