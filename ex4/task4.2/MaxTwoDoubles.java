/**
*Prints the max between two doubles
* Tested for 7.4 7.3 and 2 6.3, expected results given
* @author Vlad Georgescu 
*/

public class MaxTwoDoubles
{
    public static void main(String[] args)
    {
        double firtsDouble = Double.parseDouble(args[0]);
        double secondDouble = Double.parseDouble(args[1]);

        if (firtsDouble > secondDouble) {
            System.out.println("first one is bigger than the second one");
        
        else
            System.out.println("second one is bigger than the first one");
        }
    }
}