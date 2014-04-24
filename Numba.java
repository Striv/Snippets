import java.lang.Math;

public class Numba 
{
	private final static int TEN = 10;

	public static void main (String [] args)
	{
		// Take number from console argument
		int num = Integer.parseInt(args[0]);
		System.out.printf("Number entered: %d\n", num);

		// Find first digit
		

		// Find number of digits
		int numDigits = (int)(Math.floor(Math.log10((double)num))) + 1;
		System.out.printf("Number of digits: %d\n", numDigits);

		// Find leading digit
		int leadingDigit = (int)(((double) num) / Math.pow((double) TEN, (double)numDigits-1));
		System.out.printf("Leading digit: %d\n", leadingDigit);
	}
}