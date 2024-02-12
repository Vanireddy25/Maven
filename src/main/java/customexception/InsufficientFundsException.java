package customexception;
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
//The constructor takes a message parameter to provide
// information about the exception when it is thrown.