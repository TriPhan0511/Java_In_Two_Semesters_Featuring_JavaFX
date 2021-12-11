package defaultMethodSamples;

/**
 * Default methods enable you add new functionality to the interfaces of your
 * libraries and ensure binary compatibility with code written for older versions
 * of those interfaces.
 * 
 * As name implies, default methods in Java 8 are simply default. If you do not
 * override them, they are the methods which be invoked by caller classes. They
 * are defined in interfaces.
 * 
 * 
 * @author Tri Phan
 *
 */

public interface Moveable 
{
	default void move()
	{
		System.out.println("I am moving.");
	}
}
