import java.util.ArrayList;

/**
 * PersonalAccount represents a personal bank account.
 */
public class PersonalAccount {

    /** Instance variables */

    // Account number
    private int accountNumber;

    //Name of the account holder
    private String accountHolder;

    // Current balance in the account
    private double balance;

    //List of transactions
    private ArrayList<Amount> transactions;

    // Constructs a new PersonalAccount with the given account number and holder.
    // The initial balance is set to 0.

    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<Amount>();
    }

    // Deposit method
    public void deposit(double amount) {
        this.balance += amount;
        transactions.add(new Amount(amount, "Deposit"));
    }

    // Withdraw method
    public void withdraw(double amount) {
        if(amount <= balance) {
            this.balance -= amount;
            transactions.add(new Amount(amount, "Withdrawal"));
        } else {
            System.out.println("The balance cannot be negative");
        }
    }

    // Print transaction history
    public void printTransactionHistory() {
        for(Amount t : transactions) {
            System.out.println(t.transactionType + ": " + t.amount);
        }
    }

    // Getter methods
    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}