package com.company.exception;

public class OverflowException extends Exception {
    private String exception;

    public OverflowException(String exception) {
        this.exception = exception;
    }

    public OverflowException() {}

    public String toString(){
        return  "OverflowException: " + exception;
    }

}
