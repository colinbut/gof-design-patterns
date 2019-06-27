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
public class Lazy_Initialisation_Singleton {
	
	private static Lazy_Initialisation_Singleton instance;
	
	/*
	 * Private constructor to prevent multiple instances
	 * created...
	 */
	private Lazy_Initialisation_Singleton(){}
	
	/**
	 * Retrieves the one and only instance. This is not Thread-Safe!
	 * 
	 * @return the instance
	 */
	public static Lazy_Initialisation_Singleton getInstance(){
		
		if(instance == null){
			instance = new Lazy_Initialisation_Singleton();
		}
		return instance;
	}

}
