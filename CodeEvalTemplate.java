import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main (String [] args)
    {
        try
        {
            Scanner in = new Scanner(new FileReader(args[0]));
            String [] vals;
            while(in.hasNext())
            {
                vals = in.nextLine().split("\\s");
                System.out.println();
            }    
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
