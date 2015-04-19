/**
* Prints the largest square number less than or equal to the given number
* Tested for
* @author Vlad Georgescu
*/
public class LargestSquare
{
    public static void main(String[] args)
    {
        int myNumber = Integer.parseInt(args[0]);
        int squareRoot = 0;

        while (Math.pow(squareRoot, 2) < myNumber) {
            squareRoot = squareRoot + 1;
        }
        System.out.println("The largest square number is: " 
            + squareRoot);
    }
}