package defaultMethodSamples;

public class Airplane implements Moveable 
{
	public static void main(String[] args)
	{
		Airplane airplane = new Airplane();
		airplane.move();
//		-> I am flying.
	}
	
	@Override
	public void move()
	{
		System.out.println("I am flying.");
	}
}
