/**
* Prints out the degree earned by the student, uses if else statements.
* Tested for 32, 40, 51, 69, 70. Expected results given.
* @author Vlad Georgescu 
*/
public class DegreeCategory
{
    public static void main(String[] args)
    {
        double studentGrade = Double.parseDouble (args[0]);

        if (studentGrade < 32) {
            System.out.println("Fail!");
        } else if (studentGrade < 40) {
                System.out.println("Pass/ordinary degree!");
        } else if (studentGrade < 50) {
                System.out.println("Honours, third class!");
        } else if (studentGrade < 60) {
                System.out.println("Honours, second class, divion two!");
        } else if (studentGrade < 70) {
                System.out.println("Honours, second class, division one!");
        } else {
                System.out.println("Honours, firts class");
        } 
    }
}