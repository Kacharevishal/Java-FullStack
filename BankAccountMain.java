package practice17;

public class BankAccountMain {

	public static void main(String[] args) {

		BankAccount ram = new BankAccount();
		System.out.println("--------------------------------");
		System.out.println("This is a Bank Account No:1");
		System.out.println(("Account No: ")+(ram.accNo = 113546687));
		System.out.println(("Account Holder Name: ")+(ram.accHolderName = "Ram Shing"));
		System.out.println(("Account Balance: ")+(ram.balance =757784.948));
		
		BankAccount sham = new BankAccount();
		System.out.println("--------------------------------");
		System.out.println("This is a Bank Account No:2");
		System.out.println(("Account No: ")+(sham.accNo = 543546687));
		System.out.println(("Account Holder Name: ")+(sham.accHolderName = "Sham Shing"));
		System.out.println(("Account Balance: ")+(sham.balance =787784.948));
		
		BankAccount raj = new BankAccount();
		System.out.println("--------------------------------");
		System.out.println("This is a Bank Account No:3");
		System.out.println(("Account No: ")+(raj.accNo = 903546687));
		System.out.println(("Account Holder Name: ")+(raj.accHolderName = "Raj Sharma"));
		System.out.println(("Account Balance: ")+(raj.balance =907784.947));
	}

}
