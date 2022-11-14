package swinedb.exception;

/**
 * @author 刘铭康
 * @version 2022/11/14
 */
public class TargetDateNotFoundException extends RuntimeException {
    public TargetDateNotFoundException() {
        super();
    }

    public TargetDateNotFoundException(String message) {
        super(message);
    }
}
