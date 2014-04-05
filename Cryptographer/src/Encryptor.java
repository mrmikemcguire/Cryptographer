import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Encryptor
	{
	static String originalSentence;
	static String textInBlocks;
	
	public static String encryptor()
		{
		System.out.println("Please enter your sentence to be encrypted: ");
		Scanner userInput = new Scanner(System.in);
		originalSentence = userInput.nextLine();
		userInput.close();
		originalSentence = originalSentence.toLowerCase();
		
		ArrayList locationsOfSpaces = new ArrayList();
		for (int i = 0; i < originalSentence.length(); i++)
			{
			if (originalSentence.substring(i, i + 1).equals(" "))
				{
				locationsOfSpaces.add(i);
				}
			}
		
		System.out.println("Spaces are located at indices");
		for (int i = 0; i < locationsOfSpaces.size(); i++)
			{
			System.out.println(locationsOfSpaces.get(i));
			}
			
		originalSentence = originalSentence.replace(" ","");
		System.out.println("Your text without spaces is " + 
		originalSentence);
	
		StringBuffer reversedText = new StringBuffer(originalSentence);
		reversedText = reversedText.reverse();
		System.out.println("Your reversed text is " + reversedText);
		
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
		System.out.println("The substituted text now reads " + reversedText);
	
		StringBuilder separator = new StringBuilder(reversedText);

		for(int i = 0; i < reversedText.length() / 5; i++) 
			{
		    separator.insert(((i + 1) * 5) + i, " ");
			}
		textInBlocks = separator.toString();
		
		System.out.println("The final output is " + textInBlocks);
		return textInBlocks;

		}
	}
