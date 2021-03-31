
public class bankAccount {
	private double balance;
	   private double interestPct;
	   

	   /**
	      Constructs a bank account with zero balance.
	 * @param startBal 
	   */
	   public bankAccount(double startBal,double interestpct)
	   {
		balance = startBal ;
		interestPct = interestpct;
	   }

	   /**
	      Makes a deposit into this account.
	      @param amount the amount of the deposit
	   */
	 //  public void deposit(double amount)
	 //  {
	  //    balance = balance + amount;
	  //    System.out.println("   Deposited: " + amount);
	  // }

	   /**
	      Makes a withdrawal from this account, or charges a penalty if
	      sufficient funds are not available.
	      @param amount the amount of the withdrawal
	   */
	//   public void withdraw(double amount)
	 //  {
	      
		//   if ((balance - amount) > 0) { 
		//	   balance = balance - amount;
			//   System.out.println("   Withdrew: " + amount);
		 //  } 
		   //else {	
			// System.out.println("   Insufficient Funds to support withdrawal");
		 //  }
	      
	  // }
	   /**
	      Gets the current balance of this bank account.
	      @return the current balance
	   */
	  public void interest(double intPct) 
	  {
		  interestPct = intPct;
	  }
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
	   public double getinterestPct() {
		   return interestPct;
	}}