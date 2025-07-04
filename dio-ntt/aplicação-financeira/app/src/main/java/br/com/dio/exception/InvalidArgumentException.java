package br.com.dio.exception;

public class InvalidArgumentException extends RuntimeException {

    public InvalidArgumentException(final String message) {
        super(message);
    }
}