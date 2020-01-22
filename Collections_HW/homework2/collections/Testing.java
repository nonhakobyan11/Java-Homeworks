package homework2.collections;

import java.util.Iterator;

public class Testing {
    public static void printList(DoublyLinkedList list){
        System.out.println("\nHere are the elements of the list:");
        for(Student s : list){
            System.out.println(s);
        }
    }

    public static void main(String args[]) {
        System.out.println("\nTesting Dynamic Array implementation\n");
        DynamicArray myStudentsArray = new DynamicArray();
        myStudentsArray.add(new Student("Hayk", "Karapetyan", 22));
        myStudentsArray.add(new Student("David", "Karapetyan", 25));
        myStudentsArray.printElements();
        System.out.println("Now arrays size is: " + myStudentsArray.size());
        System.out.println("Now arrays capacity is: " + myStudentsArray.capacity());
        myStudentsArray.add(new Student("Mari", "Saryan", 24));
        myStudentsArray.add(new Student("Karine", "Vardanyan", 28));
        myStudentsArray.add(new Student("Tatev", "Sahakyan", 31));
        myStudentsArray.printElements();
        System.out.println("Now arrays size is: " + myStudentsArray.size());
        System.out.println("Now arrays capacity is: " + myStudentsArray.capacity());
        myStudentsArray.remove("Mari", "Saryan");
        myStudentsArray.printElements();
        System.out.println("Now arrays size is: " + myStudentsArray.size());
        System.out.println("Now arrays capacity is: " + myStudentsArray.capacity());
        System.out.println("\nYour given index's students info is: " + myStudentsArray.getElement(3));
        System.out.println("\nTesting Doubly Linked List implementation\n");
        DoublyLinkedList myStudentsList = new DoublyLinkedList();
        myStudentsList.addLast(new Student("Hayk", "Karapetyan", 22));
        myStudentsList.addLast(new Student("David", "Karapetyan", 25));
        printList(myStudentsList);
        myStudentsList.push(new Student("Karen", "Sahyan", 22));
        printList(myStudentsList);
        myStudentsList.pop();
        printList(myStudentsList);
        myStudentsList.removeLast();
        printList(myStudentsList);
        System.out.println("Now the size of list is: " + myStudentsList.size());
    }
}
