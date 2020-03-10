package task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static List<Person> initialize(){
        List<Person> list = new ArrayList<>();
        list.add(new Person("Anna", 22, "F"));
        list.add(new Person("Arman", 15, "M"));
        list.add(new Person("Vardan", 20, "M"));
        list.add(new Person("Harut", 30, "M"));
        list.add(new Person("Anahit", 27, "F"));

        return list;
    }

    public static void main(String[] args){
        List<Person> listOfPersons = initialize();

        Comparator<Person> nameDescendingComparator = (p1, p2) -> p1.getName().compareTo(p2.getName());
        System.out.println("\nSorted by name in ascending order:" );
        listOfPersons.stream().sorted(nameDescendingComparator).forEach(System.out::println);

        Comparator<Person> ageAscendingComparator = (p1, p2) -> p2.getAge() - p1.getAge();
        System.out.println("\nSorted by age in descending order:" );
        listOfPersons.stream().sorted(ageAscendingComparator).forEach(System.out::println);
    }
}
