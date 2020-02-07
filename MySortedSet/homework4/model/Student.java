package homework4.model;

import java.util.Objects;

/**
 * An OOP representation of student.
 * The class implement the Comparable interface, to make it eligible for adding to a MySortedSet
 * The class stores info about student's first name, last name, age and faculty, to which they belongs.
 */

public class Student implements Comparable<Student> {
    private String lastName;
    private String firstName;
    private int age;
    private String facultyName;

    /**
     * Constructor of Student class
     * Receives objects and initializes all Student fields, based on the
     * information present in this object
     */
    public Student(String lastName, String firstName, int age, String facultyName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.facultyName = facultyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getFacultyName() {
        return facultyName;
    }

    @Override
    public String toString() {
        return this.lastName + " " + this.firstName + " " + this.age + " " + this.facultyName;
    }

    /**
     * 2 students are considered equal if all their fields are the same.
     * @param o the object, to which 'this' is compared
     * @return return true if the implicit and explicit parameters are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(facultyName, student.facultyName);
    }

    /**
     * Student objects are compared by their first name, than last name,
     * than age, than faculty.
     * @param student Student object, with which 'this' is going to be compared
     * @return returns negative int, if this < student,
     *                 positive int, if this > student and
     *                 0, if they are equal
     */
    @Override
    public int compareTo(Student student) {
        int temp = this.firstName.compareTo(student.getFirstName());
        if (temp == 0) {
            temp = this.lastName.compareTo(student.getLastName());
            if (temp == 0) {
                temp = this.age - student.getAge();
                if (temp == 0) {
                    temp = this.facultyName.compareTo(student.getFacultyName());
                }
            }
        }
        return temp;
    }
}

