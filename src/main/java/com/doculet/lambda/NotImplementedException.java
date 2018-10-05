package com.doculet.lambda;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_IMPLEMENTED, reason = "Requested format is not implemented yet")
public class NotImplementedException extends RuntimeException {
    public NotImplementedException(String message) {
        super(message);
    }
}
