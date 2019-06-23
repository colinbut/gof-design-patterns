/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.decorator;

/**
 * @author Administrator
 *
 */
public class DecoratingClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ConcreteComponent concreteComponent = new ConcreteComponent();
		concreteComponent.displayMessage();
		
		ConcreteDecorator concreteDecorator = new ConcreteDecorator(concreteComponent);
		concreteDecorator.displayMessage();
	}

}
