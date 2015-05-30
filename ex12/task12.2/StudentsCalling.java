/**
* Prints out the story of two students with phones.
* 
* Tested for "John Testatul", "Model de test", "Cont de pula", 20, 30 
* and 1, "Model de test", "Cont de pula", sloboz, 12.
* @author Vlad Georgescu
*/
public class StudentsCalling
{   
    private static void studentPurchase(Student student, String phoneModel, String accountName)
    {
        System.out.println(student.getName());
        System.out.println("Is buying phone " + phoneModel + " with account " + accountName);
        System.out.println("Result: ");
        student.purchasePhone(phoneModel, accountName);
        System.out.println(student);
        System.out.println();
    }

    private static void studentTopUp(Student student, int pounds)    
    {
        System.out.println(student.getName());
        System.out.println("Is topping up their phone with " + pounds + " pounds.");
        System.out.println("Result: ");
        student.topUp(pounds);
        System.out.println(student);
        System.out.println();
    }

    private static void studentMakeCall(Student student, int desiredSeconds)
    {
        System.out.println(student.getName());
        System.out.println("Is making a call for a desired period of " 
            + desiredSeconds + " seconds.");
        System.out.println("Result: ");
        student.makeCall(desiredSeconds);
        System.out.println(student);
        System.out.println();
    }
    
    /**
    * Main method of the StudentsCalling class
    * Prints out the story of the students with their stupid phones.
    */
    public static void main(String[] args)
    {
        //Creating the first student
        Student firstStudent = new Student("Miron Cozma");
        System.out.println("First student of our story is: ");
        System.out.println("Result: ");
        System.out.println(firstStudent);

        //Creating the second student
        Student secondStudent = new Student("Gogo Piola");
        System.out.println("The other student of our story is: ");
        System.out.println("Result: ");
        System.out.println(secondStudent);
        
        //First student buys phone
        StudentsCalling.studentPurchase(firstStudent, "Nokia", "Molozar");

        //Second student buys phone
        StudentsCalling.studentPurchase(secondStudent, "MotoX", "Smechelar");

        StudentsCalling.studentTopUp(firstStudent, 200);
        
        //Student attempt to make call
        StudentsCalling.studentMakeCall(firstStudent, 20000);

        //Student attempt to make call
        StudentsCalling.studentMakeCall(secondStudent, 1000);

        //Second student buys new phone
        StudentsCalling.studentPurchase(secondStudent, "SONYZ", "BAROSAN RED");

        //Second student top up
        StudentsCalling.studentTopUp(secondStudent, 1500);

        //Second student make call
        StudentsCalling.studentMakeCall(secondStudent, 2499);
    }
    
    
    /*
    //Main method used for testing
    //Should be commented when not in use
    public static void main(String[] args)
    {
        Student testStudent = new Student("John Testatul");

        //Student purcahse phone
        StudentsCalling.studentPurchase(testStudent, "ModelDeTest", "ContDePula");

        //Student top up phone
        StudentsCalling.studentTopUp(testStudent, 20);

        //Student making a call
        StudentsCalling.studentMakeCall(testStudent, 30);
    }
    */
}