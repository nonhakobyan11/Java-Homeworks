package homework1.university_problem;

import java.util.ArrayList;
import java.util.InputMismatchException;

import static java.lang.System.exit;

public class FacultyFactory {

    public interface Faculty{

        void setArrayOfGroupsInTheFaculty();
        void setStudentListForGroups(int option);
        void setSubjectsListForGroups(int option);
        void setSubjectsForOneStudent(int quantity, int option);
        ArrayList<String> getArrayOfGroupsInTheFaculty();
        ArrayList<String> getStudentListGroup();
        ArrayList<String> getSubjectsListForGroup1();
        ArrayList<String> getSubjectsListForGroup2();
        ArrayList<String> getSubjectsListForGroup3();
        ArrayList<String> getSubjectsForOneStudent();


    }

    public Faculty getFaculty(int type) {
        Faculty chosenFacultyObject = null;
        switch (type) {
            case 1:
                chosenFacultyObject = new ComputerSystems();
                break;
            case 2:
                chosenFacultyObject = new Cybernetics();
                break;
            default:
                try {
                    throw new InputMismatchException();
                } catch (InputMismatchException e) {
                    System.out.println("Sorry. There is no faculty with this name in our University.");
                    exit(0);
                }
        }
        return chosenFacultyObject;
    }
}
