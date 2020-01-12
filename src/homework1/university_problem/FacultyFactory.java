package homework1.university_problem;

import java.util.ArrayList;

public class FacultyFactory {

    public interface Faculty{

        void setArrayOfGroupsInTheFaculty();
        void setStudentListForGroups(int option);
        void setSubjectsListForGroups(int option);
        ArrayList<String> getArrayOfGroupsInTheFaculty();
        ArrayList<String> getStudentListGroup();
        ArrayList<String> getSubjectsListForGroup();
        
    }

}
