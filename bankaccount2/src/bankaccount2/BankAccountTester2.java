package bankaccount2;

import java.util.ArrayList;

public class BankAccountTester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <bankAccount2> accountList = new ArrayList<bankAccount2>();	
		
		bankAccount2 gil = new bankAccount2("Gil",500);
		bankAccount2 joe = new bankAccount2("Joe", 1000);
		bankAccount2 fred = new bankAccount2("Fred", 2000);
		bankAccount2 sally = new bankAccount2("Sally", 2500);
		
	
		accountList.add(gil);
		accountList.add(joe);
		accountList.add(fred);
		
		for(bankAccount2 account: accountList){
			System.out.println(account.getAccount());
			}
		
		accountList.add(sally);
		System.out.println(" ");
		
		
		String maxAccount = null;
		double max = 0;
		for (bankAccount2 account : accountList) {
				if (account.getBalance() > max) {
               max = account.getBalance();
               maxAccount = account.getAccount();
				}
				}
		System.out.println(maxAccount);

		
		System.out.println(" ");
		accountList.remove(sally);
		
	
	String maxAccount1 = null;
	double max1 = 0;
		for (bankAccount2 account : accountList) {
		        if (account.getBalance() > max1) {
		               max1 = account.getBalance();
		maxAccount1 = account.getAccount();
		}
		}
		System.out.println(maxAccount1);
		
	

				

	}}
