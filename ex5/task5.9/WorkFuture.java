/**
* Prints some useless shit 
* Tested for 1994 2015, muie cacat
* @author Vlad Georgescu
*/
public class WorkFuture
{
    public static void main(String[] args)
    {
        int retirementAge = 68;
        int birthYear = Integer.parseInt(args[0]);
        int presentYear = Integer.parseInt(args[1]);

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

        System.out.println("You will retire in  " + presentYear);
    }
}