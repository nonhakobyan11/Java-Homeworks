package homework4.test;

import homework4.set.MySortedSet;
import homework4.model.Coffee;

public class CoffeeSetTest {
    public static void main(String[] args) {
        MySortedSet<Coffee> coffeeSet = new MySortedSet<>();
        Coffee c1 = new Coffee("Americano", 2, true);
        Coffee c2 = new Coffee("Espresso", 2, true);
        Coffee c3 = new Coffee("Espresso", 1, false);

        try {
            coffeeSet.add(c1);
            coffeeSet.add(c3);
            coffeeSet.add(c2);
            coffeeSet.print();
            System.out.println("Size of the set is: " + coffeeSet.getSize());
            System.out.println(coffeeSet.contains(c3));
            coffeeSet.remove(c3);
            coffeeSet.print();
            coffeeSet.add(c2);
        } catch (NullPointerException e) {
            System.out.println("Set doesn't allow nulls");
        }
    }
}
