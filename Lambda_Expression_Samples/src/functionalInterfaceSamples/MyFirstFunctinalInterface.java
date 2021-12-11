package functionalInterfaceSamples;

/**
 * This sample demonstrates about functional interfaces.
 * 
 * Functional interfaces are new additions in Java 8 which permit exactly 
 * one abstract method inside them. These interfaces are also called 
 * Single Abstract Method interfaces (SAM interfaces).
 * 
 * In Java 8, functional interfaces can be represented using lambda expressions,
 * method reference and constructor references as well. 
 * 
 * Java 8 introduces an annotation i.e @FunctionalInterface too, which can be 
 * used for compiler level errors when the interface you have annotated violates
 * the contracts of exactly one abstract method.
 * 
 * Conceptually, a functional interface has exactly one abstract method. Since
 * default methods have an implementation, they are not abstract. Since default
 * methods are not abstract you're free to add default methods to your functional
 * interface as many as you like.
 *   
 * If an interface declares an abstract method overriding one of the public methods
 * of java.lang.Object, that also does not count toward the interface's abstract
 * method count since any implementation of the interface will have an implementation
 * from java.lang.Object or elsewhere.    
 * 
 * @author Tri Phan
 *
 */

@FunctionalInterface
public interface MyFirstFunctinalInterface 
{	
//	An Abstract method
	public void firstWork();
	
//	A default method
	default void doSomeMoreWork1()
	{
//		Method body
	}
	
//	Another default method
	default void soSomeMoreWork2()
	{
//		Method body
	}
	
}
