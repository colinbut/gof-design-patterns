/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * The flyweight factory
 *
 * 
 * @author Administrator
 *
 */
public class FlyweightFactory {
	
	/* private fields */
	
	private Map<String, Flyweight> flyweights = null;
	
	/**
	 * Constructor
	 */
	public FlyweightFactory(){
		flyweights = new HashMap<String, Flyweight>();
	}
	
	/**
	 * Gets the size of the flyweight sizes
	 * 
	 * @return the flyweight list size
	 */
	public int getFlyweightsTotal(){
		return flyweights.size();
	}
	
	/**
	 * Gets the flyweight object from the given flyweight id
	 * 
	 * @param flyweight_id the id
	 * @return the flyweight object
	 */
	public Flyweight getFlyweight(String flyweight_id){
		
		Flyweight flyweight = flyweights.get(flyweight_id);
		
		if(flyweight == null){
			flyweight = new ConcreteFlyweight();
			flyweights.put(flyweight_id, flyweight);
		}
		
		return flyweight;
		
	}

}
