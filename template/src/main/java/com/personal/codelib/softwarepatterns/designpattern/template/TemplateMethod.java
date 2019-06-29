/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.template;

/**
 * Implementation of the "Template method". This class is 
 * abstract for subclasses to inherit this and provide their
 * own implementations for the hooks.
 * 
 * @author Administrator
 *
 */
public abstract class TemplateMethod {
	
	/**
	 * The "Template method".
	 */
	public final void template(){
		
		doSomething1();
		
		hook1();
		
		doSomething2();
		
		hook2();
		
		doSomething3();
		
		hook3();
		
		overrideThis();
	}
	
	/*
	 * A method that does something.
	 */
	private void doSomething1(){
		System.out.println("Do something 1");
	}
	
	/*
	 * Another method that does something
	 */
	private void doSomething2(){
		System.out.println("Do something 2");
	}
	
	/*
	 * Another private method that does something
	 */
	private void doSomething3(){
		System.out.println("Do something 3");
	}
	
	/**
	 * A hook.
	 */
	public abstract void hook1();
	
	/**
	 * Another hook.
	 */
	public abstract void hook2();
	
	/**
	 * Third hook.
	 */
	public abstract void hook3();
	
	/**
	 * Abstract method to be overridden in order to implement the 
	 * 'Template method'
	 */
	public abstract void overrideThis();

}
