package homework3.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentService {
    private HashMap<Student, Integer> studentMap = new HashMap<>();

    public List<Student> initialize(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Diana", "Asatryan", 22, "098111111", "Math"));
        students.add(new Student("Diana", "Asatryan", 32, "097121411", "Physics"));
        students.add(new Student("Diana", "Asatryan", 21, "093811171", "Philosophy"));
        students.add(new Student("Karen", "Balayan", 18, "098111781", "Math"));
        students.add(new Student("Karen", "Balayan", 23, "098188751", "Philosophy"));
        students.add(new Student("Elen", "Mirzoyan", 28, "098145811", "English"));
        return students;
    }

    // key - student, value - countOfOccurrences
    public HashMap<Student, Integer> getStudentMap(List<Student> students) {
        for (Student s : students) {
            Integer countOfOccurrences = studentMap.get(s);
            studentMap.put(s, (countOfOccurrences == null) ? 1 : countOfOccurrences + 1);
        }
        return studentMap;
    }

    public void printStudentMap(HashMap<Student, Integer> hashMap) {
        System.out.println("\nNumbers of occurrences of the same first and last names:");
        for (HashMap.Entry<Student, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey().toString() + " " + entry.getValue());
        }
    }


}
