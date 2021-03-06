import java.util.Scanner;

//Object begins
public class BankAccount {
    double balance;
    double depositAmount = 0.0;
    double withdrawAmount = 0.0;
    double transferAmount = 0.0;

    // Constructor method
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Main method begins
    public static void main(String[] args) {
        BankAccount transactions = new BankAccount(40_00_000.0);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String userName = scan.nextLine();
        System.out.println("What would you like to do?");
        String userAnswer = scan.nextLine();

//User Deposit input
        if (userAnswer.equalsIgnoreCase("deposit")) {
            System.out.println("Alright, how much would you like to deposit?");
            transactions.depositAmount = scan.nextDouble();
            double UpdatedBalance = transactions.balance + transactions.depositAmount;
            System.out.println("Your updated balance is " + UpdatedBalance + "");
        }

// User Withdrawal input
        else if (userAnswer.equalsIgnoreCase("withdraw")) {
            System.out.println("How much would you like to withdraw?");
            transactions.withdrawAmount = scan.nextDouble();
            double UpdatedBalance = transactions.balance - transactions.withdrawAmount;
            System.out.println("Your updated balance after withdraw is " + UpdatedBalance + "");
        }
        // User Transfer input
        else if (userAnswer.equalsIgnoreCase("transfer")) {
            System.out.println("Okay, how much would you like to transfer?");
            transactions.transferAmount = scan.nextDouble();
            double UpdatedBalance = transactions.balance - transactions.transferAmount;
            System.out.println("Your updated balance after the recent transfer is " + UpdatedBalance + "");
        }

        // User enters anything not inside the if-then-else statements
        else {
            System.out.println("Goodbye");
        }
    }

    }

