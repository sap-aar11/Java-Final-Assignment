
public abstract class Account {
	long ammount;
	String nameOfPerson= "Unknown";
Account(long cash,String name)
{
	ammount=cash;
	nameOfPerson = name;
	}
Account()
{
	ammount=0;
	}
public void checkBalance()
{
	System.out.println("Current Ammount is "+ammount);
	}
public abstract void deposit(long cash);

public abstract void withdraw(long cash);


}
