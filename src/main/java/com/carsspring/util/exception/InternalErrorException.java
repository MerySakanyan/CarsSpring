package com.carsspring.util.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class InternalErrorException extends Exception{
    public InternalErrorException() {
        super();
    }

    /**
     * Constructs an <code>IllegalAccessException</code> with a detail message.
     *
     * @param   s   the detail message.
     */
    public InternalErrorException(String s) {
        super(s);
    }

    public InternalErrorException(Throwable s) {
        super(s);
    }
}
