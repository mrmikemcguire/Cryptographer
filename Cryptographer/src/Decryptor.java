
public class Decryptor
	{

	public static StringBuffer decryptor()
		{
		// strip spaces from 5-character blocks
		String spacelessReversedText = Encryptor.textInBlocks.replace(" ", "");
		// replace original letters
		for (int i = 0; i < spacelessReversedText.length(); i++)
			{
			switch (spacelessReversedText.substring(i,i +1))
			{
			case "xx":
				{
				spacelessReversedText.replace("xx", "a");
				break;
				}
			case "vv":
				{
				spacelessReversedText.replace("vv", "e");
				break;
				}
			case "kk":
				{
				spacelessReversedText.replace("kk", "i");
				break;
				}
			case "qq":
				{
				spacelessReversedText.replace("qq", "o");
				break;
				}
			case "jj":
				{
				spacelessReversedText.replace("jj", "u");
				break;
				}
			}
		System.out.println(spacelessReversedText);
		}
		// reverse to original direction
		StringBuffer regularSpacelessText = new StringBuffer(spacelessReversedText);
		regularSpacelessText = regularSpacelessText.reverse();
		System.out.println(regularSpacelessText);
		return regularSpacelessText;
		// convert to lower case
					// originalSentence = originalSentence.toLowerCase();
		// record index locations of spaces
		// remove spaces
			// originalText = originalText.replace(" ","");
			// System.out.println("Your text without spaces is " + originalText);
		// reverse 

		// replace letters
		// break up into five-character blocks

		}

	}
