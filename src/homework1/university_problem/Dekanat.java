package homework1.university_problem;

import java.util.ArrayList;
import java.util.Scanner;

public class Dekanat {

    double average = 0;
    ArrayList<Double> gradesOfSubject = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void printArray(ArrayList<String> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println((i + 1) + ". " + array.get(i));
        }
    }

    public void setStudentsGradesForSubject() {
        System.out.print("Enter first midterm result: ");
        double firstMidterm = scanner.nextDouble();
        checkInputedGrade(firstMidterm);
        System.out.print("Enter second midterm result: ");
        double secondMidterm = scanner.nextDouble();
        checkInputedGrade(secondMidterm);
        System.out.print("Enter exam result: ");
        double exam = scanner.nextDouble();
        checkInputedGrade(exam);
    }

    public void checkInputedGrade(double grade) {
        if (grade >= 0 && grade <= 10) {
            gradesOfSubject.add(grade);
        } else {
            throw new ArithmeticException("The grade should be more than 0 and less or equal 10.");
        }
    }

    public ArrayList<Double> getStudentGradesOfSubject() {
        return gradesOfSubject;
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

    public void calculateAverageGradeForOneStudent(){
        setStudentsGradesForSubject();
        ArrayList<Double> allGrades = getStudentGradesOfSubject();
        calculateAverageGrade(allGrades);
        System.out.println("Your average is: " + average);
    }

    public void  calculateAverageGradeForGroup(FacultyFactory.Faculty faculty, int group, int student){
        faculty.setStudentListForGroups(group);
        ArrayList<String> allStudentsInGroup = faculty.getStudentListGroup();
        for (String i : allStudentsInGroup){
            if(i != allStudentsInGroup.get(student - 1)) {
                System.out.println("Enter grades of " + i);
                setStudentsGradesForSubject();
            }
        }
        ArrayList<Double> allGradesOfGroup = getStudentGradesOfSubject();
        calculateAverageGrade(allGradesOfGroup);
        System.out.println("The average for the whole group is: " + average);
    }


    public void calculateAverageGradeForFaculty(FacultyFactory.Faculty faculty, int option){
        faculty.setStudentListForGroups(1);
        faculty.setStudentListForGroups(2);
        faculty.setStudentListForGroups(3);
        ArrayList<String> allStudentsInFaculty = faculty.getStudentListGroup();
        for (String i : allStudentsInFaculty){
            if(i != allStudentsInFaculty.get(option - 1)) {
                System.out.println("Enter grades of " + i);
                setStudentsGradesForSubject();
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
                setStudentsGradesForSubject();
            }
        }
        ArrayList<Double> allGradesOfUniversity = getStudentGradesOfSubject();
        calculateAverageGrade(allGradesOfUniversity);
        System.out.println("The average for the whole University is: " + average);
    }
}
