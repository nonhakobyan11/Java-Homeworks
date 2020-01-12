package homework1.university_problem;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Cybernetics implements FacultyFactory.Faculty {
    ArrayList<String> groupNames = new ArrayList<>();
    ArrayList<String> studentsListGroup = new ArrayList<>();
    ArrayList<String> subjectsListGroup1 = new ArrayList<>();
    ArrayList<String> subjectsListGroup2 = new ArrayList<>();
    ArrayList<String> subjectsListGroup3 = new ArrayList<>();


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
                subjectsListGroup1.add("Mathematical analysis");
                subjectsListGroup1.add("C++ Fundamentals");
                subjectsListGroup1.add("Microelectronic");
                break;
            case 2: // Management Systems
                subjectsListGroup2.add("Mathematical analysis");
                subjectsListGroup2.add("Management Systems");
                subjectsListGroup2.add("MathLab Fundamentals");
                break;
            case 3: //Metrology
                subjectsListGroup3.add("Mathematical analysis");
                subjectsListGroup3.add("Metrology and Certification");
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


}
