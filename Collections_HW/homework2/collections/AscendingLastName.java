package homework2.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AscendingLastName {
    public static void main(String[] args) {
        List<Student> studentsLinkedList = new LinkedList<>();
        studentsLinkedList.add(new Student("Nare", "Vardanyan", 17));
        studentsLinkedList.add(new Student("Aram", "Sahakyan", 18));
        studentsLinkedList.add(new Student("Nune", "Harutyunyan", 20));

        System.out.println("Unsorted: ");
        for (int i = 0; i < studentsLinkedList.size(); i++)
            System.out.println(i + 1 + ") " + studentsLinkedList.get(i));

        System.out.println("\nSorted by last name in ascending order:");
        Collections.sort(studentsLinkedList);
        for (int i = 0; i < studentsLinkedList.size(); i++)
            System.out.println(i + 1 + ") " + studentsLinkedList.get(i));
    }
}

