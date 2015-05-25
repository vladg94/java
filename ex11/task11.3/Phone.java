/**
* Phone Class
* 
* @author Vlad Georgescu
*/
public class Phone
{
    private final String phoneModel;
    private final Account phoneAccount;


    public Phone(String phoneModel, Account phoneAccount)
    {
        this.phoneModel = phoneModel;
        this.phoneAccount = phoneAccount;
    }
    
    public Account getAccount()
    {
        return this.phoneAccount;
    }
}