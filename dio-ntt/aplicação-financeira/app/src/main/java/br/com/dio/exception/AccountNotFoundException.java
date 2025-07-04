package br.com.dio.exception;

public class AccountNotFoundException extends RuntimeException {

    public AccountNotFoundException(final String message) {
        super(message);
    }
}