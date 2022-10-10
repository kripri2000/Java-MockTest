package mocktest;
class Customer{
	int customerid;
	String customerName;
	String emailid;
	Customer(int customerid,String customerName,String emailid){
		this.customerid = customerid;
		this.customerName = customerName;
		this.emailid = emailid;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

}
abstract class Account{
	protected int accountNumber;
	Customer customerObj;
	double balance;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Customer getCustomerObj() {
		return customerObj;
	}
	public void setCustomerObj(Customer customerObj) {
		this.customerObj = customerObj;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	Account(int accountNumber,Customer customerObj,double balance){
		this.accountNumber = accountNumber;
		this.customerObj= customerObj;
		this.balance = balance;
	}
	abstract public boolean withdraw(double amount);
		

}
class SavingsAccount extends Account{
	double minimumBalance;
	public SavingsAccount(int accountNumber, Customer customerObj, double balance, double minimumBalance) {
		super(accountNumber, customerObj, balance);
		this.minimumBalance = minimumBalance;
	}

	
    //getter-setter
	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	public boolean withdraw(double amount) {
		if(balance-amount>this.minimumBalance) {
			balance -= amount;
			return true;
		}			
		else
			return false;
	}
	
	
}
public class prgm6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
