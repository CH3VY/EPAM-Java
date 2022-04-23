package javaExceptions;

public class NoSubjectsException extends Exception {
    public NoSubjectsException() {
        super("No subjects in the list");
    }
}
