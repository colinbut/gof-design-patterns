/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.command;

/**
 * @author Administrator
 *
 */
public class ConcreteCommand5 extends AbstractCommand {

	/**
	 * Constructor
	 * 
	 * @param receiver
	 */
	public ConcreteCommand5(Receiver receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.personal.codelib.dp.command.AbstractCommand#execute()
	 */
	@Override
	public void execute() {
		receiver.doConcreteCommand5();
	}

}
