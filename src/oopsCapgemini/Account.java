package oopsCapgemini;

public class Account {
    private String accountHolder;
    private double accountBalance;
    private long accountNumber;

   
    public Account(String accountHolder, double accountBalance, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
    }

    
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

   
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount < 0) {
            System.out.println("Negative number not allowed");
        } else if (accountBalance < withdrawAmount) {
            System.out.println("Not possible, enter less amount");
        } else {
            accountBalance -= withdrawAmount;
            System.out.println("Withdraw Successful");
            System.out.println("Current Balance: " + accountBalance);
        }
    }

    
    public void deposit(double depositAmount) {
        if (depositAmount < 0) {
            System.out.println("Enter a positive amount");
        } else {
            accountBalance += depositAmount;
            System.out.println("Deposit successful for amount: " + depositAmount);
            System.out.println("Current Balance after deposit: " + accountBalance);
        }
    }

    // Check balance method
    public void checkBalance() {
        System.out.println("Account Balance: " + accountBalance);
    }
}
