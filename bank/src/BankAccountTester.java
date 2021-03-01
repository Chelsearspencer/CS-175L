import java.util.Scanner;

public class BankAccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter initial bank account balance: ");
		double startBal = input.nextDouble();
		
		System.out.println("Enter the interest rate for this account: ");
		double interestPct = input.nextDouble(); 
		
		BankAccount myBankAccount = new BankAccount(startBal);
		
		System.out.println("Imput amount you want to deposit: ");
		double deposit =input.nextDouble();
		myBankAccount.deposit(deposit);
		
		System.out.println("Imput amount you want to withdraw: ");
		double withdraw =input.nextDouble();
		myBankAccount.withdraw(withdraw);
		System.out.println("Imput amount you want to withdraw: ");
		double withdraw1 =input.nextDouble();
		myBankAccount.withdraw(withdraw1);
		
		System.out.println("If you want me to generate interest, enter 'Yes': ");
		String yes = input.next();
		myBankAccount.calcInterest(interestPct);
		
		System.out.println("Your balance is: " + myBankAccount.getBalance());
		
		in.close();
		input.close();
		{
		
			
		}
		
	}}
		
		