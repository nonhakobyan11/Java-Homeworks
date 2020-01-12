package homework1.university_problem;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Cybernetics implements FacultyFactory.Faculty {
    ArrayList<String> groupNames = new ArrayList<>();
    ArrayList<String> studentsListGroup = new ArrayList<>();
    ArrayList<String> subjectsListGroup = new ArrayList<>();


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
                System.out.println("Try again.");
                throw new InputMismatchException("There is no group with this name in our Faculty");
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
    public ArrayList<String> getSubjectsListForGroup() {
        return subjectsListGroup;
    }


}
