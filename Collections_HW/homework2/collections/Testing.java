package homework2.collections;

public class Testing {
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
    }
}
