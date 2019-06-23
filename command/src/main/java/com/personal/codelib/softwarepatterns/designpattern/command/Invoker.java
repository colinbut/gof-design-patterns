/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.command;

/**
 * @author Administrator
 *
 */
public class Invoker {

	/* private fields */
	private Command command;
	
	/**
	 * Constructor
	 */
	public Invoker(){
		//does nothing
	}
	
	/**
	 * Sets the command
	 * 
	 * @param command the command to set
	 */
	public void setCommand(Command command){
		this.command = command;
	}
	
	/**
	 * Executes the command
	 */
	public void executeCommand(){
		command.execute();
	}

}
