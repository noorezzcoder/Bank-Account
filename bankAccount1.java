package BankAccountExc;

public class bankAccount1 {
	
	private double balance;                               //To save account balance.//لحفظ رصيد الحساب 
	private String passowerd ;                           //  To store your password (there is a typo here, the correct one is//لتخزين كلمة المرور (يوجد خطأ إملائي هنا، والصحيح
	String transactionLog = "";                         // to save operations Deposit and withdraw
	
	// Constructor
	public bankAccount1(double initialBalance) {
		this.balance = initialBalance;
		transactionLog += "Account created with balance: " + initialBalance + " JD\n";
	}
	
	// Deposit method
		public void Deposit(double amount) {
			if (amount > 0) {
				balance += amount;
				System.out.println("desposit is success and the balance is :" +balance);
				transactionLog += "Deposited: " + amount + " JD | New balance: " + balance + " JD\n";
			}else {
				System.out.println("the ammount is not valid");
				transactionLog += "Failed deposit attempt with invalid amount: " + amount + "\n";
			}
		}
		
		
		// withdraw balance
		public void withDraw(double amount) {
	        if (amount> 0 && amount<=balance) {
	        	balance -=amount;
	        	System.out.println("withdraw is succesfully acheveded" );
	        	transactionLog += "Withdrawn: " + amount + " JD | New balance: " + balance + " JD\n";
				
			}else {
				System.out.println("the ammount is not valid");
				transactionLog += "Failed withdrawal attempt with amount: " + amount + "\n";
			}
			
		}
		public void displayBalane(String enterdPassored) {
			if (this.passowerd != null && this.passowerd.equals(enterdPassored.trim())){
				System.out.println("The Blance instsntly is :" +balance + " JD");
			    transactionLog += "Balance viewed successfully.\n";
			}else {
				System.out.println("invalide passowerd ");
				transactionLog += "Failed attempt to view balance with wrong password.\n";
			}
		}
		
	    // Show transaction log
	    public void showTransactionLog() {
	        System.out.println("Transaction History:");  //سجل المعاملات
	        System.out.println(transactionLog);
	    }
	
			
		
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getPassowerd() {
		return passowerd;
	}

	public void setPassowerd(String passowerd) {
		this.passowerd = passowerd;
	}
	
	
	
	
	

}
