/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.builder;

import java.util.*;

/**
 * 
 * 
 * @author Administrator
 *
 */
public class Director {

	/* private fields */
	
	private List<Builder> builders = null;
	
	/**
	 * Constructor
	 */
	public Director(){
		builders = new ArrayList<Builder>();
	}
	
	/**
	 * Directs the build
	 */
	public void execute(){
		
		construct();//build parts
		
		displayResults(); //get the build parts
		
	}
	
	/**
	 * Adds a builder to the list of builders.
	 * 
	 * @param builder the builder to be added
	 */
	public void addBuilder(Builder builder){
		builders.add(builder);
	}
	
	/**
	 * Constructs the building process
	 */
	public void construct(){
		
		for(Builder builder: builders){
			builder.createProduct();
			builder.build();
		}
	}
	
	/**
	 * Displays the build results
	 */
	public void displayResults(){
		
		for(Builder builder : builders){
			Product product = builder.getResult();
			System.out.println(product.getNumber() + " " + product.getPrice() + " " + product.getText());
		}
	}
	
}
