package org.example;

public class InvalidSchoolDataException extends Exception {
    public InvalidSchoolDataException(String message) {
        super(message);
    }
    public InvalidSchoolDataException(String message, Exception a)
    {
        super(message, a);
    }
}