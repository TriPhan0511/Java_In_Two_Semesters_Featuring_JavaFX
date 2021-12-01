package readingandwritingtotextfiles;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * This sample read a text file, Poem.txt, character by character,
 * and builds a string by appending each character as it is read.
 * The process continues until the end of the file is reached, or
 * until a stipulated number of characters have been reach. I put
 * this last condition in as a safeguard in case the user should 
 * try to display a very large file by mistake.
 * 
 * @version 1.0 2021-11-30
 * @author Tri Phan
 *
 */
public class CharacterByCharacter 
{
	public static void main(String[] args) 
	{
		readAndWrite();
	}
	
	private static void readAndWrite()
	{
//		Use try-with-resources to ensure file is closed safely
		try
		(
			FileReader textFile = new FileReader("src/readingandwritingtotextfiles/Poem.txt"); 
			BufferedReader textStream = new BufferedReader(textFile); 
		)
		{
			String str = "";
			final int MAX = 200;
			
			int ch; // to hold the integer (Unicode) value of the character
			char c; // to hold the character when type cast from integer
			int counter = 0; // to count the number of characters read so far
			ch = textStream.read(); // read the first character from the file
			c = (char) ch; // type cast from integer to character
			/* 
			 * continue through the file until either the end of the file is
			 * reached (in which case -1 is returned) or the maximum number
			 * of characters stipulated have been read 
			 * */
			while (ch != -1 && counter <= MAX)
			{
				counter++; // increment the counter
				str += c;
				ch = textStream.read();
				c = (char) ch;
			}
			
			str += "\n";
			System.out.println(str);
		}
		catch (IOException e)
		{
			System.out.println("\nThere was a problem reading the file.");
		}
	}
}




























