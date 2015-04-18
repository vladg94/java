/**
* Prints 3 lines of text with 3 variables
* Doesn`t need to be tested
* @author Vlad Georgescu 
*/
public class YearsBeforeRetirement
{
    public static void main(String[] args)
    {
        int myAgeNow;
        int retirementAge;
        int yearsBeforeRetirement;
        myAgeNow = 20;
        retirementAge = 65;
        yearsBeforeRetirement = retirementAge - myAgeNow;
        System.out.println("I am " + myAgeNow);
        System.out.println("Retirement in Romania is at " + retirementAge);
        System.out.println("I have to work " + yearsBeforeRetirement + " years from now on");
    }
}