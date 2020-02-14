package homework2.collections.util;

import homework2.collections.Student;

public class DynamicArray {
    private Student[] studentsArray;
    private int size;
    private int capacity;

    // constructor to create an array
    public DynamicArray() {
        studentsArray = new Student[2];
        size = 0;
        capacity = 2;
    }

    // appends the student to the end of the array
    public boolean add(Student element) {
        if (size == capacity) {
            ensureCapacity();
        }
        studentsArray[size] = element;
        size++;

        return true;
    }

    // removes the first occurrence of the specified student from the array
    public boolean remove(String firstName, String lastName) {
        boolean result = false;
        for (int index = 0; index < size; index++) {
            if (studentsArray[index].getFirstName().equals(firstName) && studentsArray[index].getLastName().equals(lastName)) {
                for (int i = index; i < size - 1; i++) {
                    studentsArray[i] = studentsArray[i + 1];
                }
                studentsArray[size - 1] = null;
                result = true;
                size--;
            }
        }
        return result;
    }

    public void ensureCapacity() {
        Student[] temp = new Student[capacity * 2];
        for (int i = 0; i < capacity; i++) {
            temp[i] = studentsArray[i];
        }
        studentsArray = temp;
        capacity = capacity * 2;
    }

    // returns the number of elements in the array
    public int size() {
        return size;
    }

    // returns the capacity of the array
    public int capacity() {
        return capacity;
    }

    // returns the student at the index, and null otherwise
    public Student getElement(int index) {
        if (index < size) {
            return studentsArray[index];
        } else {
            return null;
        }
    }

    // method to print elements in array
    public void printElements() {
        System.out.println("Here are the elements of the array:");
        for (int i = 0; i < size; i++)
            System.out.println(i + 1 + ") " + studentsArray[i]);
    }
}



