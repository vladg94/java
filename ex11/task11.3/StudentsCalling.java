/**
* PLM NU AM TIMP DE DASTEA
*
* @author Vlad Georgescu
*/
public class StudentsCalling
{   
    private static void studentPurchase(Student student, String phoneModel, String accountName)
    {
        System.out.println(student);
        System.out.println("Is buying phone " + phoneModel + " with account " + accountName);
        System.out.println("Result: ");
        student.purchasePhone(phoneModel, accountName);
        System.out.println(student);
    }

    private static void studentTopUp(Student student, int pounds)    
    {
        System.out.println(student);
        System.out.println("Is topping up their phone with " + pounds + " pounds.");
        System.out.println("Result: ");
        student.topUp(pounds);
        System.out.println(student);
    }

    private static void studentMakeCall(Student student, int desiredSeconds)
    {
        System.out.println(student);
        System.out.println("Is making a call for a desired period of " 
            + desiredSeconds + " seconds.");
        System.out.println("Result: ");
        student.makeCall(desiredSeconds);
        System.out.println(student);
    }

    public static void main(String[] args)
    {
        //Creating the first student
        Student firstStudent = new Student("Miron Cozma");
        System.out.println("One student of our story is: ");
        System.out.println("Result: ");
        System.out.println(firstStudent);

        //Creating the second student
        Student secondStudent = new Student("Gogo Piola");
        System.out.println("The other student of our story is: ");
        System.out.println("Result: ");
        System.out.println(secondStudent);
        
        //First student buys phone
        StudentsCalling.studentPurchase(firstStudent, "Nokia", "Molozar");

        //Seconds student buys phone
        StudentsCalling.studentPurchase(secondStudent, "MotoX", "Smechelar");

        StudentsCalling.studentTopUp(firstStudent, 200);
        
        //Student attempt to make call
        StudentsCalling.studentMakeCall(firstStudent, 20000);
    }
}