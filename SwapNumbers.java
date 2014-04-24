public class SwapNumbers
{
	public static void main (String [] args)
	{
		String word = args[0];
		int firstLetter = Integer.parseInt(args[1]) - 1;
		int secondLetter = Integer.parseInt(args[2]) - 1;
		System.out.println("Unswapped: " + word);

		char [] letters = word.toCharArray();
		char temp = letters[firstLetter];
		letters[firstLetter] = letters[secondLetter];
		letters[secondLetter] = temp;
		word = new String (letters);
		System.out.println("Swapped: " + word);
	}	
}