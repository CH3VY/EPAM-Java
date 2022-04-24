package javaExceptions;

import java.util.List;

public class Student {
    private String name;
    private final List<Subject> subjects;

    public Student(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public Double getAverageMark() {
        Double sumOfSubjectAverageMarks = 0.0;
        for (Subject subject : subjects) {
            Double sumScore = 0.0;
            for (Double score : subject.getScores()) {
                sumScore += score;
            }
            sumOfSubjectAverageMarks += sumScore / subject.getScores().size();
        }
        double averageMark = sumOfSubjectAverageMarks / subjects.size();
        double roundedAverageMark = Math.round(averageMark * 100.0) / 100.0;
        return roundedAverageMark;
    }

    public List<Subject> getSubjects() throws NoSubjectsException {
        if (subjects.isEmpty()) {
            throw new NoSubjectsException();
        }
        return subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

