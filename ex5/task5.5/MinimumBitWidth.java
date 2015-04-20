/**
* Print number of bits needed to represent a given number of values   
* Tested for 18, john
* -
* @author Vlad Georgescu
*/
public class MinimumBitWidth
{
    public static void main(String[] args)
    {
        int noOfValues = Integer.parseInt(args[0]);
        int noOfBits = 0;
        int pow = 1;

        while (pow < noOfValues) {
            noOfBits = noOfBits + 1;
            pow = pow * 2;
        }

        System.out.println("Number of bits needed is " + noOfBits);
    }
}