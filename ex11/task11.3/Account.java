/**
* Account Class
* @author Vlad Georgescu
*/
public class Account
{
   private final String accountName;
   private int currentBalance = 0;

   public Account(String accountName)
   {
        this.accountName = accountName;
   }

   public int increaseBalance(int pounds) 
   {
        this.currentBalance += 100 * pounds;
   }


}
