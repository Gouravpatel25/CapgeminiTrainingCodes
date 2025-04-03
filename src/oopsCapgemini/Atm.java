package oopsCapgemini;

import java.util.Scanner;

public class Atm {
   /* private long accNo;
    private String accHolder;
    private double accBalance;

    
    public Atm(long accNo, String accHolder, double accBalance) {
        this.accNo = accNo;
        this.accHolder = accHolder;
        this.accBalance = accBalance;
    }
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking account details input
        System.out.println("Enter the account number:");
        long accNo = sc.nextLong();
        sc.nextLine();

        System.out.println("Enter account holder's name:");
        String accHolder = sc.nextLine();

        System.out.println("Enter the account balance:");
        double accBalance = sc.nextDouble();

        
        Account ac = new Account(accHolder, accBalance, accNo);

        
        while (true) {
            System.out.println("\nHey User:");
            System.out.println("1 - Check Balance");
            System.out.println("2 - Withdraw Balance");
            System.out.println("3 - Deposit");
            System.out.println("4 - Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ac.checkBalance();
                    break;
                case 2:
                    System.out.println("Enter the amount to be withdrawn:");
                    double withDrawBalance = sc.nextDouble();
                    ac.withdraw(withDrawBalance);
                    break;
                case 3:
                    System.out.println("Enter the deposit amount:");
                    double depositBalance = sc.nextDouble();
                    ac.deposit(depositBalance);
                    break;
                case 4:
                    System.out.println("Exit successful. Thank you!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
