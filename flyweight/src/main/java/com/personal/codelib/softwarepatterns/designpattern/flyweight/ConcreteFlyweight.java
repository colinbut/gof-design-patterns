/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.flyweight;

/**
 * @author Administrator
 *
 */
public class ConcreteFlyweight implements Flyweight{

	/**
	 * Constructor
	 */
	public ConcreteFlyweight(){
		//does nothing
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.softwarepatterns.designpattern.flyweight.Flyweight#doSomething(com.personal.codelib.softwarepatterns.designpattern.flyweight.Context)
	 */
	@Override
	public void doSomething(Context context) {
		System.out.println("Doing something.. on " + context.getContextData());
	}

}
