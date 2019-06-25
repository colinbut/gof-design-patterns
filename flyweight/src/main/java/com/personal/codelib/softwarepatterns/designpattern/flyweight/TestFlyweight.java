/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.flyweight;

/**
 * @author Administrator
 *
 */
public class TestFlyweight {

	private static Flyweight[] flyweights = new ConcreteFlyweight[100];
	private static Context[] contexts = new Context[100];
	private static int count = 0;
	
	
	public static void action(String flyweight_id, int context_no, FlyweightFactory factory){
		flyweights[count] = factory.getFlyweight(flyweight_id);
		contexts[count++] = new Context(context_no);
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	
		FlyweightFactory factory = new FlyweightFactory();
		
		TestFlyweight.action("flyweight1", 1, factory);
		TestFlyweight.action("flyweight2", 45, factory);
		TestFlyweight.action("flyweight3", 2, factory);
		TestFlyweight.action("flyweight4", 89, factory);
		TestFlyweight.action("flyweight5", 7, factory);
		TestFlyweight.action("flyweight6", 6, factory);
		TestFlyweight.action("flyweight7", 11, factory);
		TestFlyweight.action("flyweight8", 3, factory);
		
		for(int i = 0; i < count; i++){
			flyweights[i].doSomething(contexts[i]);
			//System.out.println("");
		}
		System.out.println("");
		System.out.println("Total Flyweights done: " + factory.getFlyweightsTotal());
		
	}
}
