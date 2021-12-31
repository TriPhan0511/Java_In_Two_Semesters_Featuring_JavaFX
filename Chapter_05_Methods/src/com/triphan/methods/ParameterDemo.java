package com.triphan.methods;

/**
 * This sample illustrate a thing: A method cannot change the original value of  a variable
 * that was passed to it as a parameter. The reason for this is that all that is being passed
 * to the method is a copy of whatever this variable contains. In other words, just a value.
 * The method does not have access to the original variable. Whatever value is passed is copied
 * to the parameter in the called method.
 * 
 * @version 1.0 2021-12-30
 * @author Tri Phan
 *
 */
public class ParameterDemo 
{
	public static void main(String[] args) 
	{
		int x = 10;
		demoMethod(x); // -> 25
		System.out.println(x); // -> 10
	}
	
	private static void demoMethod(int xIn)
	{
		xIn = 25;
		System.out.println(xIn);
	}
}
