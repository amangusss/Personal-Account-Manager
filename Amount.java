/**
 * Amount class represents a transaction amount.
 */
public class Amount {

    // The transaction amount
    double amount;

    // The transaction type (e.g. Deposit, Withdrawal)
    String transactionType;

    // Constructor, getters, setters
    public Amount(double amount, String transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }
}