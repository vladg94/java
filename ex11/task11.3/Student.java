/**
* Student class.
* @author Vlad Georgescu
*/
public class Student
{   
    private final String studentName;
    private Phone mobilePhone = null;
    
    /**
    * Constructor a new Student.
    * 
    * @param A string name of the student.
    */
    public Student(String studentName)
    {
        this.studentName = studentName;
    }

    /**
    * Creates a new mobile phone for a student.
    *
    * @param Takes two parameters one String name of the model of the phone
    * and another String for the account name.
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
    * @param Integer value of pounds.
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
    * @param int desired seconds
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
    * @return representation under a string format.
    */
    public String toString()
    {
        return "Student(" + this.studentName + ", " + this.mobilePhone + ")";
    }
}   
