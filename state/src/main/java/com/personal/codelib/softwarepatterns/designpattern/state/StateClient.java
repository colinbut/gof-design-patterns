/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.state;

/**
 * @author Administrator
 *
 */
public class StateClient {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) { 
		
		StateContext context = new StateContext();
		context.executeActions("MONDAY");
		context.executeActions("TUESDAY");
		context.executeActions("WEDNESDAY");
		context.executeActions("THURSDAY");
		context.executeActions("FRIDAY");
		context.executeActions("SATURDAY");
		context.executeActions("SUNDAY");
	}
}
