
interface Bank {
	public void withDraw(double amount);
	public void deposit(double amount);

	public void checkBalance();
}

 class Details implements Bank {
	String name;
	String branch;
	double balance;
	int accNo;
	
	public Details(String name,String branch,double balance,int accNo)
	{
		this.name=name;
		this.branch=branch;
		this.balance=balance;
		this.accNo=accNo;
		
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

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public void withDraw(double amount)
	{
//		this.balance=this.balance-amount;
		this.balance=this.balance-Math.abs(amount);//math.abs->ignores the sign + or -
		System.out.println("your current balance:"+this.balance);
		
	}
	public void checkBalance()
	{
		System.out.println("The account holder name is: "+name);
		System.out.println("Branch: "+branch);
		System.out.println("Account number: "+accNo);
	    System.out.println("Your balance is : "+balance);
	}
	public void deposit(double amount)
	{
		this.balance=this.balance+amount;
		System.out.println("your current balance:"+this.balance);
		
	}

}

class InterfaceExample {
	public static void main(String args[]) {
		Details d=new Details("Sara","Porur",5000,5001010);
		d.withDraw(-1000);
//		d.deposit(500);
//		d.checkBalance();
		

	}

}
