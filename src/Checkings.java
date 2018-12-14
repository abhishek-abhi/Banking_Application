
public class Checkings extends Accounts{

	private int debitCardNumber;
	private int debitCardPin;
	
	public Checkings(String name,String sSN, double initialDeposit) {
		super(name,sSN,initialDeposit); 
		// TODO Auto-generated constructor stub
		accountNumber= "1"+accountNumber;
		setDebitCard();
	}
	
	private void setDebitCard() {
		this.debitCardNumber= (int) (Math.random()*Math.pow(10, 12));
		this.debitCardPin= (int) (Math.random()*Math.pow(10, 4));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Account Type: Checking");
		System.out.println("Your account features: ");
		System.out.println("Debit Card Number: "+this.debitCardNumber);
		System.out.println("Debit Card Pin: "+this.debitCardPin);

	}

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		rate= getBasicRate()*0.15;
	}

}
