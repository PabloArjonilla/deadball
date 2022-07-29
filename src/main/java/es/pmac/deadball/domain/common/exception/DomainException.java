package es.pmac.deadball.domain.common.exception;

public class DomainException extends RuntimeException {

    public DomainException(){
        super();
    }

    public DomainException(String message, Throwable cause){
        super(message, cause);
    }

    public DomainException(String message){
        super(message);
    }

    public DomainException (Throwable cause){
        super(cause);
    }
}
