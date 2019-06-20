/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.abstractfactory;

/**
 * @author Administrator
 *
 */
public class ObjectB implements IObject{

	/**
	 * Constructor
	 */
	public ObjectB(){
		//does nothing
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.softwarepatterns.designpattern.abstractfactory.IObject#doSomething()
	 */
	@Override
	public void doSomething() {
		System.out.println("I'm Object B");
	}

}
