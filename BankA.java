//Write an abstract class "Bank" which has a non-abstract method "getInterestRate()" 
//and an abstract method "calculateInterest()".
//implement two subclasses "SavingsAccount" and "FixedDeposit" which 
///implement the method "calculateInterest()" according to their own interest calculation formulae

abstract class bank {
	int a;

	int getintrate() {
		return a;
	}

	abstract void clint();
}

class saving extends bank {
	public void clint() {
		int money = 1000;

		super.a = money / 100 * 2;
		System.out.println("savinhgs" + super.getintrate());
	}

}

class fixeddeposit extends bank {
	public void clint() {
		int money = 1000;

		super.a = money / 100 * 3;
		System.out.println("fixed deposit" + super.getintrate());
	}
}

class BankA {
	public static void main(String args[]) {
		bank b = new saving();
		bank c = new fixeddeposit();
		b.clint();
		c.clint();

	}
}