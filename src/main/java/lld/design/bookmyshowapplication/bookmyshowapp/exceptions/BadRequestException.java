package lld.design.bookmyshowapplication.bookmyshowapp.exceptions;

public class BadRequestException extends RuntimeException{

    public BadRequestException() {
    }
    public BadRequestException(String message) {
        super(message);
    }

}
