/**
* Account Class
* @author Vlad Georgescu
*/
public class Account
{
    private final String accountName = null;
    private int currentBalance = 0;

    public Account(String accountName)
    {
        this.accountName = accountName;
    }

    public int increaseBalance(int creditPoints)
    {
        currentBalance += creditPoints;
        return currentBalance;
    }

    public int makeCall(int noOfSeconds)
    {   
        //Price per second is one penny 
        if (currentBalance >= noOfSeconds) {
            currentBalance -= noOfseconds;
        } else {
            System.out.println("Not enough BANII, soz BOZZMAN");
        }
        return currentBalance;
    }

    public String getAccountName()
    {
        return accountName;
    }

    public int getBalance()
    {
        return currentBalance;
    }

    public String toString()
    {
        return "Student(" + this.getStudentName() + ", Phone(" + this.getPhone() 
            + ", " + this.getSeconds() + ", Account(" + this.getAccountName()
            + ", " + this.getBalance() + ")";
    }
}