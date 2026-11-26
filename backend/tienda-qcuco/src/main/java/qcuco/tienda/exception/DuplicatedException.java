package qcuco.tienda.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class DuplicatedException extends ResponseStatusException {
    public DuplicatedException(String message) {
        super(HttpStatus.CONFLICT,message);
    }
}
