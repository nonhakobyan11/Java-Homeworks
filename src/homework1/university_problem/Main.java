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
            try {
                throw new InputMismatchException();
            } catch(InputMismatchException e){
                System.out.println("Sorry. There is no student with this name in your Group.");
                exit(0);
            }
        }
        System.out.println("Hi, " + studentsOfChosenGroup.get(optionStudent - 1) + "!");

        // Subjects of Group
        chosenFaculty.setSubjectsListForGroups(optionGroup);
        ArrayList<String> subjectsOfChosenGroup = chosenFaculty.getSubjectsListForGroup();
        System.out.println("\nBelow are mentioned all subjects of your group.");
        dekanat.printArray(subjectsOfChosenGroup);
        System.out.println("\nHow many subjects do you study?");
        int quantityOfSubjects = scanner.nextInt();
        if(quantityOfSubjects == 1 || quantityOfSubjects == 2 || quantityOfSubjects == 3) {
            chosenFaculty.setSubjectsForOneStudent(quantityOfSubjects);
        }else {
            try {
                throw new InputMismatchException();
            } catch(InputMismatchException e){
                System.out.println("Sorry. You need to choose subject from the list.");
                exit(0);
            }
        }

        ArrayList<String> subjectsOfCurrentStudent = chosenFaculty.getSubjectsForOneStudent();
        for(int i = 0; i < subjectsOfCurrentStudent.size(); i++){
            System.out.println("Please, enter your marks from '" + subjectsOfCurrentStudent.get(i) + "' subject.");
            dekanat.calculateAverageMarkForOneStudent();
        }


        // View more options that can interest you

        while(true) {
            System.out.println("\nAlso you can get average mark for:");
            System.out.println("1. All group\n2. All faculty\n3. All university\n4. If you want to exit program.");
            int optionAverage = scanner.nextInt();
            System.out.println("Which subject's average do you want to know?");
            optionSubject = scanner.nextInt();
            switch (optionAverage) {
                case 1:
                    studentsOfChosenGroup.clear();
                    dekanat.calculateAverageMarkForGroup(chosenFaculty, optionGroup);
                    break;
                case 2:
                    studentsOfChosenGroup.clear();
                    dekanat.calculateAverageMarkForFaculty(chosenFaculty);
                    break;
                case 3:
                    studentsOfChosenGroup.clear();
                    dekanat.calculateAverageGradeForUniversity(factory.getFaculty(1), factory.getFaculty(2));
                    break;
                case 4:
                    System.out.println("We hope you are enjoying your study in our University.");
                    exit(0);
                default:
                    try {
                        throw new InputMismatchException();
                    } catch(InputMismatchException e){
                        System.out.println("Sorry. There is no such option.");
                        exit(0);
                    }
            }
        }
    }
}
