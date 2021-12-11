package lambdaExpressionSamples;

/*
 * We know that lambda expressions are anonymous functions with no name and
 * they passed (mostly) to other functions as parameters. 
 * 
 * Well, in Java method parameters always have a type and the type information
 * is looked for determine which method needs to be called in case of method
 * overloading or even simple calling.
 * 
 * So, basically every lambda expression also must be convertible to some 'type'
 * to be accepted as method parameters 
 */

/*
 * Syntax:
 * A typical lambda expression syntax will be like this:
 * 
 * 		(parameters) -> expression
 */

/*
 * Features of lambda expressions in Java 8
 * 
 * _ A lambda expression can have zero, one or more parameters.
 * 
 * _ The type of the parameters can be explicitly declared or it can be inferred
 * 		from the context.
 * 
 * _ Multiple parameters are enclosed in mandatory parentheses and separated by 
 * 		commas. Empty parentheses are used to represent an empty set of parameters.
 *  
 *  	() -> expression
 *  
 *  	(param1, param2, param3) -> expression
 *  
 * _ When there is a single parameter, if its type is referred, it is not mandatory
 *	 	to use parentheses. e.g. a -> return a*a
 *  
 * _ The body of the lambda expressions can contain zero, one or more statements.
 * 
 * _ If the body of lambda expression has single statement, curly brackets are not 
 * 		mandatory and the return type of the anonymous function is the same as that
 * 		of the body expression. When there is more than one statement in the body
 * 		then these must be enclosed in curly brackets.
 * 
 * 		(parameters) -> { statements; }
 */

/*
 * Example:
 * 
 * The Runnable is a functional interface with a single method run(). So, when 
 * we pass a lambda expression to the constructor of Thread class, the compiler
 * tries to convert the expression into equivalent Runnable code as show in the
 * first code sample.
 * 
 * If the compiler succeeds then everything runs fine. If the compiler is not
 * able to convert the expression into an equivalent implementation code, it
 * will complain. Here, in the above example, the lambda expression is converted
 * to type Runnable.
 * 
 * Note: A lambda expression is an instance of a functional interface but the
 * lambda expression itself does not contain the information about which functional
 * interface it is implementing. This information is deduced from the context in
 * which expression is used.
 */

public class Introduction 
{
	public static void main(String[] args)
	{
//		Write a thread which will print "howtodoinjava" in the console
//		then simplest code will be:
		new Thread(new Runnable() {
			@Override
			public void run()
			{
				System.out.println("howtodoinjava");
			}
		}).start();
		
//		If we use the lambda expression for this task then code will be:
		new Thread(
				() -> { System.out.println("howtodoinjava2"); }
		).start();
	}
}







































