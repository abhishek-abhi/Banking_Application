
public class Savings extends Accounts{

	private int safetyDepositBoxId;
	private int safetyDepositBoxKey;
	
	public Savings(String name,String sSN, double initialDeposit) {
		super(name,sSN,initialDeposit);
		// TODO Auto-generated constructor stub
		accountNumber= "2"+accountNumber; 
		safetyDepositBox();
	}
	
	private void safetyDepositBox() {
		this.safetyDepositBoxId= (int) (Math.random()*Math.pow(10, 3));
		this.safetyDepositBoxKey= (int) (Math.random()*Math.pow(10, 4));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Account Type: Saving");
		System.out.println("Your account features: ");
		System.out.println("Safety deposit Box Id: "+this.safetyDepositBoxId);
		System.out.println("Safety deposit Box Key: "+this.safetyDepositBoxKey);
	}

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		rate = getBasicRate()*0.25;
	} 

}
