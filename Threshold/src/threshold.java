import java.util.Scanner;
public class threshold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter initial bank account balance: ");
		double startBal = input.nextDouble();
		System.out.println("Enter the interest rate for this account: ");
		double interestpct = input.nextDouble(); 
		bankAccount myBankAccount = new bankAccount(startBal,interestpct);
		
		System.out.println("Enter a threshold: ");
		
		while (in.hasNextDouble()) {
			int numberOfMonths = 0;
			double threshold = in.nextDouble();
			double Balance = myBankAccount.getBalance();
			double Interest = myBankAccount.getinterestPct();
			
			while (Balance < threshold) {
				Balance = Balance + (Balance * Interest);
				numberOfMonths++;
			}
			System.out.println("Number of months till threshold is hit: " + numberOfMonths);

		}}}

