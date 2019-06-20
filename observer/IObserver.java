/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.observer;

/**
 * @author Administrator
 *
 */
public interface IObserver {

	/**
	 * 
	 * @param observable the observable model object
	 * @param arg 		 an optional argument	
	 */
	public void update(AObservable observable, Object arg);
}
