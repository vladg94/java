/**
* Prints something
* Tested for 2015, 1994, 1996, avion, motor, gogonele
* @author Vlad Georgescu
*/
public class WorkFuture2
{
    public static void main(String[] args)
    {
        int retirementAge = 68;
        int presentYear = Integer.parseInt(args[0]);
        int birthYear1 = Integer.parseInt(args[1]);
        int birthYear2 = Integer.parseInt(args[2]);

        int presentYear1 = presentYear;
        int currentAge1 = presentYear1 - birthYear1;

        System.out.println("First Person have" + (retirementAge - currentAge1) 
            + " years to work his ass off");

        while (currentAge1 != retirementAge) {
            System.out.println("You are " + currentAge1 + " you have "
                + (retirementAge - currentAge1) + " years left to work");
            
            currentAge1++;
            presentYear1++;
        }

        System.out.println("The first person will retire in " + presentYear1);

        int presentYear2 = presentYear;
        int currentAge2 = presentYear2 - birthYear2;

        System.out.println("Second Person have " 
            + (retirementAge - currentAge2) + " years to work his ass off");

        while (currentAge2 != retirementAge) {
            System.out.println("You are " + currentAge2 + " you have "
                + (retirementAge - currentAge2) + " years left to work");

            currentAge2++;
            presentYear2++;
        }

        System.out.println("The second person will retire " + presentYear2);
    }
}
