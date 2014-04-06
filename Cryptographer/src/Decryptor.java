
public class Decryptor
	{
	static String decryptedText;
	
	public static StringBuffer decryptor()
		{
		String spacelessReversedText = Encryptor.textInBlocks.replace(" ", "");

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

		StringBuffer regularSpacelessText = new StringBuffer(spacelessReversedText);
		regularSpacelessText = regularSpacelessText.reverse();
		
		StringBuilder spaceReplacer = new StringBuilder(regularSpacelessText);

		for (int i = (Encryptor.locationsOfSpaces.size()); i > 0; i--)
			{
			int spaces = ((int) Encryptor.locationsOfSpaces.get(i - 1));
			spaceReplacer.insert((spaces - i + 1), " ");

			}
		decryptedText = spaceReplacer.toString();
		decryptedText = decryptedText.substring(0, 1).toUpperCase() +
				decryptedText.substring(1);
		
		System.out.println();
		System.out.println("The original message was: " + decryptedText);
			
		return regularSpacelessText;
		}
	}
