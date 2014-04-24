public class Three
{
	public static void main (String [] args)
	{
		double first = Double.parseDouble(args[0]);
		double second = Double.parseDouble(args[1]);

		double change = second - first;
		int dollars = (int) change;
		int cents = (int)Math.round((change - dollars)*100);

		System.out.printf("Amount due: %.2f\nAmount Paid: %.2f\nChange: %.2f\n",
			first, second, change);

		int quarters = cents / 25;
		cents -= 25 * quarters;

		int dimes = cents / 10;
		cents -= 10 * dimes;

		int nickels = cents / 5;
		cents -= 5 * nickels;

		int pennies = cents;

		System.out.printf("Dollars: %d\nQuarters: %d\nDimes: %d\nNickels: %d\nPennies: %d\n",
			dollars, quarters, dimes, nickels, pennies);
	}
}