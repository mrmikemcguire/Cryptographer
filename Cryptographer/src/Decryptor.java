
public class Decryptor
	{
	static String spacelessReversedText, decryptedText; 
	static StringBuffer reorderedText;
	
	public static void decryptor()
		{
		reStripSpaces();
		replaceOriginalLetters();
		reReverse();
		replaceOriginalSpaces();
		replaceInitialCapitalLetter();
		printOriginalCode();
		}
	
	public static String reStripSpaces()
		{
		spacelessReversedText = Encryptor.encodedText.replace(" ", "");
		return spacelessReversedText;
		}
	
	public static String replaceOriginalLetters()
		{
		spacelessReversedText = spacelessReversedText.replace("@", "a").replace("#", "e")
				.replace("$", "i").replace("%", "o").replace("&", "u").replace("*", "s").replace("+", "t");
		return spacelessReversedText;
		}

	public static StringBuffer reReverse()
		{
		StringBuffer regularSpacelessText = new StringBuffer(spacelessReversedText);
		reorderedText = regularSpacelessText.reverse();
		return reorderedText;
		}
	
	public static String replaceOriginalSpaces()
		{
		StringBuilder spaceReplacer = new StringBuilder(reorderedText);

		for (int i = (Encryptor.locationsOfSpaces.size()); i > 0; i--)
			{
			int spaces = ((int) Encryptor.locationsOfSpaces.get(i - 1));
			spaceReplacer.insert((spaces - i + 1), " ");
			}
		
		decryptedText = spaceReplacer.toString();
		return decryptedText;
		}
	
	public static String replaceInitialCapitalLetter()
		{
		decryptedText = decryptedText.substring(0, 1).toUpperCase() +
				decryptedText.substring(1);
		return decryptedText;
		}
	
	public static void printOriginalCode()
		{
		System.out.println();
		System.out.println("The original message was: " + decryptedText);
		}
	
	}
