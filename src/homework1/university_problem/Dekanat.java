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

    public void calculateAverageMark(ArrayList<Double> marks){
        double sum = 0;
        for (int i = 0; i < marks.size(); i++){
            sum += marks.get(i);
        }
        average = sum / marks.size();
    }

    public void calculateAverageMarkForOneStudent(){
        marksOfSubject.clear();
        setStudentsMarksForSubject();
        ArrayList<Double> allMarks = getStudentMarksOfSubject();
        calculateAverageMark(allMarks);
        System.out.println("Your average is: " + average);
    }

    public void  calculateAverageMarkForGroup(FacultyFactory.Faculty faculty, int group){
        marksOfSubject.clear();
        faculty.setStudentListForGroups(group);
        ArrayList<String> allStudentsInGroup = faculty.getStudentListGroup();
        setAllMarks(allStudentsInGroup);
        ArrayList<Double> allMarksOfGroup = getStudentMarksOfSubject();
        calculateAverageMark(allMarksOfGroup);
        System.out.println("The average for the whole group is: " + average);
    }


    public void calculateAverageMarkForFaculty(FacultyFactory.Faculty faculty){
        marksOfSubject.clear();
        faculty.setStudentListForGroups(1);
        faculty.setStudentListForGroups(2);
        faculty.setStudentListForGroups(3);
        ArrayList<String> allStudentsInFaculty = faculty.getStudentListGroup();
        setAllMarks(allStudentsInFaculty);
        ArrayList<Double> allMarksOfFaculty = getStudentMarksOfSubject();
        calculateAverageMark(allMarksOfFaculty);
        System.out.println("The average for the whole Faculty is: " + average);
    }

    public void calculateAverageGradeForUniversity(FacultyFactory.Faculty obj1, FacultyFactory.Faculty obj2){
        marksOfSubject.clear();
        obj1.setStudentListForGroups(1);
        obj1.setStudentListForGroups(2);
        obj1.setStudentListForGroups(3);
        ArrayList<String> allStudentsInUniversity = obj1.getStudentListGroup();
        obj2.setStudentListForGroups(1);
        obj2.setStudentListForGroups(2);
        obj2.setStudentListForGroups(3);
        ArrayList<String> studentsOfSecondFaculty = obj2.getStudentListGroup();
        for (String i : studentsOfSecondFaculty){
            allStudentsInUniversity.add(i);
        }
        setAllMarks(allStudentsInUniversity);
        ArrayList<Double> allMarksOfUniversity = getStudentMarksOfSubject();
        calculateAverageMark(allMarksOfUniversity);
        System.out.println("The average for the whole University is: " + average);
    }

    public void setAllMarks(ArrayList<String> allStudents){
        for (String i : allStudents){
            System.out.println("Does " + i + " studies this lesson? (y/n)");
            String option = scanner.next();
            switch(option) {
                case ("y"):
                    System.out.println("Enter marks of " + i);
                    setStudentsMarksForSubject();
                    break;
                case ("n"):
                    break;
                default:
                    System.out.println("Wrong Input!");
                    System.out.println("Automatically sets as 'no'");
                    break;
            }
        }

    }

}
