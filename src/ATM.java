import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        // Create a sample user with a PIN and account number
    	User user = new User(5536, 1234, 6789);


        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // ATM login
        System.out.println("Welcome to the ATM!");
        System.out.print("Enter User ID: ");
        int userId = scanner.nextInt();

        if (userId == user.getUserId()) {
            System.out.print("Enter PIN: ");
            int pin = scanner.nextInt();

            if (user.verifyPin(pin)) {
                System.out.println("Login successful.");
                performTransactions(user, scanner);
            } else {
                System.out.println("Invalid PIN. Exiting.");
            }
        } else {
            System.out.println("User not found. Exiting.");
        }
    }

    public static void performTransactions(User user, Scanner scanner) {
        Account account = user.getAccount();

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transaction History");
            System.out.println("5. Quit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: $" + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposit successful.");
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    if (account.withdraw(withdrawalAmount)) {
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Insufficient funds.");
                    }
                    break;
                case 4:
                    System.out.println("Transaction History:");
                    account.displayTransactionHistory();
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
