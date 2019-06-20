/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.composite;

/**
 * @author Administrator
 *
 */
public class CompositeClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Leaf leaf1 = new Leaf();
		Leaf leaf2 = new Leaf();
		Leaf leaf3 = new Leaf();
		Leaf leaf4 = new Leaf();
		
		CompositeComponent composite1 = new CompositeComponent();
		CompositeComponent composite2 = new CompositeComponent();
		CompositeComponent composite3 = new CompositeComponent();
		
		composite2.addComponent(leaf1);
		composite2.addComponent(leaf3);
		composite2.addComponent(leaf2);
		
		composite1.addComponent(leaf4);
		
		composite3.addComponent(composite2);
		composite3.addComponent(composite1);
		
		composite3.operation();
	}

}
