package u10.Ex10_1;

public class AccountTest {
	public static void main (String arv[]) {
		Account a = new Account();
		a.setId(1122);
		a.setBalance(20000);
		a.setAnnualInterestRate(4.5);
		a.withdraw(2500);
		a.deposit(3000);
		System.out.printf("Balance: $%,.2f\n", a.getBalance());
		System.out.println("Monthly Interest Rate: " + a.getMonthlyInterestRate() + "%");
		System.out.println("Creation Date: " + a.getDateCreated());
	}
}
