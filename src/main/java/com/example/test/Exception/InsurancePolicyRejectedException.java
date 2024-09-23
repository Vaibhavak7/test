package com.example.test.Exception;

public class InsurancePolicyRejectedException extends RuntimeException {
    public InsurancePolicyRejectedException(String message) {
        super(message);
    }
}