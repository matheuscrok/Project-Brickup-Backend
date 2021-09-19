package com.crok.projectbrickupbackend.entity;

public class BackendException extends RuntimeException{

    public BackendException() {
        super();
    }

    public BackendException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public BackendException(String message, Throwable cause) {
        super(message, cause);
    }

    public BackendException(String message) {
        super(message);
    }

    public BackendException(Throwable cause) {
        super(cause);
    }


}
