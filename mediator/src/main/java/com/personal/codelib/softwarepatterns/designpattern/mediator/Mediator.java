/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.mediator;

/**
 * @author Administrator
 *
 */
public class Mediator {
	
	/* private fields */
	
	private Class1 class1;
	private Class2 class2;
	private Class3 class3;
	private Class4 class4;
	
	/**
	 * Constructor
	 */
	public Mediator(){
		//does nothing
	}
	
	/**
	 * 
	 */
	public void registerClass1(Class1 c1){
		class1 = c1;
	}
	
	/**
	 * 
	 * @param c2
	 */
	public void registerClass2(Class2 c2){
		class2 = c2;
	}
	
	/**
	 * 
	 * @param c3
	 */
	public void registerClass3(Class3 c3){
		class3 = c3;
	}
	
	/**
	 * 
	 */
	public void registerClass4(Class4 c4){
		class4 = c4;
	}
	
	/**
	 * 
	 */
	public void doClass1Action(){
		System.out.println("Executing command for Class 1");
		class3.testAction1();
		class4.testAction2();
	}
	
	/**
	 * 
	 */
	public void doClass2Action(){
		System.out.println("Executing command for Class 2");
		class4.testAction1();
		class4.testAction3();
		//class4.testAction2();
		class1.testAction1();
	}
	
	/**
	 * 
	 */
	public void doClass3Action(){
		System.out.println("Executing command for Class 3");
		class3.testAction1();
		class4.testAction3();
		class2.testAction2();
		class1.testAction3();
	}
	
	/**
	 * 
	 */
	public void doClass4Action(){
		System.out.println("Executing command for Class 4");
		class2.testAction1();
		class2.testAction3();
		class2.testAction2();
		class1.testAction1();
	}

}
