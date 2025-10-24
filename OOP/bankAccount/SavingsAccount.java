package bankAccount;
public class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(int accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        balance += balance * (interestRate / 100);
    }
}
