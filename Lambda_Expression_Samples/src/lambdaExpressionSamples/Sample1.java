package lambdaExpressionSamples;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

public class Sample1 
{
	public static void main(String[] args)
	{
		/*
		 * Sample 1: Using lambda expression to iterate over a List and perform some
		 * actions on the list elements.
		 * 
		 * In this sample, we are iterating over the list and printing all the list
		 * elements in the standard output.
		 */
		
//		List<String> pointList = new ArrayList<>();
//		pointList.add("1");
//		pointList.add("2");
//		pointList.add("3");
//		pointList.add("4");
//		pointList.add("5");
//		
//		pointList.forEach(p -> { System.out.println(p); });
		
		/*
		 * Sample 2: Using lambda expression to create and start a Thread in Java
		 * 
		 * In the given sample, we are passing the instance of Runnable interface
		 * into the Thread constructor.
		 */
		
//		new Thread(() -> {
//			System.out.println("howtodoinjava"); 
//		}).start();
		
		/*
		 * Sample 3: Using lambda expression for adding an event listener to a
		 * GUI component.
		 */
		
		JButton button = new JButton("submit");
		button.addActionListener((e) -> {
			System.out.println("Click event triggered !!");
		});
	}
}





































