import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
       User user = new User(123456789, 8374, 20000.0);
        ATM atm = new ATM(user);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM.");
        System.out.print("Enter your user ID: ");
        int userID = scanner.nextInt();
        System.out.print("Enter your PIN: ");
        int userPIN = scanner.nextInt();

        if (userID == user.getUserID() && userPIN == user.getUserPIN()) {
            System.out.println("User authenticated.");
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: " + atm.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: Rs");
                    double withdrawalAmount = scanner.nextDouble();
                    atm.withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.print("Enter deposit amount: Rs");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } else {
            System.out.println("Invalid user ID or PIN.");
        }

        scanner.close();
    }
}
