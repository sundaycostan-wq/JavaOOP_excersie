package bank;
import java.util.HashMap;
import java.util.Map;
public class BankAccount { 
    private int accountNumber;
    private String customerName;
    private double balance;

public void account(int accountNumber,String customeraname,double initialBalance){
    this.accountNumber = accountNumber;
    this.customerName = customeraname;
    this.balance = initialBalance;
}
public int getaccountNumber(){
    return accountNumber;
}
public String getcustomerName(){
    return customerName;
}
public double getbalance(){
    return accountNumber;
}

public void deposit(double amount){
if (amount >0){
        balance=+ amount;
System.out.println("Deposited $" + amount + " to account " + accountNumber + ". New balance: $" + balance);
} else {
System.out.println("Invalid deposit amount.");
 }
}
 public void withdraw(double amount) {
if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from account " + accountNumber + ". New balance: $" + balance);
}   else if (amount > balance) {
System.out.println("Insufficient funds in account " + accountNumber + ". Current balance: $" + balance);
}   else {
System.out.println("Invalid withdrawal amount.");
}
}
public String toString() {
    return "Account Number: " + accountNumber + ", Customer: " + customerName + ", Balance: $" + balance;
    }
}




    

