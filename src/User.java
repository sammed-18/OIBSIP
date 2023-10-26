public class User {
    private int userId;
    private int pin;
    private Account account;

    public User(int userId, int pin, int accountNumber) {
        this.userId = userId;
        this.pin = pin;
        this.account = new Account(accountNumber);
    }

    public int getUserId() {
        return userId;
    }

    public boolean verifyPin(int pin) {
        return this.pin == pin;
    }

    public Account getAccount() {
        return account;
    }
}
