/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.singleton;

/**
 * @author Administrator
 *
 */
public class Singleton {

	private static Singleton instance = new Singleton();
	
	/*
	 * 
	 */
	private Singleton(){}
	
	/**
	 * 
	 * @return
	 */
	public static Singleton getInstance(){
		return instance;
	}
}
