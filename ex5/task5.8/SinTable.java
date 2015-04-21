/**
* Prints a sin table 
* Tested for (0 10 90) (4 5 muieGhitescu)
* @author Vlad Georgescu 
*/
public class SinTable 
{
    public static void main(String[] args)
    {
        
        int increment = Integer.parseInt(args[1]);
        int endingPoint = Integer.parseInt(args[2]);

        System.out.println("----------------------------------------------");
        System.out.println("Sin table from " + args[0] + " to " + args [2] 
            + " in steps of " + args[1]);
        System.out.println("----------------------------------------------");

        for (int firstValue = Integer.parseInt(args[0]); firstValue <= 90; 
            firstValue = firstValue + increment) {
            System.out.println("sin(" + firstValue + ")" + " = "
                + Math.sin(Math.toRadians(firstValue)));
            
        }
        System.out.println("----------------------------------------------");
    }
}