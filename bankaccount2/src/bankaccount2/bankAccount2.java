package bankaccount2;

public class bankAccount2 {

	private String name;
	private double balance;
	private int acct;
	private static int accountNumber = 0;

	
	public bankAccount2(String name,int initialBalance)
	{
		this.balance = initialBalance;
		this.name = name;
		accountNumber++;
		this.acct = accountNumber;
		
	}
	/**
	 * Constructs a bank account with a zero balance
	 * @return 
	 */
	public void bankAccount2()
	{
		balance = 0;
	}
	/**
	 * Constructs a bank account with a given balance
	 * @param initialBalance the initial balance
	 * @return 
	 */

	/**
	 * Deposits money into the bank account
	 * @param amount the amount to deposit
	 */
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	/**
	 * Withdraws money from the bank account
	 * @param amount the amount to withdraw
	 */
	public void withdraw(double amount)
	{
		if (amount>balance) 
		{
			throw new IllegalArgumentException("WD amount "+amount+" exceeds balance of "+balance);
		}
		balance = balance - amount;
	}
	/**
	 * Gets the current balance of the bank account
	 * @return the current balance
	 */


	public double getBalance()
	{
		return balance;
	}
	public String getAccount()
	{
		return this.name+" " + this.acct+" " + this.balance;
	}
	public double anyAccount(bankAccount2 otherAccount) 
	{
		return otherAccount.getBalance();
	}
	public void transfer(double amount,bankAccount2 otherAccount) 
	{
		balance = balance - amount;
		otherAccount.deposit(amount);

	
	
	
}
}
