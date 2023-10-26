import java.util.Date;

public class Transaction {
    private double amount;
    private Date timestamp;
    private String description;

    public Transaction(double amount, String description) {
        this.amount = amount;
        this.description = description;
        this.timestamp = new Date();
    }

	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAmount() {
		// TODO Auto-generated method stub
		return null;
	}

    // Getters and setters here
}
