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

    /**
    * Construct a new phone.
    *
    * @param phoneModel the name of the phone.
    * @param phoneAccount the account of the phone.
    */
    public Phone(String phoneModel, Account phoneAccount)
    {
        this.phoneModel = phoneModel;
        this.phoneAccount = phoneAccount;
    }
    
    /**
    * Get the account.
    *
    * @return an Account variable. 
    */
    public Account getAccount()
    {
        return this.phoneAccount;
    }

    /**
    * This method stores a given time of seconds in the 
    * instance variable seconds.
    *
    * @param seconds the seconds the student can talk on the phone.
    */
    public void memorizeSeconds(int seconds) 
    {
        this.seconds += seconds;
    }

    /**
    * Provides a phone(model, seconds, account(provider, balance)) representation.
    *
    * @return a String format of this representation.
    */
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