
public class Decryptor
	{
	static String spacelessReversedText; 
	static StringBuffer regularSpacelessText1;
	static String decryptedText;
	
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
		String spacelessReversedText = Encryptor.encodedText.replace(" ", "");
		System.out.println(spacelessReversedText);
		return spacelessReversedText;
		}
	
	public static String replaceOriginalLetters()
		{
		spacelessReversedText = spacelessReversedText.replace("@", "a").replace("#", "e")
				.replace("$", "i").replace("%", "o").replace("&", "u");
		System.out.println(spacelessReversedText);
		return spacelessReversedText;
		}

	public static StringBuffer reReverse()
		{
		StringBuffer regularSpacelessText = new StringBuffer(spacelessReversedText);
		regularSpacelessText1 = regularSpacelessText.reverse();
		return regularSpacelessText1;
		}
	
	public static String replaceOriginalSpaces()
		{
		StringBuilder spaceReplacer = new StringBuilder(regularSpacelessText1);

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
			
		//return regularSpacelessText;
		
	}
