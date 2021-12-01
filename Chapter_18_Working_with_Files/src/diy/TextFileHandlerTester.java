package diy;

public class TextFileHandlerTester 
{
	public static void main(String[] args) 
	{
		TextFileHandler tfHandler = new TextFileHandler();
		final String poemFile = "src/diy/Poem.txt";
		
		String s = tfHandler.readCharacterByCharacter(poemFile);
		System.out.println(s);
	}
}
