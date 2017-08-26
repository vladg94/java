/**
* Account Class
* Tested for 20 80; 20 20.1
* @author Vlad Georgescu
*/
public class Account
{
   private final String accountName;
   private int currentBalance = 0;

   /**
   * Construct a new Account object.
   *
   * @param a String accountName, for the name of the account
   */
   public Account(String accountName)
   {
        this.accountName = accountName;
   }

   /**
   * Stores the value in pennies in the ballance of the account.
   *
   * @param int number of pounds.
   */
   public void increaseBalance(int pounds) 
   {
        this.currentBalance += 100 * pounds;
   }

   //Method to keep track of the balance of the account
   //When students choose to make a call 
   public int calculateBalance(int seconds)
   {
        if (seconds >= this.currentBalance) {
            seconds = this.currentBalance;
            this.currentBalance = 0;
            System.out.println("The result should be truncated to " + seconds);
        } 
        
        this.currentBalance -= seconds;
        return 0; 
   }

   public String toString()
   {
        return "Account(" + this.accountName + ", " + this.currentBalance + ")";
   }

   /*
   public static void main(String[] args)
   {
        //Creating a new account object
        Account testAccount = new Account("Test");

        //Updating currentBalance 
        testAccount.increaseBalance(80);
        System.out.println(testAccount.currentBalance);

        //Verifying the call function
        testAccount.calculateBalance(20);
        System.out.println(testAccount.currentBalance);

   }
    */
}
