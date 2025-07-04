package br.com.dio.exception;

public class WalletNotFoundException extends RuntimeException {

    public WalletNotFoundException(final String message) {
        super(message);
    }
    
}
