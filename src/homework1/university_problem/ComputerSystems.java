package homework1.university_problem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ComputerSystems implements FacultyFactory.Faculty {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> groupNames = new ArrayList<>();
    ArrayList<String> studentsListGroup = new ArrayList<>();
    ArrayList<String> subjectsListGroup = new ArrayList<>();


    @Override
    public void setArrayOfGroupsInTheFaculty() {
        groupNames.add("Software Engineering");
        groupNames.add("Network Engineering");
        groupNames.add("Information Security");
    }


    @Override
    public void setStudentListForGroups(int option) {
        switch (option) {
            case 1: //Software Engineering
                studentsListGroup.add("Karapetyan Andranik");
                studentsListGroup.add("Mkrtchyan Varujan");
                studentsListGroup.add("Hovhannisyan Mariam");
                break;
            case 2: //Network Engineering
                studentsListGroup.add("Vardanyan Artak");
                studentsListGroup.add("Hovhannisyan Karen");
                break;
            case 3: //Information Security
                studentsListGroup.add("Harutyunyan Armine");
                studentsListGroup.add("Mkrtchyan Armen");
                break;
            default:
                System.out.println("Try again.");
                throw new InputMismatchException("There is no group with this name in our Faculty");
        }
    }

    @Override
    public void setSubjectsListForGroups(int option) {
        switch (option) {
            case 1: // Software Engineering
                subjectsListGroup.add("Mathematical analysis");
                subjectsListGroup.add("Java Core");
                subjectsListGroup.add("Boolean Math");
                subjectsListGroup.add("Algorithms Basics");
                break;
            case 2: // Network Engineering
                subjectsListGroup.add("Mathematical analysis");
                subjectsListGroup.add("Basics of Networking");
                subjectsListGroup.add("Network Security");
                break;
            case 3: // Information Security
                subjectsListGroup.add("Mathematical analysis");
                subjectsListGroup.add("Cryptography and Secrecy");
                subjectsListGroup.add("Boolean Math");
                subjectsListGroup.add("Network Security");
                break;
            default:
                System.out.println("Try again.");
                throw new InputMismatchException("There is no subject with this name in our Faculty.");
        }
    }


    @Override
    public ArrayList<String> getArrayOfGroupsInTheFaculty() {
        return groupNames;
    }

    @Override
    public ArrayList<String> getStudentListGroup() {
        return studentsListGroup;
    }

    @Override
    public ArrayList<String> getSubjectsԼistForGroup() {
        return subjectsListGroup;
    }


}
