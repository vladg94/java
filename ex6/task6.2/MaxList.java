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
       
        for (int index = 0; index < args.length; index++) {
            double currentValue = Double.parseDouble(args[index]);         
            if (maxSoFar < currentValue) {
                maxSoFar = currentValue;
            } 
        }
        System.out.println("The biggest number is " + maxSoFar);
    }
}