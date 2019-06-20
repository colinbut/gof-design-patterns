/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.abstractfactory;

/**
 * @author Administrator
 *
 */
public class Application {
	
	/**
	 * Constructor
	 * 
	 * @param factory
	 */
	public Application(AbstractFactory factory){
		IObject object = factory.createObject();
		object.doSomething();
	}

}
