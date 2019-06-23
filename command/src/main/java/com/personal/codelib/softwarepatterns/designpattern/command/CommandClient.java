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
public class CommandClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Invoker invoker = new Invoker();
		
		Receiver receiver = new Receiver();
		
		Command command1 = new ConcreteCommand1(receiver);
		Command command2 = new ConcreteCommand2(receiver);
		Command command3 = new ConcreteCommand3(receiver);
		Command command4 = new ConcreteCommand4(receiver);
		Command command5 = new ConcreteCommand5(receiver);
		
		invoker.setCommand(command3);
		invoker.executeCommand();
		invoker.setCommand(command4);
		invoker.executeCommand();
		invoker.setCommand(command1);
		invoker.executeCommand();
		invoker.setCommand(command5);
		invoker.executeCommand();
		invoker.setCommand(command2);
		invoker.executeCommand();
	}

}
