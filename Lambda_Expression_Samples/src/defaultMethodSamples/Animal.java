package defaultMethodSamples;

/*
 * Moveable interface defines a method move(); and provided a default implementation
 * as well. If any class implements this interface then it need not to implement it's
 * own version of move() method. It can directly call instance.move(); 
 */

public class Animal implements Moveable 
{
	 public static void main(String[] args)
	 {
		 Animal tiger = new Animal();
		 tiger.move();
//		 -> I am moving
	 }
}
