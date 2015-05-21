/**
* Phone Class
* 
* @author Vlad Georgescu
*/
public class Phone
{
    private final String phoneModel;
    private final Account accountName;
    private int noOfSeconds = 0;

    public Phone(String phoneModel, Account accountName)
    {
        this.phoneModel = phoneModel;
        this.accountName = accountName;
    }

    public Phone(int noOfSeconds)
    {
        this.noOfSeconds = noOfSeconds;
    }

    public String getPhone()
    {
        return this.phoneModel;
    }

    public int getSeconds()
    {
        return this.noOfSeconds;
    }

    public String toString()
    {
        return "Student(" + this.getStudentName() + ", Phone(" + this.getPhone()
            + ", " + this.getSeconds() + ", Account(" + this.getAccountName()
            + ", " + this.getBalance() + ")";
    }
}