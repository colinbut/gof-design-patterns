/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.abstractfactory;

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
