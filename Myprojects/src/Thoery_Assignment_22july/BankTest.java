package Thoery_Assignment_22july;
/*
 * Create an abstract class Accounts with the following details: Data Members: (a) Balance (b)
accountNumber (c) accountHoldersName (d) address Methods: (a) withdrawl()- abstract (b)
deposit()- abstract (c) display() to show the balance of the account number Create a subclass
of this class SavingsAccount and add the following details:
 */
abstract class Account {
    double balance;
    long accountNumber;
    String accountHoldersName, address;

    abstract public void withdrawl(double amt);

    abstract public void deposit(double amt);

    public Account(double balance, long accountNumber, String accountHoldersName, String address) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.address = address;
    }

    public void display() {
        System.out.println("Account no.: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

}

class SavingsAccount extends Account {
    double rateOfInterest;

    public SavingsAccount(double balance, long accountNumber, String accountHoldersName, String address,
            double rateOfInterest) {
        super(balance, accountNumber, accountHoldersName, address);
        this.rateOfInterest = rateOfInterest;
    }

    public void withdrawl(double amt) {
        balance =balance- amt;
    }

    public void deposit(double amt) {
        balance =balance+ amt;
    }

    public double calculateAmount(int time) {
        double amount = balance + (balance * rateOfInterest * time) / 100;
        return amount;
    }
}

public class BankTest {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(20000, 1234567893, "Sachin", "Karve Road", 9.5);

        sa.withdrawl(500);
        sa.deposit(5000);

        sa.display();
        System.out.println("Amount: " + sa.calculateAmount(2));
    }
}

