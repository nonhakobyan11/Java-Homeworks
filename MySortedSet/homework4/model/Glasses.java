package homework4.model;

import java.util.Objects;

/**
 * An OOP representation of glasses.
 * The class implement the Comparable interface, to make it eligible for adding to a MySortedSet
 * The class describes different glasses
 */

public class Glasses  implements Comparable<Glasses> {
    private String glassesFrameType;
    private String color;
    private Boolean isOptical;

    /**
     * Constructor of Glasses class
     * Receives objects and initializes all Glasses fields, based on the
     * information present in this object
     */
    public Glasses(String glassesFrameType, String color, boolean isOptical) {
        this.glassesFrameType = glassesFrameType;
        this.color = color;
        this.isOptical = isOptical;
    }

    public String getGlassesFrameType() {
        return glassesFrameType;
    }

    public String getColor() {
        return color;
    }

    public boolean isOptical() {
        return isOptical;
    }

    @Override
    public String toString() {
        return  this.glassesFrameType + ", " + this.color + " glasses, optical/or not (true/false): " + this.isOptical;
    }

    /**
     * 2 glasses are considered equal if all their fields are the same.
     * @param o the object, to which 'this' is compared
     * @return return true if the implicit and explicit parameters are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Glasses glasses = (Glasses) o;
        return isOptical == glasses.isOptical &&
                Objects.equals(glassesFrameType, glasses.glassesFrameType) &&
                Objects.equals(color, glasses.color);
    }

    /**
     * Glasses objects are  compared by their frame types, than color,
     * than whether they are optical or not.
     * @param glasses the Glasses object, with which 'this' is going to be compared
     * @return returns negative int, if this < glasses,
     *                 positive int, if this > glasses and
     *                 0, if they are equal
     */
    @Override
    public int compareTo(Glasses glasses) {
        int temp = this.glassesFrameType.compareTo(glasses.getGlassesFrameType());
        if (temp == 0) {
            temp = this.color.compareTo(glasses.getColor());
            if (temp == 0) {
                temp = this.isOptical.compareTo(glasses.isOptical);
            }
        }
        return temp;
    }
}
