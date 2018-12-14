
public abstract class Accounts implements Interest{

	private String name;
	private String sSN;
	private double balance;
	
	protected String accountNumber;
	protected double rate;
	private static int index= 99991;
	
	public Accounts(String name, String sSN, double initialDeposit) {
		this.name= name;
		this.sSN= sSN;
		this.balance= initialDeposit;
		this.accountNumber= setAccountNumber();
	    setRate();
	}

	public abstract void setRate();
	
	private String setAccountNumber() {
		String last2sSN= this.sSN.substring(this.sSN.length()-2,this.sSN.length());
	    int randomNumber= (int) ((int)Math.random()*Math.pow(10, 3));
		index++;
		return last2sSN+index+randomNumber;
	}
	
	public void deposit(double amount) {
		if(amount>=0)
			balance+=amount;
		System.out.println("depositing $"+amount);
 		System.out.println("Your balance is: "+this.balance);
	}
	public void withdraw(double amount) {
		if(amount>=0)
			balance-=amount;
		System.out.println("withdrawing $"+amount);
		System.out.println("Your balance is: "+this.balance);
	}
	public void transfer(String girlFriend,double amount) {
		if(amount>=0)
			balance-=amount;
		System.out.println("Transferring $"+amount+" to "+girlFriend);
		System.out.println("Your balance is: "+this.balance);
	}
	
	public void compoundInterest() {
		double accruedInterest= balance * (rate/100);
		System.out.println("Your accrued interest is: "+accruedInterest);
		balance+=accruedInterest;
		System.out.println("Your balance is: "+ balance); 
	}
	
	public void showInfo() {
		System.out.println("Name: "+this.name+"\n sSN: "+this.sSN+"\n Balance: "+
				this.balance);
		System.out.println("Account Number: "+this.accountNumber); 
	    System.out.println("Rate: "+this.rate); 
		System.out.println("==============");
	}
	
}
