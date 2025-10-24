package bankAccount;

public class BankAccountMain {
       public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount(123, "Sophia", 1000, 5);
        acc.applyInterest();
        System.out.println("New balance: " + acc.getBalance());
    }
}
