/**
*
*
* @author Vlad Georgescu
*/
public class StudentsCalling
{   
    private static void newStudent(Student name)
    {
        System.out.print("The new student is ");
        System.out.println(name);
    }

    private static void newPhone(Phone mobilePhone)
    {
        System.out.println("Student named " + Student.getStudentName() + " buys phone " 
            + Phone.getPhone() + " with account " + Account.getAccountName());
        System.out.println(mobilePhone);
    }

    private static void toppingUp(Phone mobilePhone, int creditPoints)
    {
        if (mobilePhone == null) {
            System.out.println("No phone, zos");
            System.out.print(mobilePhone);
        }
        return;
        System.out.println("Student named " + Student.getStudentName() + " topped his credit with " 
            + creditPoints);
        Account.increaseBalance(creditPoints);
        System.out.println(mobilePhone);
    }

    private static void callingBitches(Phone mobilePhone, int noOfSeconds)
    {
        if (mobilePhone == null) {
            System.out.println("No phone, zos");
            System.out.println(mobilePhone);
        }
        return;
        
        Account.makeCall(noOfSeconds);
        System.out.prinln(mobilePhone);
    }

    private static void main(String[] args)
    {
        //Creating Student
        Student firstStudent = new Student ("Mirel Radoi");
        StudentsCalling.newStudent(firstStudent);

        Student secondStudent = new Student ("Pula Bleaga");
        StudentsCalling.newStudent(secondStudent);

        Account account1 = new Account("OIER");
        Phone phone1 = firstStudent.purchasePhone("CAZAN1800", account1);
        StudentsCalling.newPhone(phone1);


    }
}