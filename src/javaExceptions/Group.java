package javaExceptions;

import java.util.List;

public class Group {
    private final List<Student> students;
    private final String name;

    public Group(String name, List<Student> students) {
        this.students = students;
        this.name = name;
    }

    public List<Student> getStudents() throws NoStudentsException{
        if (students.isEmpty()) {
            throw new NoStudentsException();
        }
        return students;
    }

    public String getName() {
        return name;
    }
}
