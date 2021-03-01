/**
   A bank account has a balance and a mechanism for
   applying interest or fees at the end of the month.
*/
public class BankAccount
{
   private double balance;
   private double interestPct;
   

   /**
      Constructs a bank account with zero balance.
 * @param startBal 
   */
   public BankAccount(double startBal)
   {
	balance = startBal ;
	interestPct = .05;
	System.out.println("   Created new account with " +startBal+ " balance and interest rate " +interestPct);
	
   }

   /**
      Makes a deposit into this account.
      @param amount the amount of the deposit
   */
   public void deposit(double amount)
   {
      balance = balance + amount;
      System.out.println("   Deposited: " + amount);
   }

   /**
      Makes a withdrawal from this account, or charges a penalty if
      sufficient funds are not available.
      @param amount the amount of the withdrawal
   */
   public void withdraw(double amount)
   {
      
	   if ((balance - amount) > 0) { 
		   balance = balance - amount;
		   System.out.println("   Withdrew: " + amount);
	   } 
	   else {	
		 System.out.println("   Insufficient Funds to support withdrawal");
	   }
      
   }
   /**
      Gets the current balance of this bank account.
      @return the current balance
   */
   
   public void calcInterest(double amount)
   {
	   double interest = 0.00;
	   interest = (balance * interestPct);
	   balance = interest + balance; 
	   if ("yes" != null) {
		   System.out.println("   Interest: "+ interest); 
	   }
      }
   
   
   public double getBalance()
   {
      return balance;
   }
}

