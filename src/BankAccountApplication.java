import java.util.List;

public class BankAccountApplication {

	public static void main(String[] args) {
		Checkings ch = new Checkings("Abhishek Kumar Mandal","125478965",12546);
	    ch.showInfo();
	    
	    System.out.println("Parsed the csv file details");
	    String file = "NewBankAccounts.csv";
	    List<String[]> newAccounts = CSV.read(file); 
	    System.out.println("New Account");
	    for(String []accounts : newAccounts) {
	    	System.out.print(accounts[0]);
	    	System.out.print(" "+accounts[1]+" ");
	    	System.out.print(" "+accounts[2]+" ");
	    	System.out.print(" "+accounts[3]+" ");  
	    	System.out.println("\n.................");   
	    }
	}
}
