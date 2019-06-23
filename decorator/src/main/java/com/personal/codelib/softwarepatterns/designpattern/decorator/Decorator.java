/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.decorator;

/**
 * Abstract Decorator which gives common decorations.
 * 
 * @author Administrator
 *
 */
public abstract class Decorator implements Component {

	/* (non-Javadoc)
	 * @see com.personal.codelib.dp.decorator.Component#displayMessage()
	 */
	@Override
	public void displayMessage() {
		System.out.println("Displaying Message - In Decorator");
	}

}
