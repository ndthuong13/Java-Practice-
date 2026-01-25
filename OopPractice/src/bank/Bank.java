package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Account> accountList = new ArrayList<>();
	
	//Add account	
	public void addAccount(String name, String number, float deposit, float withdraw) {
		accountList.add(new Account(name, number, deposit, withdraw));
	}
	//remove Account with completely full detail
	public boolean removeAccount(String name, String number, float deposit, float withdraw) {
		accountList.removeIf(accountList -> 
			accountList.getName().equalsIgnoreCase(name) &&
			accountList.getNumber().equalsIgnoreCase(number) && 
			accountList.getDeposit() == deposit &&
			accountList.getWithdraw() == withdraw
			);
		return true;
	}
	
	//show account detail
	public void showAccountDetail() {
		if(!accountList.isEmpty()) {
			for (Account acc : accountList) {
				System.out.println(acc);
			}
		}else {
			System.out.println("List Null");
		}
	
	}
}
