/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.composite;

import java.util.*;

/**
 * @author Administrator
 *
 */
public class CompositeComponent implements Component {

	private List<Component> composites = new ArrayList<Component>();
	
	/**
	 * Constructor
	 */
	public CompositeComponent(){
		//does nothing
	}
	
	/* (non-Javadoc)
	 * @see com.personal.codelib.dp.composite.Component#operation()
	 */
	@Override
	public void operation() {
		
		for(Component component : composites){
			component.operation();
		}
	}
	
	/**
	 * Adds the component to the list of composites
	 * 
	 * @param component the component to add
	 */
	public void addComponent(Component component){
		composites.add(component);
	}
	
	/**
	 * Removes the component from the list of composites
	 * 
	 * @param component the component to remove
	 */
	public void removeComponent(Component component){
		composites.remove(component);
	}
	
	/**
	 * Gets the child of this class
	 * 
	 * @return null nothing to return
	 */
	public Component getChild(){
		return null;
	}

}
