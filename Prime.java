public class Prime
{
	public static void main(String [] args)
	{
		int max = Integer.parseInt(args[0]);
		boolean prime;
		boolean primer;
		for(int a = 2; a <= max; a++)
		{
			prime = true;
			for(int b = 2; b <= a / 2; b++)
			{
				if (a%b == 0)
					prime = false;
			}
			if (prime)
			{
				System.out.print(a + ", ");
			}
		}
		System.out.println();
	}
}
