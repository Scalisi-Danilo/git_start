package com.example.logging;

public class MyCustomException extends RuntimeException {

    public MyCustomException(String message) {
        super(message);
    }
}
