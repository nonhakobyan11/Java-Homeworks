package learning_annotation.annotation;

import learning_annotation.annotation.Bicycle;
import learning_annotation.annotation.Timer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Bicycle bicycle = new Bicycle();
        for (Method method : Bicycle.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Timer.class)) {
                long startTime = System.nanoTime();
                method.invoke(bicycle);
                long stopTime = System.nanoTime();
                long duration = stopTime - startTime;
                System.out.println("\n" + Bicycle.GREEN + method.getName() + "() method duration is "
                        + duration + " nanoseconds" + Bicycle.RESET + "\n");
            }
        }
    }
}
