/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.builder;

/**
 * 
 * @author Administrator
 *
 */
public class Product {
	
	/* private fields */
	private int number = 0;
	private String text = "Text";
	private double price = 0.98;
	
	/**
	 * Constructor
	 */
	public Product(){
		//does nothing.. 
		//initialization is done in fields
	}
	
	/**
	 * Gets the number
	 * 
	 * @return number the number
	 */
	public int getNumber() {
		return number;
	}
	
	/**
	 * Sets the number
	 * 
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	
	/**
	 * Gets the text
	 * 
	 * @return text the text
	 */
	public String getText() {
		return text;
	}
	
	/**
	 * Sets the text
	 * 
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	
	/**
	 * Gets the price
	 * 
	 * @return price the price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Sets the price
	 * 
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

}
