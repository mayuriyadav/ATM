public class ATM {
    
    private User user;

    public ATM(User user) {
        this.user = user;
    }

    public double checkBalance() {
        return user.getAccountBalance();
    }

    public void withdraw(double amount) {
        if (amount > user.getAccountBalance()) {
            System.out.println("Insufficient funds.");
        } else {
            user.setAccountBalance(user.getAccountBalance() - amount);
            System.out.println("Withdrawal successful. New balance: Rs " + user.getAccountBalance());
        }
    }

    public void deposit(double amount) {
        user.setAccountBalance(user.getAccountBalance() + amount);
        System.out.println("Deposit successful. New balance: Rs " + user.getAccountBalance());
    }

}
