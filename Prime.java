import java.lang.Math;
import java.lang.Exception.*;

public class Prime
{
	public static void main(String [] args)
	{
		if(args.length > 0)
		{
			for(String s : args)
			{
				try
				{
					int n = Integer.parseInt(s);
					System.out.println(n + ", " + isPrime(n));
				}
				catch(NumberFormatException e)
				{
					System.out.println(s + " is not a number.");
				}
			}
		}
		else
			System.out.println("Re-run program with integers as arguments.");	
	}

	public static boolean isPrime(int n)
	{
		for(int a = 2; a < Math.sqrt(n); a++)
			if(n % a == 0)
				return false;
		return true;
	}
}
