/**
* Student class
* @author Vlad Georgescu
*/
public class Student
{   
    private final String studentName;
    private Phone mobilePhone = null;
    
    public Student(String studentName)
    {
        this.studentName = studentName;
    }

    //Method to purchasePhone
    public void purchasePhone(String phoneModel, String accountName)
    {
        this.mobilePhone = new Phone(phoneModel, new Account(accountName));
    }

    //Top up method
    public void topUp(int pounds)
    {
        if (this.mobilePhone == null) {
            System.out.println("NO PHONE!!");
        } else {
            Account phoneAccount = this.mobilePhone.getAccount();
            phoneAccount.increaseBalance(pounds);
        }
    }   

    public void makeCall(int desiredSeconds) 
    {
        if (this.mobilePhone == null) {
            System.out.println("No PHONE!!");
        } else {
            Account phoneAccount = this.mobilePhone.getAccount();
            int secondsToTrack = phoneAccount.accountCallFunction(desiredSeconds);
            this.mobilePhone.keepTrackOfSeconds(secondsToTrack);
        }
    }

    public String toString()
    {
        return "Student(" + this.studentName + ", " + this.mobilePhone + ")";
    }
}   