package bank;

public class BankMian {

    public static void main(String[] args) {
        Bank bank = new Bank();
 
        Account acc1 = new Account();
        Account acc2 = new Account();
     
    bank.addAccount(acc1);
    bank.addAccount(acc2);
    bank.displayAccounts();
        
    bank.deposit(1001, 200.0);
    bank.withdraw(1002, 150.0);
    bank.withdraw(1001, 1000.0); 
        
    bank.removeAccount(1001);
        
    bank.displayAccounts();
    }
}
    

