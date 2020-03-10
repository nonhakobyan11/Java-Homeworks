package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerImplementation {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(1, -2, 3, -4, 5, 6, 7, -8, 9, 10));

        // Modifying list implementing Consumer Interface.
        // Every positive number in list becomes negative & vice versa
        Consumer<List<Integer>> modifyList = l -> {
            for (int i = 0; i < l.size(); i++)
                l.set(i, l.get(i) * -1);
        } ;

        Consumer<List<Integer>> printList = l -> l.stream().forEach(System.out::println);

        modifyList.accept(list);
        printList.accept(list);
    }
}
