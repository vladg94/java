/**
* Prints the result of a pow operation
* Tested for (2, 3) and (2, 1.7)
* @author Vlad Georgescu
*/
public class Power
{
    public static void main(String[] args)
    {
        int base = Integer.parseInt(args[0]);
        int pow = Integer.parseInt(args[1]);
        int result = 1;

        for (int count = 1; count <= pow; count = count + 1) {
            result = result * base;
        }

        System.out.println("The result for " + args[0] + " ^ " + args[1] 
            + " operation is " + result);
    }
}