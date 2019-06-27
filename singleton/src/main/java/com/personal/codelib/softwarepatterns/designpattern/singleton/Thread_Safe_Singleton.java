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
public class Thread_Safe_Singleton {
	
	private static Thread_Safe_Singleton instance = null;
	
	/*
	 * 
	 */
	private Thread_Safe_Singleton(){}
	
	/**
	 * Thread-Safe implementation but resource intensive!
	 * 
	 * @return the instance
	 */
	public static synchronized Thread_Safe_Singleton getInstance(){
		if(instance == null){
			instance = new Thread_Safe_Singleton();
		}
		return instance;		
	}
	

}
