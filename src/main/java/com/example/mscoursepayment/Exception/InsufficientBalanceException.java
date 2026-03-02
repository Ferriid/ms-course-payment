package com.example.mscoursepayment.Exception;

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException() {
            super("Insufficient balance");
        }
}
