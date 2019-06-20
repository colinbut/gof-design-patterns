/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.facade;

/**
 * @author Administrator
 *
 */
public class FacadeClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.executeAction();
	}

}
