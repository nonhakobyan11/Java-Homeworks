package homework4.test;

import homework4.set.MySortedSet;
import homework4.model.Student;

public class StudentSetTest {
    public static void main(String[] args) {
        MySortedSet<Student> studentSet = new MySortedSet<>();
        Student s1 = new Student("Amiryan", "Karine", 18, "Math");
        Student s2 = new Student("Sahakyan", "Varduhi", 20, "Physics");
        Student s3 = new Student("Sahakyan", "Varduhi", 19, "Physics");

        try {
            studentSet.add(s1);
            studentSet.add(s2);
            studentSet.add(null);
            studentSet.print();
            System.out.println("Size of the set is: " + studentSet.getSize() + "\n");
            System.out.println(studentSet.contains(s3));
            studentSet.remove(s2);
            studentSet.print();
            studentSet.add(s3);
            studentSet.print();
            studentSet.add(s1);
            studentSet.remove(s2);
            studentSet.print();
        } catch (NullPointerException e) {
            System.out.println("Set doesn't allow nulls");
        }

    }
}
