package BankAccountExc;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// create new account
		
		System.out.println("enter the initial balance");
		double initialBalane = scanner.nextDouble();
		scanner.nextLine();
		BankAccount myAccount = new BankAccount(initialBalane);
		
		// assign password
		
		System.out.println("assign passowred");
		String passowred = scanner.nextLine();
		myAccount.setpasswoerd(passowred);
		
		//operations
		
		System.out.println(" Enter ammount deposit");
		double depositAmount =scanner.nextDouble();
		myAccount.Deposit(depositAmount);
		BankAccount depositamount = new BankAccount(initialBalane);
		
		
		System.out.println("Enter amount of withdrow");
		double withdrow =scanner.nextDouble();
		myAccount.withDraw(withdrow);
		
		scanner.nextLine();      // clean row
		
		// display balance
		
		System.out.print("Enter your passowred to display balance");
		String enteredPassowred = scanner.nextLine();
		myAccount.displayBalane(enteredPassowred);
		
		
		bankAccount1 acc = new bankAccount1(100);
	        acc.setPassowerd("1234");
	        acc.Deposit(50);
	        acc.withDraw(30);
	        acc.displayBalane("1234");
	        acc.withDraw(200); // تجربة فشل
	        acc.displayBalane("wrong"); // تجربة فشل
	        acc.showTransactionLog();  // عرض سجل العمليات
		
				
	}

}
