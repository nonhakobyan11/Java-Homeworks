package homework2.collections;

import java.util.Comparator;

public class AgeDescendingComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student2.getAge() - student1.getAge();
    }
}
