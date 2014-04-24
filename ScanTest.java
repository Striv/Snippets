import java.util.*;

public class ScanTest
{
    public boolean complete = false;
    public static void main (String [] args)
    {
        try{
            makeMove(Integer.parseInt(args[0]), 'X');
        }
        catch(Exception e)
        {

        }
    }

    public static void makeMove(int move, char theChar) throws Exception 
    {

        Scanner in = new Scanner(System.in);
        // Check to see if move is in bounds
        while(!complete)
        {
            System.out.println("TOP!!");
            if(move >= 0 && move <= 9)
            {
                if(move == 0)
                {
                    // Do Undo Code Here
                    complete = true;
                }
                else
                {
                    if(move != 3)
                    {
                        System.out.println("Good move, we're set.");
                        complete = true;
                    }
                    else
                    {
                        System.out.println("Board spot not empty, choose again.");
                        try
                        {
                            move = in.nextInt();
                        }
                        catch (Exception e)
                        {
                            System.out.println("Exception!!!!");
                            in.next();
                        }
                    }
                }
                
            }
            else
            {
                System.out.println("Not Valid Move");
            }

        }
        complete = false;           
    }
}