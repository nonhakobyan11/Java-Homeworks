package homework4.model;

import java.util.Objects;

/**
 * An OOP representation of coffee.
 * The class implement the Comparable interface, to make it eligible for adding to a MySortedSet
 * The class describes different preferences of coffee
 */

public class Coffee implements Comparable<Coffee>{
    private String coffeeType;
    private int sugarCubes;
    private boolean isHot;

    /**
     * Constructor of Coffee class
     * Receives objects and initializes all Coffee fields, based on the
     * information present in this object
     */
    public Coffee(String coffeeType, int sugarCubes, boolean isHot) {
        this.coffeeType = coffeeType;
        this.sugarCubes = sugarCubes;
        this.isHot = isHot;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public int getSugarCubes() {
        return sugarCubes;
    }

    public boolean isHot() {
        return isHot;
    }

    @Override
    public String toString() {
        return this.coffeeType + " coffee with " + this.sugarCubes  + " sugar cubes ";
    }

    /**
     * 2 coffees are considered equal if all their fields are the same, besides boolean isHot.
     * It is allowed to vary.
     * @param o the object, to which 'this' is compared
     * @return return true if the implicit and explicit parameters are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coffee coffee = (Coffee) o;
        return sugarCubes == coffee.sugarCubes &&
                Objects.equals(coffeeType, coffee.coffeeType);
    }

    /**
     * Coffee objects are  compared by their types, than sweetness
     * We consider that it doesn't matter coffee is hot or ice, it's still
     * coffee of the same type
     * @param coffee the Coffee object, with which 'this' is going to be compared
     * @return returns negative int, if this < coffee,
     *                 positive int, if this > coffee and
     *                 0, if they are equal
     */
    @Override
    public int compareTo(Coffee coffee) {
        String comparableCoffeeType = coffee.getCoffeeType();
        int comparableSugarCubes = coffee.getSugarCubes();
        return this.coffeeType.compareTo(comparableCoffeeType) == 0
                ? this.sugarCubes - comparableSugarCubes
                : this.coffeeType.compareTo(comparableCoffeeType);
    }
}

