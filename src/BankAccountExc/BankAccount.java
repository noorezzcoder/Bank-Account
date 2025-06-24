package BankAccountExc;


public class BankAccount {
	
	private double balance;                               //To save account balance.//لحفظ رصيد الحساب 
	private String passowerd ;                            //  To store your password (there is a typo here, the correct one is//لتخزين كلمة المرور (يوجد خطأ إملائي هنا، والصحيح
	
	
	
	//constructor
	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}
    //Commit by adding public method get passowrd
	public static getpassword(string pass) {
		
	}
   //set password
	public void setpasswoerd(String passowerd) {
		this.passowerd = passowerd;
	}
	
	// Deposit method
	public void Deposit(double amount) {
		if (amount >0) {
			balance += amount;
			System.out.println("desposit is success and the balance is :" +balance);
		}else {
			System.out.println("the ammount is not valid");
		}
	}
	
	// withdraw balance
	public void withDraw(double amount) {
        if (amount> 0 && amount<=balance) {
        	balance -=amount;
        	System.out.println("withdraw is succesfully acheveded" );
			
		}else {
			System.out.println("the ammount is not valid");
		}
		
	}
	
	public void displayBalane(String enterdPassored) {
		if (this.passowerd != null && this.passowerd.equals(enterdPassored.trim())){
			System.out.println("The Blance instsntly is :" +balance + " JD");
		}else {
			System.out.println("invalide passowerd ");
		}
		
		
	}
	
	       //  متطلبات اضافية   انشاء سجل العمليات  باستخدام متغير string   // عرض الرصيد  الجديد بعد كل  عملية ايداع او سحب في السجل //فقط// تسجيل كل عملية ايداع وسحب  سواء نجحت او فشلت //تسجيل محاولات  عرض الرصيد
	     //سواء ناجحة او غير مصرحج بها 
	    //  ما أفهمه: أحتاج إلى تخزين كل عملية (إيداع، سحب،...) على شكل نص داخل متغير String
	   //  ما هو الهدف الرئيسي من البرنامج ؟ الهدف هو انشاء نظام بنكي يمكنه تتبع واجراء العمليات المالية مثل الايداع والسحب وعرض الرصيد باستخدام متغير string فقط كسجل لتاريخ العمليات
      //دون استخدام اي هياكل بيانات مثل القوائم او المصفوفات
     // نظام حساب بنكي	يحتوي على رصيد، كلمة مرور، ووظائف لإجراء العمليات البنكية	
    //   تسجيل العمليات	كل عملية يتم تنفيذها (إيداع، سحب، عرض رصيد، ...)، يجب أن يتم تسجيلها على شكل نص داخل متغير
   // باستخدام متغير String فقط	يجب استخدام String واحد لتخزين سجل كامل للعمليات (مثل سجل مكتوب)	
  //	عدم استخدام List أو Array	يمنع استخدام هياكل بيانات متقدمة أو قوائم – فقط String
 // "الهدف من هذا البرنامج هو تطوير كلاس BankAccount يُمكِّن المستخدم من إجراء عمليات مالية أساسية (إيداع، سحب، عرض الرصيد)، وتخزين كل عملية في سجل نصي واحد باستخدام متغير String فقط. يُسمح للمستخدم لاحقًا بعرض سجل هذه العمليات كمرجع لتاريخ الحساب البنكي. 
//لا يُستخدم في هذا البرنامج أي نوع من القوائم أو الهياكل البيانية، بل يُكتفى بتحديث نص متغير String بعد كل عملية"	

	



}

