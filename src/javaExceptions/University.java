package javaExceptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class University {
    List<Faculty> faculties;


    public University(List<Faculty> faculties) {
        this.faculties = faculties;

    }

    public void averageScoreForAllStudents() {
        for (Faculty faculty : faculties) {
            for (Group group : faculty.getGroups()) {
                for (Student student : group.getStudents()) {
                    System.out.println("Average for student " + student.getName() + " is " + student.getAverageMark());
                }
            }
        }

    }

    public void getAverageScorePerSubjectPerGroup() throws InvalidScoreException, NoSubjectsException {


        for (Faculty faculty : faculties) {
            for (Group group : faculty.getGroups()) {
                Map<String, List<Double>> sumOfAveragePerSubject = new HashMap<>();
                for (Student student : group.getStudents()) {
                    for (Subject subject : student.getSubjects()) {
                        sumOfAveragePerSubject.computeIfAbsent(subject.getName(), k -> new ArrayList<>()).add(subject.getAverageScore());
                    }

                }
                for (Map.Entry<String, List<Double>> subjectWithAverages : sumOfAveragePerSubject.entrySet()) {
                    double sum = 0;
                    for (double score : subjectWithAverages.getValue()) {
                        sum += score;
                    }
                    double averageForsubject = sum / subjectWithAverages.getValue().size();
                    System.out.println("Faculty " + faculty.getName() + " Group " + group.getName() + " Subject " + subjectWithAverages.getKey() + " average = " + averageForsubject);
                }
            }
        }

    }

    public void getAverageScorePerSubject() throws InvalidScoreException, NoSubjectsException {


        Map<String, List<Double>> sumOfAveragePerSubject = new HashMap<>();

        for (Faculty faculty : faculties) {
            for (Group group : faculty.getGroups()) {
                for (Student student : group.getStudents()) {
                    for (Subject subject : student.getSubjects()) {
                        sumOfAveragePerSubject.computeIfAbsent(subject.getName(), k -> new ArrayList<>()).add(subject.getAverageScore());
                    }

                }
            }
        }
        for (Map.Entry<String, List<Double>> subjectWithAverages : sumOfAveragePerSubject.entrySet()) {
            double sum = 0;
            for (double score : subjectWithAverages.getValue()) {
                sum += score;
            }
            double averageForsubject = sum / subjectWithAverages.getValue().size();
            System.out.println("Subject " + subjectWithAverages.getKey() + " average = " + averageForsubject);
        }

    }

}