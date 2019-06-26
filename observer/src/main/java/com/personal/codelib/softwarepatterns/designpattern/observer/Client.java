/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.observer;

/**
 * @author Administrator
 *
 */
public class Client implements IObserver{

	private Subject subject = null;
	
	/**
	 * Constructor
	 */
	public Client(){
		subject = new Subject();
		
		subject.addObservers(this); //register with the observer
	}
	
	/**
	 * 
	 */
	public void doAction(){
		subject.action();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.observer.IObserver#update(com.personal.codelib.dp.observer.AObservable, java.lang.Object)
	 */
	@Override
	public void update(AObservable observable, Object arg) {
		
		System.out.println("Notified by Subjects.");
		
	}

}
