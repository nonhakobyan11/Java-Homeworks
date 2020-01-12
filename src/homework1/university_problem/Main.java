package homework1.university_problem;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int optionFaculty;
        int optionGroup;
        int optionStudent;

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
        if(optionStudent >= studentsOfChosenGroup.size()) {
            throw new IndexOutOfBoundsException("There is no student with this name in your Group.");
        }
        System.out.println("Hi, " + studentsOfChosenGroup.get(optionStudent - 1) + "!");

        // Subjects of Group
        chosenFaculty.setSubjectsListForGroups(optionGroup);
        ArrayList<String> subjectsOfChosenGroup = chosenFaculty.getSubjectsListForGroup();
        System.out.println("\nBelow are mentioned all subjects that you are studying.");
        dekanat.printArray(subjectsOfChosenGroup);

    }
}
