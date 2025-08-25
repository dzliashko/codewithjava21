package com.codewithjava21.chapter2;

public class InvalidUOMException extends RuntimeException {
    public InvalidUOMException() {
        super("Invalid UOM for this record");
    }
}
