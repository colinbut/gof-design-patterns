/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.bridge;

/**
 * @author Administrator
 *
 */
public class ConcreteImplementor2 extends Implementor{

	/**
	 * Constructor
	 */
	public ConcreteImplementor2(){
		//does nothing
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.bridge.Implementor#operation()
	 */
	@Override
	public void operation() {
		System.out.println("ConcreteImplementor2 Operation");
	}

}
