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
public class ConcreteCommand2 extends AbstractCommand {

	/**
	 * Constructor
	 * 
	 * @param receiver
	 */
	public ConcreteCommand2(Receiver receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.personal.codelib.dp.command.AbstractCommand#execute()
	 */
	@Override
	public void execute() {
		receiver.doConcreteCommand2();
	}

}
