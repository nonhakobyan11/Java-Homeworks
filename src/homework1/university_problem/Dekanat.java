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
}
