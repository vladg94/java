/**
* Work future using separate methods
* Tested for 2015 1994 1998 1996 2000 and 20.3 1950 1970 1980 2000
* @author Vlad Georgescu
*/
public class WorkFuture4
{
    //Method to calculate and print persons work future
    private static void printWorkFuture (int birthYear, int presentYear) 
    {
        int retirementAge = 68;

        int currentAge = presentYear - birthYear;

        System.out.println("You have " + (retirementAge - currentAge) 
            + " years to work your ass off");

        while (currentAge != retirementAge)
        {
            System.out.println("You are " + currentAge + " you have "
                + (retirementAge - currentAge) + " years left to work");
            
            currentAge++;
            presentYear++;
        }

        System.out.println("You will retire in " + presentYear);
    }

    //The main method
    public static void main(String[] args) 
    {   
        //Giving the present year value
        int presentYear = Integer.parseInt(args[0]);

        //Giving the birth years of the other persons
        int birthYear1 = Integer.parseInt(args[1]);
        int birthYear2 = Integer.parseInt(args[2]);
        int birthYear3 = Integer.parseInt(args[3]);
        int birthYear4 = Integer.parseInt(args[4]);

        printWorkFuture(birthYear1, presentYear);
        printWorkFuture(birthYear2, presentYear);
        printWorkFuture(birthYear3, presentYear);
        printWorkFuture(birthYear4, presentYear);
    }
}