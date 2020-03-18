package annotation;

import java.util.Random;

public class Bicycle {
    private String type;
    private String color;
    private boolean hasBreak;
    private int speed = 0;
    private static final int MAX_SPEED = 70;
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";

    public Bicycle() {
        type = "Touring bicycle";
        color = "Blue";
        hasBreak = true;
        System.out.println("Created new bike. It's type is: " + type);
    }

    @Timer
    public void start() {
        System.out.println("Starting with speed: " + speed);
        while (speed < 70) {
            accelerate();
        }
        System.out.println(RED + "\nMaximum speed is reached!!!" + RESET);

    }

    public void accelerate() {
        if (speed < MAX_SPEED) {
            if (speed > 40) {
                speed += 1;
            } else if (speed > 30) {
                speed += 2;
            } else if (speed > 20) {
                speed += 3;
            } else if (speed > 10) {
                speed += 4;
            } else {
                speed += 5;
            }
        }
        System.out.println("Accelerate to: " + speed);
    }

    @Timer
    public void stop() {
        while (speed > 0) {
            pressBreak();
        }
        System.out.println(RED + "Bicycle stopped" + RESET);
    }

    public void pressBreak() {
        if (hasBreak) {
            if (speed > 40) {
                speed -= 5;
            } else if (speed > 30) {
                speed -= 4;
            } else if (speed > 20) {
                speed -= 3;
            } else if (speed > 10) {
                speed -= 2;
            } else {
                speed--;
            }
        }
        System.out.println("Speed breaked to: " + speed);
    }


}
