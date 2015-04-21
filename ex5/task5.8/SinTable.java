/**
* Prints a sin table 
* Tested for (0 10 90) (4 5 muieGhitescu)
* @author Vlad Georgescu 
*/
public class SinTable 
{
    public static void main(String[] args)
    {
        
        double increment = Double.parseDouble(args[1]);
        double endingPoint = Double.parseDouble(args[2]);

        System.out.println("----------------------------------------------");
        System.out.println("Sin table from " + args[0] + " to " + args [2] 
            + " in steps of " + args[1]);
        System.out.println("----------------------------------------------");

        for (double firstValue = Double.parseDouble(args[0]); firstValue <= 90; 
            firstValue = firstValue + increment) {
            System.out.println("sin(" + firstValue + ")" + " = "
                + Math.sin(Math.toRadians(firstValue)));
            
        }
        System.out.println("----------------------------------------------");
    }
}