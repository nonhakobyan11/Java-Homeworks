package homework3.task1;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class StudentService {

    public List<Student> initialize(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Diana", "Asatryan", 22, "098111111", Faculty.MATH));
        students.add(new Student("Diana", "Asatryan", 32, "097121411", Faculty.PHYSICS));
        students.add(new Student("Diana", "Asatryan", 21, "093811171", Faculty.PHILOSOPHY));
        students.add(new Student("Karen", "Balayan", 18, "098111781", Faculty.MATH));
        students.add(new Student("Karen", "Balayan", 23, "098188751", Faculty.PHILOSOPHY));
        students.add(new Student("Elen", "Mirzoyan", 28, "098145811", Faculty.ENGLISH));
        return students;
    }

    // key - student, value - countOfOccurrences
    public Map<Student, Integer> getStudentsMap(List<Student> students) {
        Map<Student, Integer> studentsMap = new HashMap<>();
        for (Student s : students) {
            Integer countOfOccurrences = studentsMap.get(s);
            studentsMap.put(s, (countOfOccurrences == null) ? 1 : countOfOccurrences + 1);
        }
        return studentsMap;
    }

    public void printStudentMap(Map<Student, Integer> hashMap) {
        System.out.println("\nNumbers of occurrences of the same first and last names:");
        for (HashMap.Entry<Student, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey().toString() + " - " + entry.getValue());
        }
    }

    public Map<Faculty, Integer> getFacultiesMap(List<Student> students) {
        Map<Faculty, Integer> facultiesMap = new HashMap<>();
        for (Student s : students) {
            Integer studentsCountInFaculties = facultiesMap.get(s.getFacultyName());
            facultiesMap.put(s.getFacultyName(), (studentsCountInFaculties == null) ? 1 : studentsCountInFaculties + 1);
        }
        return facultiesMap;
    }

    public void printFacultiesMap(Map<Faculty, Integer> hashMap) {
        System.out.println("\nNumber of students in each faculty is:");
        for (HashMap.Entry<Faculty, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }


}
