package javaExceptions;

public class NoStudentsException extends Exception {
    public NoStudentsException() {
        super("No students in the group..");
    }
}
