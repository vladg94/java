/**
* Prints 3 lines of text with 3 variables
* Users Age is a comand line argument 
* For testing I have used the next command line arguments: Ginica, 1.23, 314, 20
* First 2 crashed the program
* The third one gave me an inappropiately result
* @author Vlad Georgescu 
*/
public class YearsBeforeRetirement
{
    public static void main(String[] args)
    {
        int myAgeNow;
        int retirementAge;
        int yearsBeforeRetirement;
        myAgeNow = Integer.parseInt(args[0]);
        retirementAge = 65;
        yearsBeforeRetirement = retirementAge - myAgeNow;
        System.out.println("I am " + myAgeNow);
        System.out.println("Retirement in Romania is at " + retirementAge);
        System.out.println("I have to work " + yearsBeforeRetirement + " years from now on");
    }
}