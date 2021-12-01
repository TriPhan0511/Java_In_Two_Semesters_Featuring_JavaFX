package diy;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class TextFileHandler 
{
	public String readCharacterByCharacter(String fileName)
	{
		String s = "";
		try
		(
			FileReader textFile = new FileReader(fileName);
			BufferedReader textStream = new BufferedReader(textFile);
		)
		{
//			int MAX = 1000;
			int MAX = 3;
			int counter = 0;
			int ch;
			char c;
			ch = textStream.read(); // Read the first character of the file.
			c = (char) ch;
			while (ch != -1 &&  counter < MAX)
			{
				counter++;
				s += c;
				ch = textStream.read();
				c = (char) ch;
				
			}
		}
		catch (IOException e)
		{
			System.out.println("\nThere was a problem reading the file.");
		}
		return s;
	}
	
}
