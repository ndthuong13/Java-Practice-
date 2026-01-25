package bank;

public class Account {
	private String name;
	private String number;
	private float deposit;
	private float withdraw;
	
	public Account() {
		
	}
	
	public Account(String name, String number, float deposit, float withdraw) {
		this.name = name;
		this.number = number;
		this.deposit = deposit;
		this.withdraw = withdraw;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public float getDeposit() {
		return deposit;
	}

	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}

	public float getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(float withdraw) {
		this.withdraw = withdraw;
	}

	@Override
	public String toString() {
		return "Account [name: " + this.getName() + ", number: " + this.getNumber() + ", deposit: " +this.getDeposit() + ", withdraw: " + this.getWithdraw() + "]";
	}
	
	
}
