/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.command;

/**
 * @author Administrator
 *
 */
public abstract class AbstractCommand implements Command {

	protected Receiver receiver;
	
	/**
	 * 
	 * @param receiver
	 */
	public AbstractCommand(Receiver receiver){
		this.receiver = receiver;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.command.Command#execute()
	 */
	public abstract void execute();

}
