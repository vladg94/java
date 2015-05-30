/**
* Student class
* Tested for "Ion Boloz", "Costel", "Gigel", 10, 20; "Ion Boloz", "Costel", "Gigel", 11, 12;
* 
* @author Vlad Georgescu
*/
public class Student
{   
    private final String studentName;
    private Phone mobilePhone = null;
    
    /**
    * Construct a new Student.
    * 
    * @param studentName the name of the student.
    */
    public Student(String studentName)
    {
        this.studentName = studentName;
    }

    /**
    * Provides the name of the student
    *
    * @return the name of the student
    */
    public String getName()
    {
        return this.studentName;
    }

    /**
    * Creates a new mobile phone for a student.
    *
    * @param phoneModel the name of the phone.
    * @param accountName the name of the provider.
    */
    public void purchasePhone(String phoneModel, String accountName)
    {
        this.mobilePhone = new Phone(phoneModel, new Account(accountName));
    }

    /**
    * Verifies if there is a mobile phone. 
    * If it is a mobile phone it increases it`s account by 
    * the given argument.
    *
    * @param pounds the number of pounds to top up the account.
    */
    public void topUp(int pounds)
    {
        if (this.mobilePhone == null) {
            System.out.println("NO PHONE!!");
        } else {
            Account phoneAccount = this.mobilePhone.getAccount();
            phoneAccount.increaseBalance(pounds);
        }
    }   

    /**
    * Verifies if there is a mobile phone.
    * If it is a mobile phone this method will calculate the Balance 
    * of the Account, then will calculate the seconds talked on that phone. 
    *   
    * @param desiredSeconds seconds on the phone.
    */
    public void makeCall(int desiredSeconds) 
    {
        if (this.mobilePhone == null) {
            System.out.println("No PHONE!!");
        } else {
            Account phoneAccount = this.mobilePhone.getAccount();
            int seconds = phoneAccount.calculateBalance(desiredSeconds);
            this.mobilePhone.memorizeSeconds(seconds);
        }
    }
    /**
    * Provides a Student(name, phone(model, seconds, account(provider, balance))) repesentation.
    *
    * @return the Student representation under a string format.
    */
    public String toString()
    {
        return "Student(" + this.studentName + ", " + this.mobilePhone + ")";
    }

    /*
    //main method for testing.
    public static void main(String[] args)
    {
        Student testStudent = new Student("ION BOLOZ");

        testStudent.purchasePhone("Costel", "Gigel");

        testStudent.topUp(10);

        testStudent.makeCall(10);

        System.out.println(testStudent);
    }
    */
}   