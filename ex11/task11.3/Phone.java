/**
* Phone Class
* Tested for 20, 21.2
* @author Vlad Georgescu
*/
public class Phone
{
    private final String phoneModel;
    private final Account phoneAccount;
    private int seconds = 0;

    //Constructor method
    public Phone(String phoneModel, Account phoneAccount)
    {
        this.phoneModel = phoneModel;
        this.phoneAccount = phoneAccount;
    }
    
    //Get the name of the account
    public Account getAccount()
    {
        return this.phoneAccount;
    }

    //The phone should keep track of the calls made on it 
    //Tracking the calls means to store the seconds of every call
    //in a variable.
    public void memorizeSeconds(int seconds) 
    {
        this.seconds += seconds;
    }

    public String toString()
    {
        return "Phone(" + this.phoneModel + ", " + this.seconds + ", " + this.phoneAccount + ")"; 
    } 

    /*
    public static void main(String[] args)
    {
        //Creating new Phone object 
        Phone testPhone = new Phone("TestModel", new Account("testAccount"));

        //Testing the memorization method
        testPhone.memorizeSeconds(20);
        System.out.println(testPhone.seconds);
    }
    */ 
}
