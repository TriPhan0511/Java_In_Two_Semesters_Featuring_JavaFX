package com.triphan.methods;

/**
 * This sample illustrates about the variable scope.
 * @author Tri Phan
 *
 */
public class ScopeTest 
{
	public static void main(String[] args) 
	{
		int x = 1; // x is local to main
		int y = 2; // y is local to main
		method1(x, y); // call method1
	}
	
	private static void method1(int xIn, int yIn)
	{
		int z; // z is local to method1
		z = xIn + yIn;
		System.out.println(z);
	}
}
