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

    public Phone purchasePhone(String phoneModel, String accountName)
    {
        Account phoneAccount = new Account(accountName);
        Phone newPhone = new Phone(phoneModel, phoneAccount);
        return newPhone;
    }

    //Top up method
    public int topUp(int pounds, Phone mobilePhone)
    {
        if (mobilePhone == null) {
            System.out.println("NO PHONE!!");
            return 0;
        } else {
            Account phoneAccount = this.mobilePhone.getAccount();
            return this.phoneAccount.increaseBalance(pounds);
        }
    }   
}   