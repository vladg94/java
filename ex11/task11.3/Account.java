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

   public void increaseBalance(int pounds) 
   {
        this.currentBalance += 100 * pounds;
   }

   public int accountCallFunction(int seconds)
   {
        if (seconds >= this.currentBalance) {
            seconds = this.currentBalance;
            this.currentBalance = 0;
            System.out.println("The result should be truncated to " + seconds);
            return seconds;
        } else {
            this.currentBalance -= seconds;
            return seconds;
        }
   }

   public String toString()
   {
        return "Account(" + this.accountName + ", " + this.currentBalance + ")";
   }
}
