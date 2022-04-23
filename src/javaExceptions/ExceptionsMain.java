package javaExceptions;

import java.util.List;

public class ExceptionsMain {

    public static void main(String[] args) {

//        var johnSubjects = new HashMap<String, Double>();
//        johnSubjects.put("Math", 4.0);
//        johnSubjects.put("English", 3.0);
//        johnSubjects.put("History", 3.6);
//
//        var alexSubjects = new HashMap<String, Double>();
//        alexSubjects.put("Math", 2.5);
//        alexSubjects.put("Physics", 3.2);
//        alexSubjects.put("History", 2.6);


        var subjectMathForJohn = new Subject("Math", List.of(4.0, 4.2));
        var subjectMathForAlex = new Subject("Math", List.of(3.5, 2.2));

        var studentJohn = new Student("John", List.of(subjectMathForJohn));
        //  var studentRay =new Student ("Ray", johnSubjects) ;
        var studentAlex = new Student("Alex", List.of(subjectMathForAlex));
        //var studentTim =  new Student ("Tim",  alexSubjects);


        Group physicsGroup1 = new Group("Physics 1", List.of(studentJohn, studentAlex));
        Group chemistryGroup1 = new Group("Chemisty 1", List.of());
        Faculty physics = new Faculty("Physics", List.of(physicsGroup1));
        Faculty chemistry = new Faculty("Chemisty", List.of(chemistryGroup1));
        University university = new University(List.of(physics, chemistry));

        university.averageScoreForAllStudents();
        try {
            university.getAverageScorePerSubjectPerGroup();
            university.getAverageScorePerSubject();
        } catch (InvalidScoreException e) {
            System.out.println("Invalid score, check your data set..");
        } catch (NoSubjectsException e) {
            System.out.println("No subjects in group..");
        }

//        university.getAverageScoreFor("Physics 1", "Physics");
//        university.getAverageScorePerSubject();

//        students.forEach(student -> System.out.println("Student "+ student.getName() + " average mark:" +  student.getAverageMark()));

//                new Student ("Daniel", "Chemistry", "1A", 3.8, List.of("Intro to Chemistry", "Organic Chemistry I", "Biochemistry")),
//                new Student ("Walter", "Chemistry", "2A", 2.9, List.of("Organic Chemistry I", "Hydrocarbons", "Organic Synthesis")),
//                new Student ("Brian", "Physics", "2B", 3.2, List.of("Calculus II", "Intro to Mechanics", "Molecular Physics")),
//                new Student ("Jeff", "Physics", "2B", 2.7, List.of("Calculus II", "Intro to Mechanics", "Thermodynamics")),
//                new Student ("Jane", "Physics", "2A", 3.9, List.of("Calculus I", "Intro to Mechanics", "Thermodynamics")),
//                new Student ("Tiffany", "Chemistry", "1A", 3.1, List.of("Intro to Chemistry", "Organic Chemistry I", "Hydrocarbons")),
//                new Student ("Mary", "Chemistry", "1B", 3.4, List.of("Calculus I", "Organic Chemistry II", "Organic Synthesis")),
//                new Student ("Sally", "Chemistry", "1A", 3.7, List.of("Organic Synthesis", "Organic Chemistry I", "Biochemistry")),
//                new Student ("Kevin", "Chemistry", "2A", 2.8, List.of("Organic Chemistry II", "Hydrocarbons", "Calculus II")),
//                new Student ("Sue", "Chemistry", "2B", 2.5, List.of("Organic Chemistry I", "Calculus I", "Thermodynamics")),
//                new Student ("Michael", "Chemistry", "2A", 3.9, List.of("Organic Chemistry I", "Hydrocarbons", "Thermodynamics")),
    }

}




