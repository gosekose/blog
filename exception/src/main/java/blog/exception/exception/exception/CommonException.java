package blog.exception.exception.exception;

public abstract class CommonException extends ApplicationException {
    public CommonException(String errorCode, String message) {
        super(errorCode, message);
    }
}
