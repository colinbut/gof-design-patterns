/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.mediator;

/**
 * @author Administrator
 *
 */
public class MediatorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Mediator mediator = new Mediator();
		
		Class1 c1 = new Class1(mediator);
		Class2 c2 = new Class2(mediator);
		Class3 c3 = new Class3(mediator);
		Class4 c4 = new Class4(mediator);
		
		c1.execute();
		c4.execute();
		c2.execute();
		c3.execute();
	}

}
