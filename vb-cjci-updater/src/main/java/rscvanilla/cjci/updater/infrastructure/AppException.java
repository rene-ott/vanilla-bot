package rscvanilla.cjci.updater.infrastructure;

public class AppException extends RuntimeException {

    public AppException(String message, Exception e) {
        super(message, e);
    }

    public AppException(String message) {
        super(message);
    }
}
