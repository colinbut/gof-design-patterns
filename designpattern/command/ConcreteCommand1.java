/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.command;

/**
 * @author Administrator
 *
 */
public class ConcreteCommand1 extends AbstractCommand {

	/**
	 * Constructor
	 * 
	 * @param receiver
	 */
	public ConcreteCommand1(Receiver receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.personal.codelib.dp.command.AbstractCommand#execute()
	 */
	@Override
	public void execute() {
		receiver.doConcreteCommand1();
	}

}
