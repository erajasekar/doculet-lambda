/*
 * Copyright 2018 Doculet.net
 */
package com.doculet.lambda.model;

public class oEmbedError {
    private String message;

    public oEmbedError(String errorMessage) {
        message = errorMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
