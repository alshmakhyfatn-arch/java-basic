package bankingcore.miniproject;



import java.io.Serializable;

public class Transaction implements Serializable {

    private static final long serialVersionUID = 1L;

    private int transactionId;
    private int accountNumber;
    private String transactionType;
    private double amount;

    public Transaction(int transactionId,
                       int accountNumber,
                       String transactionType,
                       double amount) {

        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return transactionId + "," +
               accountNumber + "," +
               transactionType + "," +
               amount;
    }
}
