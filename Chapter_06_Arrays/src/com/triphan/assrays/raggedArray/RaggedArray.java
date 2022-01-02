package com.triphan.assrays.raggedArray;

public class RaggedArray 
{
	public static void main(String[] args) 
	{
		char[][] animals = {
				{'M', 'O', 'N', 'K', 'E', 'Y'},
				{'C', 'A', 'T'},
				{'B', 'I', 'R', 'D'},
		};
		
		displayAnimals(animals);
	}
	
	private static void displayAnimals(char[][] animals)
	{
		for (int row = 0; row < animals.length; row++)
		{
			for (int col = 0; col < animals[row].length; col++)
			{
				System.out.print(animals[row][col]);
			}
			System.out.println();
		}
	}

}
