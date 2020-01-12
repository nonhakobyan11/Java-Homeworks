package homework1.university_problem;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Dekanat {

    double average = 0;
    ArrayList<Double> marksOfSubject = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void printArray(ArrayList<String> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println((i + 1) + ". " + array.get(i));
        }
    }

    public void setStudentsMarksForSubject() {
        System.out.print("Enter first midterm result: ");
        double firstMidterm = scanner.nextDouble();
        checkInputedMark(firstMidterm);
        System.out.print("Enter second midterm result: ");
        double secondMidterm = scanner.nextDouble();
        checkInputedMark(secondMidterm);
        System.out.print("Enter exam result: ");
        double exam = scanner.nextDouble();
        checkInputedMark(exam);
    }

    public void checkInputedMark(double mark) {
        try {
            if (mark >= 0 && mark <= 10) {
                marksOfSubject.add(mark);
            } else {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.out.println("The mark should be more than 0 and less or equal 10.");
            exit(0);
        }
    }

    public ArrayList<Double> getStudentMarksOfSubject() {
        return marksOfSubject;
    }

    public void calculateAverageMark(ArrayList<Double> grades){
        double sum = 0;
        for (int i = 0; i < grades.size(); i++){
            sum += grades.get(i);
        }
        average = sum / grades.size();
    }

    public void calculateAverageMarkForOneStudent(){
        setStudentsMarksForSubject();
        ArrayList<Double> allGrades = getStudentMarksOfSubject();
        calculateAverageMark(allGrades);
        System.out.println("Your average is: " + average);
    }

    public void  calculateAverageMarkForGroup(FacultyFactory.Faculty faculty, int group){
        marksOfSubject.clear();
        faculty.setStudentListForGroups(group);
        ArrayList<String> allStudentsInGroup = faculty.getStudentListGroup();
        for (String i : allStudentsInGroup){
            System.out.println("Enter grades of " + i);
            setStudentsMarksForSubject();
        }
        ArrayList<Double> allGradesOfGroup = getStudentMarksOfSubject();
        calculateAverageMark(allGradesOfGroup);
        System.out.println("The average for the whole group is: " + average);
    }


    public void calculateAverageMarkForFaculty(FacultyFactory.Faculty faculty, String subject){
        marksOfSubject.clear();
        checkWhetherOrNotStudentsStudyCurrentSubject(faculty, subject);
        ArrayList<String> allStudentsInFaculty = faculty.getStudentListGroup();

        for (String i : allStudentsInFaculty){
            System.out.println("Enter grades of " + i);
            setStudentsMarksForSubject();
        }
        ArrayList<Double> allGradesOfFaculty = getStudentMarksOfSubject();
        calculateAverageMark(allGradesOfFaculty);
        System.out.println("The average for the whole Faculty is: " + average);
    }

    protected void calculateAverageGradeForUniversity(FacultyFactory.Faculty obj1, FacultyFactory.Faculty obj2, String subject){
        marksOfSubject.clear();
        checkWhetherOrNotStudentsStudyCurrentSubject(obj1, subject);
        checkWhetherOrNotStudentsStudyCurrentSubject(obj2, subject);

        ArrayList<String> allStudentsInUniversity = obj1.getStudentListGroup();
        ArrayList<String> studentsOfSecondGroup = obj2.getStudentListGroup();
        for (String i : studentsOfSecondGroup){
            allStudentsInUniversity.add(i);
        }
        for (String i : allStudentsInUniversity){
            System.out.println("Enter grades of " + i);
            setStudentsMarksForSubject();
        }
        ArrayList<Double> allMarksOfUniversity = getStudentMarksOfSubject();
        calculateAverageMark(allMarksOfUniversity);
        System.out.println("The average for the whole University is: " + average);
    }

    public void checkWhetherOrNotStudentsStudyCurrentSubject(FacultyFactory.Faculty faculty, String subject){
        faculty.setSubjectsListForGroups(1);
        faculty.setSubjectsListForGroups(2);
        faculty.setSubjectsListForGroups(3);
        ArrayList<String> group1 = faculty.getSubjectsListForGroup1();
        ArrayList<String> group2 = faculty.getSubjectsListForGroup2();
        ArrayList<String> group3 = faculty.getSubjectsListForGroup3();
        if(group1.contains(subject)){
            faculty.setStudentListForGroups(1);
        }
        if(group2.contains(subject)){
            faculty.setStudentListForGroups(2);
        }
        if(group3.contains(subject)){
            faculty.setStudentListForGroups(3);
        }
    }
}
