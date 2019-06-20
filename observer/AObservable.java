/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.observer;

import java.util.*;
/**
 * @author Administrator
 *
 */
public abstract class AObservable {

	private boolean isChanged = false;
	private ArrayList<IObserver> observers = new ArrayList<IObserver>();
	
	/**
	 * 
	 * @param obj
	 */
	public void addObservers(IObserver obj){
		observers.add(obj);
	}
	
	/**
	 * 
	 */
	public void notifyObservers(){
		if(isChanged){
			for(int i = 0; i < observers.size(); i++){
				observers.get(i).update(this, null);
			}
		}
		isChanged = false;
	}
	
	/**
	 * 
	 * @param arg
	 */
	public void notifyObservers(Object arg){
		if(isChanged){
			for(int i = 0; i < observers.size(); i++){
				observers.get(i).update(this, arg);
			}
		}
		isChanged= false;
	}
	
	/**
	 * 
	 */
	public void setChanged(){
		isChanged = true;
	}
}
