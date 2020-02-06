package homework3.task1;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // a)
        StudentService service = new StudentService();
        List<Student> myStudentList = service.initialize();
        Map<Student, Integer> myStudentMap = service.getStudentsMap(myStudentList);
        service.printStudentMap(myStudentMap);

        //b
        Map<Faculty, Integer> myFacultyMap = service.getFacultiesMap(myStudentList);
        service.printFacultiesMap(myFacultyMap);

    }
}
