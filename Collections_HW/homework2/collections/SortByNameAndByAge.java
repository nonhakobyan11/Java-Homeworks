package homework2.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// This class sorts by First Name in ascending order
class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getFirstName().compareTo(student2.getFirstName());
    }
}

// This class sorts by Age in descending order
class SortByAge implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student2.getAge() - student1.getAge();
    }
}

public class SortByNameAndByAge {
    public static void main(String[] args) {
        ArrayList<Student> studentsList = new ArrayList<Student>();
        studentsList.add(new Student("Nare", "Vardanyan", 17));
        studentsList.add(new Student("Aram", "Sahakyan", 18));
        studentsList.add(new Student("Nune", "Harutyunyan", 20));

        System.out.println("Unsorted:");
        for (int i = 0; i < studentsList.size(); i++)
            System.out.println(i + 1 + ") " + studentsList.get(i));

        Collections.sort(studentsList, new SortByName());

        System.out.println("\nSorted by name in ascending order:");
        for (int i = 0; i < studentsList.size(); i++)
            System.out.println(i + 1 + ") " + studentsList.get(i));

        Collections.sort(studentsList, new SortByAge());

        System.out.println("\nSorted by age in descending order:");
        for (int i = 0; i < studentsList.size(); i++)
            System.out.println(i + 1 + ") " + studentsList.get(i));
    }
}



