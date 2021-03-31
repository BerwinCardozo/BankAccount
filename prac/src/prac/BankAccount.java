package prac;

public class BankAccount {
	String account_holder,bank_name;
	int available_bal,account_num;
	
	BankAccount(String account_holder,String bank_name,int available_bal,int account_num)
	{
		this.account_holder=account_holder;
		this.bank_name=bank_name;
		this.available_bal=available_bal;
		this.account_num=account_num;
		
	}
	
	void deposit(int depo) 
	{
		int newbal;
		newbal=depo+available_bal;
		available_bal=newbal;
	}
	
	void withdraw(int with)
	{
		int newbal;
		newbal=available_bal-with;
		available_bal=newbal;
	}
	
	void display()
	{
		System.out.println("Bank name: " +bank_name);
		System.out.println("Account holder: " +account_holder);
		System.out.println("Account number: " +account_num);
		System.out.println("Available balance: " +available_bal+"/-");
	}
	

	public static void main(String[] args) {
		
	BankAccount bnk=new BankAccount("Raj Gupta","State Bank Of India",40000,64589054);
	bnk.deposit(1000);
	bnk.display();
	
	}

}
