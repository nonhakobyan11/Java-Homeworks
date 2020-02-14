package homework1.university_problem;

import homework1.university_problem.service.Dekanat;

public class Main {

    public static void main(String[] args) {
        Dekanat dekanat = new Dekanat();
        dekanat.createTheUniversity();
        dekanat.calculateAverageForOneStudent("Hambardzumyan Erik");
        dekanat.calculateAverageGradeForGroup("Information Security", "Cryptography and Secrecy");
        dekanat.calculateAverageGradeForFaculty("Computer Science", "Algorithms Basics. Java Core");
        dekanat.calculateAverageGradeForUniversity("Mathematical analysis");
    }
}
