import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * This program illustrates how you would get keyboard input 
 * before Java 5.0 provided the Scanner class.
 * @author Tri Phan
 */
public class KeyboardInput 
{
	public static void main(String[] args)
	{
		InputStreamReader input = new InputStreamReader(System.in); // to handle low-level details
		BufferedReader reader = new BufferedReader(input); // to handle high-level details
		
		try
		{
			System.out.print("Enter a string: ");
			String s = reader.readLine(); // gets a string of characters from the keyboard
			System.out.println("You entered: " + s);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
