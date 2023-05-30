
public class SavingAccount extends Account{
	SavingAccount(long cash, String name)
	{
		//calling parent class constructor
		super(cash,name);
	}
	
	//
	SavingAccount()
	{
		// compiler will call parent class constructor 
		//super(); 
	}
	
	@Override
	public void deposit(long cash) {
		ammount+=cash;
		
	}

	@Override
	public void withdraw(long cash) {
		if((ammount-cash-1000)>0)
			ammount-=cash;
		else 
			System.out.println(" Insufficiant balance to withdraw "+cash);
	}
	public void checkBalance() {
		System.out.println("Hello "+nameOfPerson);
		//System.out.println("SavingAccount Current Ammount is "+ammount);
		super.checkBalance();
	}
	
}
