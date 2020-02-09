package homework4.test;

import homework4.model.Glasses;
import homework4.set.MySortedSet;

public class GlassesSetTest {
    public static void main(String[] args) {
        MySortedSet<Glasses> glassesSet = new MySortedSet<>();
        Glasses g1 = new Glasses("Full Frame", "black", true);
        Glasses g2 = new Glasses("Semi-full Frame", "red", false);
        Glasses g3 = new Glasses("Full Frame", "black", false);

        try {
            glassesSet.add(g1);
            glassesSet.add(g2);
            glassesSet.add(g3);
            glassesSet.print();
            System.out.println("Size of the set is: " + glassesSet.getSize());
            System.out.println(glassesSet.contains(g3));
            glassesSet.remove(g3);
            glassesSet.print();
            glassesSet.add(g2);
        } catch (NullPointerException e) {
            System.out.println("Set doesn't allow nulls");
        }
    }
}
