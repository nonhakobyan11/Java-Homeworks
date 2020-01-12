package homework1.university_problem;

import java.util.ArrayList;
import java.util.Scanner;

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
        if (mark >= 0 && mark <= 10) {
            marksOfSubject.add(mark);
        } else {
            throw new ArithmeticException("The mark should be more than 0 and less or equal 10.");
        }
    }

    public ArrayList<Double> getStudentGradesOfSubject() {
        return marksOfSubject;
    }

    public double calculateAverageGrade(ArrayList<Double> grades){
        double sum = 0;
        average = 0;
        for (int i = 0; i < grades.size(); i++){
            sum += grades.get(i);
        }
        average = sum / grades.size();
        return average;
    }

    public void calculateAverageMarkForOneStudent(){
        setStudentsMarksForSubject();
        ArrayList<Double> allGrades = getStudentGradesOfSubject();
        calculateAverageGrade(allGrades);
        System.out.println("Your average is: " + average);
    }

    public void  calculateAverageMarkForGroup(FacultyFactory.Faculty faculty, int group, int student){
        faculty.setStudentListForGroups(group);
        ArrayList<String> allStudentsInGroup = faculty.getStudentListGroup();
        for (String i : allStudentsInGroup){
            if(i != allStudentsInGroup.get(student - 1)) {
                System.out.println("Enter grades of " + i);
                setStudentsMarksForSubject();
            }
        }
        ArrayList<Double> allGradesOfGroup = getStudentGradesOfSubject();
        calculateAverageGrade(allGradesOfGroup);
        System.out.println("The average for the whole group is: " + average);
    }


    public void calculateAverageMarkForFaculty(FacultyFactory.Faculty faculty, int option){
        faculty.setStudentListForGroups(1);
        faculty.setStudentListForGroups(2);
        faculty.setStudentListForGroups(3);
        ArrayList<String> allStudentsInFaculty = faculty.getStudentListGroup();
        for (String i : allStudentsInFaculty){
            if(i != allStudentsInFaculty.get(option - 1)) {
                System.out.println("Enter grades of " + i);
                setStudentsMarksForSubject();
            }
        }
        ArrayList<Double> allGradesOfFaculty = getStudentGradesOfSubject();
        calculateAverageGrade(allGradesOfFaculty);
        System.out.println("The average for the whole Faculty is: " + average);
    }

    protected void calculateAverageGradeForUniversity(FacultyFactory.Faculty obj1, FacultyFactory.Faculty obj2, int option){
        obj1.setStudentListForGroups(1);
        obj1.setStudentListForGroups(2);
        obj1.setStudentListForGroups(3);

        obj2.setStudentListForGroups(1);
        obj2.setStudentListForGroups(2);
        obj2.setStudentListForGroups(3);
        ArrayList<String> allStudentsInUniversity = obj1.getStudentListGroup();
        ArrayList<String> studentsOfSecondGroup = obj2.getStudentListGroup();
        for (String i : studentsOfSecondGroup){
            allStudentsInUniversity.add(i);
        }

        for (String i : allStudentsInUniversity){
            if(i != allStudentsInUniversity.get(option - 1)) {
                System.out.println("Enter grades of " + i);
                setStudentsMarksForSubject();
            }
        }
        ArrayList<Double> allMarksOfUniversity = getStudentGradesOfSubject();
        calculateAverageGrade(allMarksOfUniversity);
        System.out.println("The average for the whole University is: " + average);
    }
}
