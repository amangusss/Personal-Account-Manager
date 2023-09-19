/**
 * Main class demonstrates PersonalAccount usage.
 */
public class Main {
    public static void main(String[] args) {
        // Usage example
        PersonalAccount account = new PersonalAccount(1, "David");
        account.deposit(500.0);
        account.withdraw(100.0);
        account.printTransactionHistory();
        System.out.println(account.getBalance());
    }
}