package homework2.collections;

import homework2.collections.comparator.AgeDescendingComparator;
import homework2.collections.comparator.FirstNameAscendingComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AscendingFirstNameAndDescendingAge {
    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Nare", "Vardanyan", 17));
        studentsList.add(new Student("Aram", "Sahakyan", 18));
        studentsList.add(new Student("Nune", "Harutyunyan", 20));

        System.out.println("Unsorted:");
        for (int i = 0; i < studentsList.size(); i++)
            System.out.println(i + 1 + ") " + studentsList.get(i));

        Collections.sort(studentsList, new FirstNameAscendingComparator());

        System.out.println("\nSorted by first name in ascending order:");
        for (int i = 0; i < studentsList.size(); i++)
            System.out.println(i + 1 + ") " + studentsList.get(i));

        Collections.sort(studentsList, new AgeDescendingComparator());

        System.out.println("\nSorted by age in descending order:");
        for (int i = 0; i < studentsList.size(); i++)
            System.out.println(i + 1 + ") " + studentsList.get(i));
    }
}



