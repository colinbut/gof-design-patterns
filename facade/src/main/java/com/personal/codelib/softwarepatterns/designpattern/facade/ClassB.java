/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.facade;

/**
 * Class B
 * 
 * @author Administrator
 *
 */
public class ClassB {
	
	/* private fields */
	private String name = "Name";
	private int age = 23;
	
	/**
	 * Constructor
	 */
	public ClassB(){
		//does nothing
	}
	
	/**
	 * Gets the name
	 * 
	 * @return name the name of the class
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name
	 * 
	 * @param name the name of the class
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the age
	 * 
	 * @return age the age of the class
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Sets the age
	 * 
	 * @param age the age of the class
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
