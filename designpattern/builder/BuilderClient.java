/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.builder;

/**
 * @author Administrator
 *
 */
public class BuilderClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Builder customBuilder = new ConcreteBuilder();
		
		Director director = new Director();
		director.addBuilder(customBuilder);
		
		director.execute();
		
	}

}
