package rscvanilla.hooker.infrastructure;

public class AppException extends RuntimeException {

    public AppException(String message, Exception e) {
        super(message, e);
    }
}
