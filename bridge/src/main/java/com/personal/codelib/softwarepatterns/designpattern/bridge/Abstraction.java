/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.bridge;

/**
 * @author Administrator
 *
 */
public abstract class Abstraction {
	
	protected Implementor implementor;
	
	/**
	 * 
	 * @param impl
	 */
	protected void setImplementor(Implementor impl){
		implementor = impl;
	}
	
	/**
	 * 
	 */
	public void operation(){
		implementor.operation();
	}

}
