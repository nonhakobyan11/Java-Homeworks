package homework3.task1;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;
    private String facultyName;

    public Student(String firstName, String lastName, int age, String phoneNumber, String facultyName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.facultyName = facultyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFacultyName() {
        return facultyName;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " -";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return  Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
