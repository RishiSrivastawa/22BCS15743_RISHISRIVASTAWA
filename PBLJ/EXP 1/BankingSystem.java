import java.util.Scanner;
import java.util.Random;

class BankAccount {
    private String name;
    private String accountNumber;
    private double balance;
    public BankAccount(String name, String accountNumber, double initialBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful: \n Your current balance is :" + balance);
        } else {
            System.out.println("Error!! Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Error!! Insufficient balance!");
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrawal successful! Current Balance: " + balance);
        } else {
            System.out.println("Error: Withdrawal amount must be positive.");
        }
    }


    public void displayAccountDetails() {
        System.out.println("\nAccount Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Create Account:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        String accountNumber = String.format("%010d", random.nextLong(10000000000L));

        System.out.print("Initial Balance: ");
        double initialBalance = sc.nextDouble();

        BankAccount account = new BankAccount(name, accountNumber, initialBalance);
        System.out.println("\nAccount created successfully!");
        System.out.println("Generated Account Number: " + accountNumber + "\n");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account Details");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = sc.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.print("Enter your account number to view details: ");
                    String enteredAccountNumber = sc.nextLine();
                    if (account.getAccountNumber().equals(enteredAccountNumber)) {
                        account.displayAccountDetails();
                    } else {
                        System.out.println("Error: Invalid account number.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting. Thank you for using the banking system!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
