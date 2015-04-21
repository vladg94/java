/**
* Prints a sin table 
* Tested for (0 10 90) (4 5 muieGhitescu)
* @author Vlad Georgescu 
*/
public class SinTable 
{
    public static void main(String[] args)
    {
        int firstValue = Integer.parseInt(args[0]);        
        int increment = Integer.parseInt(args[1]);
        int endingPoint = Integer.parseInt(args[2]);

        System.out.println("----------------------------------------------");
        System.out.println("Sin table from " + firstValue + " to " + endingPoint 
            + " in steps of " + increment);
        System.out.println("----------------------------------------------");

        for ( int currentValue = firstValue; currentValue <= 90; 
            currentValue = currentValue + increment) {
            System.out.println("sin(" + currentValue + ")" + " = "
                + Math.sin(Math.toRadians(currentValue)));
            
        }
        System.out.println("----------------------------------------------");
    }
}