/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.abstractfactory;

/**
 * 
 * 
 * @author Administrator
 *
 */
public interface AbstractFactory {
	
	/**
	 * Creates the object
	 * 
	 * @return the object created
	 */
	public IObject createObject();

}
