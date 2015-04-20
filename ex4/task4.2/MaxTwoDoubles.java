/**
* Prints the max between two doubles
* Tested for (7.4;7.3), (2;6.3), (3.2;3.2).
* Exception given for mini 12 
* @author Vlad Georgescu 
*/
public class MaxTwoDoubles
{
    public static void main(String[] args)
    {
        double firstDouble = Double.parseDouble(args[0]);
        double secondDouble = Double.parseDouble(args[1]);
         
        System.out.println("max(" + firstDouble + ", " + secondDouble + "):"); 
        
        if (firstDouble > secondDouble) {
            System.out.println(firstDouble);
        } else {
            System.out.println(secondDouble);
        }
    }
}