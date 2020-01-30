package homework2.collections;

import java.util.Comparator;

public class FirstNameAscendingComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getFirstName().compareTo(student2.getFirstName());
    }

}
