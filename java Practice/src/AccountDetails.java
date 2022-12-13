import java.util.Scanner;

class Account {
	String name;
	String branch;
    int accNum;
	String address;
	int mobNum;
	int ifscCode;
	double balance;
	
	public Account(String name,String branch,int accNum,String address,int mobNum,int ifscCode,double balance)
	{
		this.name=name;
		this.branch=branch;
		this.accNum=accNum;
		this.address=address;
		this.mobNum=mobNum;
		this.ifscCode=ifscCode;
		this.balance=balance;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getAccNum() {
		return accNum;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMobNum() {
		return mobNum;
	}

	public void setMobNum(int mobNum) {
		this.mobNum = mobNum;
	}

	public int getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(int ifscCode) {
		this.ifscCode = ifscCode;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount)
	{
		this.balance=this.balance+amount;
		System.out.println("The deposited money is: "+amount);
		System.out.println("Money after deposited is: "+balance);
	}
	public void withdraw(double amount)
	{
		this.balance=this.balance-amount;
		System.out.println("The withdrawal amount is: "+balance);
	}
	public void checkBalance()
	{
		System.out.println("Your balance money is: "+balance);
	}
}
public class AccountDetails
{
	public static void main(String args[])
	{
		int dep,wd;
		Scanner sc=new Scanner(System.in);
		Account a=new Account("Raj","Porur",23467,"chennai",123456,4578,1000);
		dep=sc.nextInt();
		wd=sc.nextInt();
		a.deposit(dep);
     	a.withdraw(wd);
		a.checkBalance();
		
	}
}