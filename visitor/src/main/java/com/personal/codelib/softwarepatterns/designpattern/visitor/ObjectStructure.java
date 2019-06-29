/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.visitor;

import java.util.*;

/**
 * 
 * 
 * @author Administrator
 *
 */
public class ObjectStructure {

	/* private fields */
	private List<Element> elements = new ArrayList<Element>();
	
	/**
	 * Constructor
	 */
	public ObjectStructure(){
		//does nothing
	}
	
	/**
	 * 
	 * @param element
	 */
	public void attach(Element element){
		elements.add(element);
	}
	
	/**
	 * 
	 * @param element
	 */
	public void dettach(Element element){
		elements.remove(element);
	}
	
	/**
	 * 
	 * @param visitor
	 */
	public void accept(Visitor visitor){
		for(Element e : elements){
			e.accept(visitor);
		}
	}
	
}
