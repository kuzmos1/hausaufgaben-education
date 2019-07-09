package hu.eteo.ks.service.exception;

public class StudentNotFoundExeptions extends RuntimeException {

    public StudentNotFoundExeptions(final String message) {
        super(message);
    }

    public StudentNotFoundExeptions(final String message, final Throwable cause) {
        super(message, cause);
    }

    public StudentNotFoundExeptions(final Throwable cause) {
        super(cause);
    }

    public StudentNotFoundExeptions(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
