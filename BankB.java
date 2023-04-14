// Create an abstract class "BankAccount" with a non-abstract method
// "getAccountNumber()".
// Implement two subclasses "SavingsAccount" and "CheckingAccount"
// which implement the "getAccountNumber()" method and also override
// the "withdraw()" and "deposit()" methods according to their own rules.

abstract class BankAccount{
	int a;
	void getAccountNumber(){
		System.out.println("account number"+a);
	}
	abstract void withdraw();
	abstract void deposit();
}
class savingacc extends BankAccount{
	public void getAccountNumber(){
		super.a=12345;
		super.getAccountNumber();
		
		}
	public void deposit(){
		
	}
	public void withdraw(){
		
	}
	
}
class checkacc extends BankAccount{
	public void getAccountNumber(){
		super.a=1234890;
		super.getAccountNumber();
		}
	public void deposit(){
		
	}
	public void withdraw(){
		
	}
	
}
	
	

