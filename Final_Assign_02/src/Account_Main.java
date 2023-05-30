
public class Account_Main {

	public static void main(String[] args) {
		SavingAccount acc1 = new SavingAccount(1000,"Priya");
		acc1.withdraw(1000);
		acc1.checkBalance();
		
		SavingAccount acc2 = new SavingAccount();
		acc2.deposit(10000);
		acc2.withdraw(1000);
		acc2.checkBalance();
		
		}

}
