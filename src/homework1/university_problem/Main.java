package homework1.university_problem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;


public class Main {

    public static void main(String[] args) {
        int optionFaculty;
        int optionGroup;
        int optionStudent;
        int optionSubject;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to " + University.getUniversityName() + "!!!");

        FacultyFactory factory = new FacultyFactory();
        Dekanat dekanat = new Dekanat();

        // Faculty of University
        System.out.println("\nBelow are mentioned the faculties of our University. Choose which one is yours.");
        System.out.println("1. Computer Systems\n2. Cybernetics");
        optionFaculty = scanner.nextInt();
        FacultyFactory.Faculty chosenFaculty = factory.getFaculty(optionFaculty);

        // chosenFaculty - is object of chosen faculty, every next function will be invoked with this object

        // Groups of Faculty
        chosenFaculty.setArrayOfGroupsInTheFaculty();
        ArrayList<String> groupsOfChosenFaculty = chosenFaculty.getArrayOfGroupsInTheFaculty();
        System.out.println("\nBelow are mentioned groups of the Faculty. Choose which one is yours.");
        dekanat.printArray(groupsOfChosenFaculty);
        optionGroup = scanner.nextInt();

        // Students of Group
        chosenFaculty.setStudentListForGroups(optionGroup);
        ArrayList<String> studentsOfChosenGroup = chosenFaculty.getStudentListGroup();
        System.out.println("\nBelow are mentioned all students full names in the group. Choose yours.");
        dekanat.printArray(studentsOfChosenGroup);
        optionStudent = scanner.nextInt();
        if(optionStudent > studentsOfChosenGroup.size()) {
            throw new IndexOutOfBoundsException("There is no student with this name in your Group.");
        }
        System.out.println("Hi, " + studentsOfChosenGroup.get(optionStudent - 1) + "!");

        // Subjects of Group
        chosenFaculty.setSubjectsListForGroups(optionGroup);
        ArrayList<String> subjectsOfChosenGroup = chosenFaculty.getSubjectsListForGroup();
        System.out.println("\nBelow are mentioned all subjects that you are studying.");
        dekanat.printArray(subjectsOfChosenGroup);

        System.out.println("\nSo, " + studentsOfChosenGroup.get(optionStudent - 1) + ", which subject's GPA do you want to know?");
        optionSubject = scanner.nextInt();
        if(optionSubject > subjectsOfChosenGroup.size()) {
            throw new IndexOutOfBoundsException("There is no subject with this name in your Group.");
        }
        System.out.println("Please, enter your grades from '" + subjectsOfChosenGroup.get(optionSubject - 1) + "' subject.");
        dekanat.calculateAverageMarkForOneStudent();

        // View more options that can interest you
        studentsOfChosenGroup.clear();
        subjectsOfChosenGroup.clear();

        while(true) {
            System.out.println("\nAlso you can get average grade of this subject for:");
            System.out.println("1. All group\n2. All faculty\n3. All university\n\nEnter '4' if you want to exit program.");
            int optionAverage = scanner.nextInt();
            switch (optionAverage) {
                case 1:
                    dekanat.calculateAverageMarkForGroup(chosenFaculty, optionGroup, optionStudent);
                    break;
                case 2:
                    dekanat.calculateAverageMarkForFaculty(chosenFaculty, optionStudent);
                    break;
                case 3:
                    dekanat.calculateAverageGradeForUniversity(factory.getFaculty(1), factory.getFaculty(2), optionStudent);
                    break;
                case 4:
                    System.out.println("We hope you are enjoying your study in our University.");
                    exit(0);
                default:
                    System.out.println("Try again.");
                    throw new InputMismatchException("There is no such option.");
            }
        }

    }
}
