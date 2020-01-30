package homework3.task1;

import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // a)
        StudentService service = new StudentService();
        List<Student> myStudentList = service.initialize();
        HashMap<Student, Integer> myStudentMap = service.getStudentMap(myStudentList);
        service.printStudentMap(myStudentMap);

    }
}
