package homework1.university_problem;

import java.util.ArrayList;
import java.util.InputMismatchException;

import static java.lang.System.exit;

public class ComputerSystems implements FacultyFactory.Faculty {
    ArrayList<String> groupNames = new ArrayList<>();
    ArrayList<String> studentsListGroup = new ArrayList<>();
    ArrayList<String> subjectsListGroup1 = new ArrayList<>();
    ArrayList<String> subjectsListGroup2 = new ArrayList<>();
    ArrayList<String> subjectsListGroup3 = new ArrayList<>();
    ArrayList<String> subjectsListForOneStudent = new ArrayList<>();


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
                try {
                    throw new InputMismatchException();
                } catch (InputMismatchException e) {
                    System.out.println("Sorry. There is no group with this name in our Faculty.");
                    exit(0);
                }
        }
    }

    @Override
    public void setSubjectsListForGroups(int option) {
        switch (option) {
            case 1: // Software Engineering
                subjectsListGroup1.add("Mathematical analysis");
                subjectsListGroup1.add("Boolean Math");
                subjectsListGroup1.add("Algorithms Basics. Java Core.");
                break;
            case 2: // Network Engineering
                subjectsListGroup2.add("Mathematical analysis");
                subjectsListGroup2.add("Basics of Networking");
                subjectsListGroup2.add("Network Security");
                break;
            case 3: // Information Security
                subjectsListGroup3.add("Cryptography and Secrecy");
                subjectsListGroup3.add("Boolean Math");
                subjectsListGroup3.add("Network Security");
                break;
            default:
                try {
                    throw new InputMismatchException();
                } catch (InputMismatchException e) {
                    System.out.println("Sorry. There is no subject with this name in our Faculty.");
                    exit(0);
                }
        }
    }


    @Override
    public void setSubjectsForOneStudent(int quantity, int option){ // qani hat ararka
        for(int i = 0; i < quantity; i++) {
            System.out.println("Enter the subject.");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    subjectsListForOneStudent.add(subjectsListGroup1.get(1));
                    break;
                case 2:
                    subjectsListForOneStudent.add(subjectsListGroup1.get(2));
                    break;
                case 3:
                    subjectsListForOneStudent.add(subjectsListGroup1.get(3));
                    break;
                default:
                    try {
                        throw new InputMismatchException();
                    } catch (InputMismatchException e) {
                        System.out.println("Sorry. You need to choose one of the Subjects mentioned above.");
                        exit(0);
                    }
            }
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
    public ArrayList<String> getSubjectsListForGroup1() {
        return subjectsListGroup1;
    }

    @Override
    public ArrayList<String> getSubjectsListForGroup2() {
        return subjectsListGroup2;
    }

    @Override
    public ArrayList<String> getSubjectsListForGroup3() {
        return subjectsListGroup3;
    }

    @Override
    public ArrayList<String> getSubjectsForOneStudent() {
        return subjectsListForOneStudent;
    }


}
