package customexception;

public class InvalidWithdrawlException extends Exception {
    public InvalidWithdrawlException(String message) {
        super(message);
    }
}
