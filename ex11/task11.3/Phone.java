/**
* Phone Class
* 
* @author Vlad Georgescu
*/
public class Phone
{
    private final String phoneModel;
    private final Account phoneAccount;
    private int seconds = 0;


    public Phone(String phoneModel, Account phoneAccount)
    {
        this.phoneModel = phoneModel;
        this.phoneAccount = phoneAccount;
    }
    
    public Account getAccount()
    {
        return this.phoneAccount;
    }

    public int keepTrackOfSeconds(int secondsToTrack) 
    {
        return this.seconds += secondsToTrack;
    }

    public String toString()
    {
        return "Phone(" + this.phoneModel + ", " + this.seconds + ", " + this.phoneAccount + ")"; 
    } 
}