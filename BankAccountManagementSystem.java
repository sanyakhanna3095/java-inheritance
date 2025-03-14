import java.util.Scanner;

// Base class: BankAccount
class BankAccount {
    protected String accountNumber;
    protected double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs." + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Method to display account type
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    // Constructor
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Method to display account type
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: Rs." + withdrawalLimit);
    }
}

// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    private int depositTerm; // in months

    // Constructor
    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    // Method to display account type
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Deposit Term: " + depositTerm + " months");
    }
}

// Main class
public class BankAccountManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating and displaying a Savings Account
        System.out.print("Enter Savings Account Number: ");
        String savingsAccountNumber = sc.nextLine();
        System.out.print("Enter Balance: ");
        double savingsBalance = sc.nextDouble();
        System.out.print("Enter Interest Rate (%): ");
        double interestRate = sc.nextDouble();
        SavingsAccount savings = new SavingsAccount(savingsAccountNumber, savingsBalance, interestRate);
        savings.displayAccountDetails();
        savings.displayAccountType();

        sc.nextLine(); // Consume newline

        // Creating and displaying a Checking Account
        System.out.print("\nEnter Checking Account Number: ");
        String checkingAccountNumber = sc.nextLine();
        System.out.print("Enter Balance: ");
        double checkingBalance = sc.nextDouble();
        System.out.print("Enter Withdrawal Limit: ");
        double withdrawalLimit = sc.nextDouble();
        CheckingAccount checking = new CheckingAccount(checkingAccountNumber, checkingBalance, withdrawalLimit);
        checking.displayAccountDetails();
        checking.displayAccountType();

        sc.nextLine(); // Consume newline

        // Creating and displaying a Fixed Deposit Account
        System.out.print("\nEnter Fixed Deposit Account Number: ");
        String fdAccountNumber = sc.nextLine();
        System.out.print("Enter Balance: ");
        double fdBalance = sc.nextDouble();
        System.out.print("Enter Deposit Term (in months): ");
        int depositTerm = sc.nextInt();
        FixedDepositAccount fixedDeposit = new FixedDepositAccount(fdAccountNumber, fdBalance, depositTerm);
        fixedDeposit.displayAccountDetails();
        fixedDeposit.displayAccountType();
    }
}


/*
Enter Savings Account Number: 3456789
Enter Balance: 40000
Enter Interest Rate (%): 2
Account Number: 3456789
Balance: Rs.40000.0
Account Type: Savings Account
Interest Rate: 2.0%

Enter Checking Account Number: 1234
Enter Balance: 5000
Enter Withdrawal Limit: 1000
Account Number: 1234
Balance: Rs.5000.0
Account Type: Checking Account
Withdrawal Limit: Rs.1000.0

Enter Fixed Deposit Account Number: 2345
Enter Balance: 10000
Enter Deposit Term (in months): 4
Account Number: 2345
Balance: Rs.10000.0
Account Type: Fixed Deposit Account
Deposit Term: 4 months

 */