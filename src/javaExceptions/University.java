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

    public void averageScoreForAllStudents() throws NoGroupsException, NoStudentsException {
        System.out.println("Average grades of the following students: ");
        for (Faculty faculty : faculties) {
            for (Group group : faculty.getGroups()) {
                for (Student student : group.getStudents()) {
                    System.out.print(student.getName() + ": " + student.getAverageMark() + " | ");
                }
            }
        }

    }

    public void getAverageScorePerSubjectPerGroup() throws InvalidScoreException, NoSubjectsException, NoStudentsException, NoGroupsException, NoFacultiesException {

        System.out.println("\n");
        System.out.println("Average grades of subjects in each group: ");
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
                    double averageForSubject = sum / subjectWithAverages.getValue().size();
                    double roundedAverageForSubject = Math.round(averageForSubject * 100.0) / 100.0;
                    System.out.println("Faculty: " + faculty.getName() + ", Group: " + group.getName() + ", Subject: " + subjectWithAverages.getKey() + ", average grade: " + roundedAverageForSubject);
                }
            }
        }

    }

    public void getAverageScorePerSubject() throws InvalidScoreException, NoSubjectsException, NoStudentsException, NoGroupsException, NoFacultiesException {

        System.out.println("\n");
        System.out.println("Average grades of subjects in university: ");

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
            double averageForSubject = sum / subjectWithAverages.getValue().size();
            double roundedAverageForSubject = Math.round(averageForSubject * 100.0) / 100.0;
            System.out.println("Subject " + subjectWithAverages.getKey() + " average = " + roundedAverageForSubject);
        }

    }

}