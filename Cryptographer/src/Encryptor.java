import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Encryptor
	{
	static String originalSentence;
	static String textInBlocks;
	static ArrayList locationsOfSpaces = new ArrayList();

	public static String encryptor()
		{
		System.out.println("Please enter your sentence to be encrypted: ");
		Scanner userInput = new Scanner(System.in);
		originalSentence = userInput.nextLine();
		userInput.close();
		originalSentence = originalSentence.toLowerCase();
		
		for (int i = 0; i < originalSentence.length(); i++)
			{
			if (originalSentence.substring(i, i + 1).equals(" "))
				{
				locationsOfSpaces.add(i);
				}
			}
					
		originalSentence = originalSentence.replace(" ","");
	
		StringBuffer reversedText = new StringBuffer(originalSentence);
		reversedText = reversedText.reverse();
		
		for (int i = 0; i < reversedText.length(); i++)
			{
			switch (reversedText.substring(i,i +1))
			{
			case "a":
				{
				reversedText.replace(i, i +1, "@");
				break;
				}
			case "e":
				{
				reversedText.replace(i, i +1, "#");
				break;
				}
			case "i":
				{
				reversedText.replace(i, i +1, "$");
				break;
				}
			case "o":
				{
				reversedText.replace(i, i +1, "%");
				break;
				}
			case "u":
				{
				reversedText.replace(i, i +1, "&");
				break;
				}
			}
		}
	
		StringBuilder separator = new StringBuilder(reversedText);

		for(int i = 0; i < reversedText.length() / 5; i++) 
			{
		    separator.insert(((i + 1) * 4) + i, " ");
			}
		textInBlocks = separator.toString();
		
		System.out.println();
		System.out.println("The final output is " + textInBlocks);
		return textInBlocks;
		}
	}
