package task3;

import task2.Person;
import java.util.function.Predicate;

public class PredicateImplementation {
    public static void main(String[] args) {
        // Creating predicate to test if Person is obligated for military service or not
        Predicate<Person> isDraftee = person -> person.getGender() == "M" && (person.getAge() >= 18 && person.getAge() <= 27);
        System.out.println(isDraftee.test(new Person("Arman", 19, "M")));
        System.out.println(isDraftee.test(new Person("Anahit", 25, "F")));
    }
}
