package homework1.university_problem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;

public class Cybernetics implements FacultyFactory.Faculty {
    ArrayList<String> groupNames = new ArrayList<>();
    ArrayList<String> studentsListGroup = new ArrayList<>();
    ArrayList<String> subjectsListGroup = new ArrayList<>();
    ArrayList<String> subjectsListForOneStudent = new ArrayList<>();


    @Override
    public void setArrayOfGroupsInTheFaculty() {
        groupNames.add("Microelectronics");
        groupNames.add("Management Systems");
        groupNames.add("Metrology");
    }


    @Override
    public void setStudentListForGroups(int option) {
        switch(option) {
            case 1: //Microelectronics
                studentsListGroup.add("Vardanyan Harutyun");
                studentsListGroup.add("Mkrtchyan Arsen");
                studentsListGroup.add("Karapetyan Mari");
                break;
            case 2: // Management Systems
                studentsListGroup.add("Hovhannisyan Martin");
                studentsListGroup.add("Hambardzumyan Erik");
                break;
            case 3: // Metrology
                studentsListGroup.add("Abrahamyan Kristine");
                studentsListGroup.add("Niazyan Alexander");
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
        switch(option) {
            case 1:  // Microelectronics
                subjectsListGroup.add("Mathematical analysis");
                subjectsListGroup.add("C++ Fundamentals");
                subjectsListGroup.add("Microelectronic");
                break;
            case 2: // Management Systems
                subjectsListGroup.add("Mathematical analysis");
                subjectsListGroup.add("Management Systems");
                subjectsListGroup.add("MathLab Fundamentals");
                break;
            case 3: //Metrology
                subjectsListGroup.add("Mathematical analysis");
                subjectsListGroup.add("Metrology and Certification");
                subjectsListGroup.add("C++ Fundamentals");
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
    public void setSubjectsForOneStudent(int quantity){ // qani hat ararka
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < quantity; i++) {
            System.out.println("Enter the subject.");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    subjectsListForOneStudent.add(subjectsListGroup.get(0));
                    break;
                case 2:
                    subjectsListForOneStudent.add(subjectsListGroup.get(1));
                    break;
                case 3:
                    subjectsListForOneStudent.add(subjectsListGroup.get(2));
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
    public ArrayList<String> getSubjectsListForGroup() {
        return subjectsListGroup;
    }

    @Override
    public ArrayList<String> getSubjectsForOneStudent() {
        return subjectsListForOneStudent;
    }


}
