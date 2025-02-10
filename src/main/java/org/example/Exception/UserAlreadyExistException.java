package org.example.Exception;

public class UserAlreadyExistException extends RuntimeException {
    public UserAlreadyExistException(String tunde) {
        super(tunde);
    }
}
