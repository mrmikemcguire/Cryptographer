
public class Decryptor
	{
	static String decryptedText;
	
	public static StringBuffer decryptor()
		{
		// strip spaces from 5-character blocks
		String spacelessReversedText = Encryptor.textInBlocks.replace(" ", "");
		// replace original letters
		for (int i = 0; i < spacelessReversedText.length(); i++)
			{
			switch (spacelessReversedText.substring(i,i + 1))
				{
				case "@":
					{
					spacelessReversedText = spacelessReversedText.replace("@", "a");
					break;
					}
				case "#":
					{
					spacelessReversedText = spacelessReversedText.replace("#", "e");
					break;
					}
				case "$":
					{
					spacelessReversedText = spacelessReversedText.replace("$", "i");
					break;
					}
				case "%":
					{
					spacelessReversedText = spacelessReversedText.replace("%", "o");
					break;
					}
				case "&":
					{
					spacelessReversedText = spacelessReversedText.replace("&", "u");
					break;
					}
				}
		}
		System.out.println("The re-replaced text is " + spacelessReversedText);

		// reverse to original direction
		StringBuffer regularSpacelessText = new StringBuffer(spacelessReversedText);
		regularSpacelessText = regularSpacelessText.reverse();
		System.out.println("The re-reversed version is " + regularSpacelessText);
		
		// add spaces back in
		StringBuilder spaceReplacer = new StringBuilder(regularSpacelessText);
		//String [] tempString = new String[Encryptor.locationsOfSpaces.size()];
		//String [] tempStringArray = (String[]) Encryptor.locationsOfSpaces.toArray(tempString);

		for (int i = (Encryptor.locationsOfSpaces.size()); i > 0; i--)
			{
			int spaces = ((int) Encryptor.locationsOfSpaces.get(i - 1));
			System.out.println(spaces);
			spaceReplacer.insert((spaces - i + 1), " ");
			decryptedText = spaceReplacer.toString();
			decryptedText = decryptedText.substring(0, 1).toUpperCase() +
					decryptedText.substring(1);
			}

		System.out.println("The original message was " + decryptedText);
			
		return regularSpacelessText;
		}

	}
