package bank;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<Integer, BankAccount> accounts;
    public Bank() {
    accounts = new HashMap<>();
}
public void addAccount(Account Account){
    if  (Account.containskey(Account.getaccountNumber())){
System.out.println("Account with the number"+ Account.getaccountNumber() +"Äll ready exits.");
} else{
    Account.put(Account.getaccountNumber(),Account);
System.out.println("Account adding" + Account);
}
}
public  void removeAccount(int AccountNumber){
    if (Account.containskey(AccountNumber)){
        Account removed= Account.remove(AccountNumber);
System.out.println("Account with number:" + removed);
    } else{
System.out.println("Account with number"+AccountNumber + "Not found.");
}
}
public void withdraw(int accountNumber, double amount) {
    BankAccount account = accounts.get(accountNumber);
if (account != null) {
            account.withdraw(amount);
} else {
System.out.println("Account with number " + accountNumber + " not found.");
}
}
 public void displayAccounts() {
if (accounts.isEmpty()) {
System.out.println("No accounts in the bank.");
} else {
System.out.println("Bank Accounts:");
  for (BankAccount account : accounts.values()) {
System.out.println(account);
}
}
}
 public void deposit(int i, double d) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deposit'");
 }
}

 





