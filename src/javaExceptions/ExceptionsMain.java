package javaExceptions;

import java.util.List;

// EPAM Automated Testing: Java Foundations
// Aidyn Seipolla

public class ExceptionsMain {

    public static void main(String[] args) throws NoGroupsException {

        var subjectMathForJohn = new Subject("Math", List.of(4.0, 4.2, 3.8));
        var subjectPhysicsForJohn = new Subject("Physics", List.of(3.5, 3.2, 4.0));
        var subjectMathForAlex = new Subject("Math", List.of(3.5, 2.2, 2.6));
        var subjectMechanicsForAlex = new Subject("Mechanics", List.of(3.8, 4.4, 3.7));
        var subjectMaterialsForKevin = new Subject("Materials", List.of(3.1, 2.6, 3.5));
        var subjectMathForKevin = new Subject("Math", List.of(2.4, 3.5, 4.0));
        var subjectKineticsForDanny = new Subject("Kinetics", List.of(2.8, 2.4, 3.1));
        var subjectPhysicsForDanny = new Subject("Physics", List.of(3.5, 3.0, 4.6));
        var subjectPhysicsForSally = new Subject("Physics", List.of(2.5, 2.7, 2.5));
        var subjectMaterialsForSally = new Subject("Materials", List.of(2.8, 2.9, 3.8));
        var subjectMechanicsForKim = new Subject("Mechanics", List.of(3.9, 4.2, 4.1));
        var subjectKineticsForKim = new Subject("Kinetics", List.of(3.1, 2.8, 3.5));
        var subjectChemistryForMarry = new Subject("Chemistry", List.of(3.9, 3.8, 4.5));
        var subjectMathForMarry = new Subject("Math", List.of(4.1, 3.4, 3.5));
        var subjectKineticsForBrian = new Subject("Kinetics", List.of(2.9, 2.5, 3.2));
        var subjectChemistryForBrian = new Subject("Chemistry", List.of(3.7, 3.1, 4.0));

        var studentJohn = new Student("John", List.of(subjectMathForJohn, subjectPhysicsForJohn));
        var studentAlex = new Student("Alex", List.of(subjectMathForAlex, subjectMechanicsForAlex));
        var studentKevin = new Student("Kevin", List.of(subjectMaterialsForKevin, subjectMathForKevin));
        var studentDanny = new Student("Danny", List.of(subjectKineticsForDanny, subjectPhysicsForDanny));
        var studentSally = new Student("Sally", List.of(subjectPhysicsForSally, subjectMaterialsForSally));
        var studentKim = new Student("Kim", List.of(subjectMechanicsForKim, subjectKineticsForKim));
        var studentMarry = new Student("Marry", List.of(subjectChemistryForMarry, subjectMathForMarry));
        var studentBrian = new Student("Brian", List.of(subjectKineticsForBrian, subjectChemistryForBrian));


        // University's hierarchy

        Group physicsGroupI = new Group("Physics I", List.of(studentJohn, studentAlex));
        Group chemistryGroupI = new Group("Chemistry I", List.of(studentMarry, studentBrian));
        Group physicsGroupII = new Group("Physics II", List.of(studentKevin, studentDanny));
        Group chemistryGroupII = new Group("Chemistry II", List.of(studentSally, studentKim));
        Faculty physics = new Faculty("Physics", List.of(physicsGroupI, physicsGroupII));
        Faculty chemistry = new Faculty("Chemistry", List.of(chemistryGroupI, chemistryGroupII));
        University university = new University(List.of(physics, chemistry));

        university.averageScoreForAllStudents();
        try {
            university.getAverageScorePerSubjectPerGroup();
            university.getAverageScorePerSubject();
        } catch (InvalidScoreException e) {
            System.out.println("Invalid score, check your data set..");
        } catch (NoSubjectsException e) {
            System.out.println("No subjects in group..");
        } catch (NoGroupsException e) {
            System.out.println("No groups in faculty..");
        } catch (NoFacultiesException e) {
            System.out.println("No faculties in university..");
        }
    }
}




