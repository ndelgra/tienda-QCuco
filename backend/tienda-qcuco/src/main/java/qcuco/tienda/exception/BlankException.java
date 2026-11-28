package qcuco.tienda.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class BlankException extends ResponseStatusException {
    public BlankException(String message) {
        super(HttpStatus.BAD_REQUEST, message);
    }
}
