package customexception;

public class Main {
    private final BankAccount bankAccount;
    public Main(double balance) {
        this.bankAccount = new BankAccount(balance);
    }

    public double getCurrentBalance() {
        return bankAccount.getBalance();
    }
    public boolean getWithdrawalStatus(double amount) {
        try {
            bankAccount.amountWithdraw(amount);
            return true;
        } catch (InvalidWithdrawlException | InsufficientFundsException exception) {
            throw new RuntimeException(exception);
        }
    }
}
