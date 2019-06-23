/**
 * 
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.chainofresponsibility;

/**
 * @author Administrator
 *
 */
public abstract class Handler {
	
	protected Handler successor;
	
	/**
	 * Sets the successor
	 * 
	 * @param handler the new handler to set
	 */
	public void setSuccessor(Handler handler){
		this.successor = handler;
	}
	
	/**
	 * Handle the request
	 * 
	 * @param req the request to handle
	 */
	public abstract void handle(Request req);

}
