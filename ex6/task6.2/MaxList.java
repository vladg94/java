/**
* Prints the maximum number from a given list
* Tested for 
* @author Vlad Georgescu
*/
public class MaxList
{
    public static void main(String[] args)
    {
        double maxSoFar = Double.parseDouble(args[0]);
        int n = 1;

        for (double index = 0; index < args.length; index++) {
            if (maxSoFar < args[index]) {
                maxSoFar = args[index];
            } else if (maxSoFar == args[index]) {
                maxSoFar = args[index - n];
            }
            n++;
        }

        System.out.println("The biggest number is " + maxSoFar);
    }
}