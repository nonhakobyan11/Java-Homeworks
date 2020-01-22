package homework2.collections;

public class DisplayStudentFullName {
    DynamicArray studentsArray = new DynamicArray();
    DoublyLinkedList studentsList = new DoublyLinkedList();

    public void initialize() {
        Student s1 = new Student("Mari", "Saryan", 24);
        Student s2 = new Student("Karine", "Vardanyan", 28);
        Student s3 = new Student("Tatev", "Sahakyan", 31);
        Student s4 = new Student("Hayk", "Vardanyan", 30);

        studentsArray.add(s1);
        studentsArray.add(s2);
        studentsArray.add(s3);
        studentsArray.add(s4);

        studentsList.addLast(s1);
        studentsList.addLast(s2);
        studentsList.addLast(s3);
        studentsList.addLast(s4);
    }

    public void printStudentFullNames() {
        printFromDynamicArray();
        printFromDoublyLinkedList();
    }

    private void printFromDynamicArray() {
        System.out.println("\nStudent's full names in Dynamic Array:");
        Student s;
        for (int i = 0; i < studentsArray.size(); i++) {
            s = studentsArray.getElement(i);
            System.out.println(s.getFirstName() + " " + s.getLastName());
        }
    }

    private void printFromDoublyLinkedList() {
        System.out.println("\nStudent's full names in Doubly Linked List:");
        for (Student s : studentsList) {
            System.out.println(s.getFirstName() + " " + s.getLastName());
        }
    }

    public static void main(String[] args) {
        DisplayStudentFullName display = new DisplayStudentFullName();
        display.initialize();
        display.printStudentFullNames();
    }
}



