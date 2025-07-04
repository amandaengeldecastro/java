package br.com.dio.exception;

public class InvestmentNotFoundException extends RuntimeException {

    public InvestmentNotFoundException(final String message) {
        super(message);
    }
    
}
