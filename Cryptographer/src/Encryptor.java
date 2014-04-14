import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Encryptor
	{
	static String originalSentence, encodedText, reversedText, reversedTextString;
	static ArrayList locationsOfSpaces = new ArrayList();
	
	public static void encryptor()
		{
		getUserSentence();
		convertToLowerCase();
		recordLocationsOfSpaces();
		stripOutSpaces();
		replaceLetters();
		reverseLetters();
		separateLetters();
		printCodedOutput();
		}

	public static String getUserSentence()
		{
		System.out.println("Please enter your sentence to be encrypted: ");
		Scanner userInput = new Scanner(System.in);
		originalSentence = userInput.nextLine();
		userInput.close();
		return originalSentence;
		}
	
	public static String convertToLowerCase()
		{
		originalSentence = originalSentence.toLowerCase();
		return originalSentence;
		}
	
	public static void recordLocationsOfSpaces()
		{
		for (int i = 0; i < originalSentence.length(); i++)
			{
			if (originalSentence.substring(i, i + 1).equals(" "))
				{
				locationsOfSpaces.add(i);
				}
			}
		}
	
	public static String stripOutSpaces()
		{			
		originalSentence = originalSentence.replace(" ","");
		return originalSentence;
		}
	
	public static String replaceLetters()
		{
		originalSentence = originalSentence.replace("a", "@").replace("e", "#").replace("i", "$")
		.replace("o", "%").replace("u", "&").replace("s", "*").replace("t", "+");
		return originalSentence;
		}
	
	public static String reverseLetters()
		{
		StringBuffer reversedText = new StringBuffer(originalSentence);
		reversedText = reversedText.reverse();
		reversedTextString = reversedText.toString();
		return reversedTextString;
		}
		
	public static void separateLetters()
		{
		StringBuilder separator = new StringBuilder(reversedTextString);

		for(int i = 0; i < reversedTextString.length() / 5; i++) 
			{
		    separator.insert(((i + 1) * 4) + i, " ");
			}
		encodedText = separator.toString();
		}
	
	public static String printCodedOutput()
		{
		System.out.println();
		System.out.println("The encoded output is: " + encodedText);
		return encodedText;
		}
	}
	
