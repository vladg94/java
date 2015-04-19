/**
* Uses an if else and an if statement to print one of three cases.
* Tested for 32, 50, 70. Expected results given.
* @author Vlad Georgescu
*/
public class PassFailDistinction
{
    public static void main(String[] args)
    {
        double studentMark = Double.parseDouble(args[0]);

        if (studentMark < 50) {
            System.out.println("Fail");
        } else { 
            System.out.println("Pass");
        }
        if (studentMark >= 70) { 
            System.out.println("Distinction"); 
        }    
    }
}