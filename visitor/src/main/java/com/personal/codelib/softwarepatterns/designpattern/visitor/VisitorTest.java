/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.visitor;

/**
 * @author Administrator
 *
 */
public class VisitorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ObjectStructure os = new ObjectStructure();
		os.attach(new ConcreteElementA());
		os.attach(new ConcreteElementB());
		
		ConcreteVisitor1 c1 = new ConcreteVisitor1();
		ConcreteVisitor2 c2 = new ConcreteVisitor2();
		
		os.accept(c1);
		os.accept(c2);
	}

}
