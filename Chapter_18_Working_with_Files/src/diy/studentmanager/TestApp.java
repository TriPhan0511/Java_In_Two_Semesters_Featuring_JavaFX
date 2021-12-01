package diy.studentmanager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestApp 
{
	public static void main(String[] args)
	{
		TestApp app = new TestApp();
		final String FILE_NAME = "src/diy/studentmanager/Poem.txt";
		app.readCharacterByCharacter(FILE_NAME);
		
	}
	
	public void readCharacterByCharacter(String fileName)
	{
		String s = "";
		try
		(
			FileReader textFile = new FileReader(fileName);
			BufferedReader textStream = new BufferedReader(textFile);
		)
		{
			int ch;
			char c;
			
			ch = textStream.read();
			while (ch != -1)
			{
				c = (char) ch;
				s += c;
				if (c == '\n')
				{
					System.out.println("A sentence: " + s);
					s = "";
				}
				ch = textStream.read();
			}
			System.out.println("A sentence: " + s);
			
		}
		catch (FileNotFoundException e)
		{
			System.out.println("\nThere is currently no records.");
		}
		catch (IOException e)
		{
			System.out.println("\nThere was a problem reading the file.");
		}
	}
}
