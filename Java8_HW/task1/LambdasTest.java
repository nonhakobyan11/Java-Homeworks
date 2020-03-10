package task1;

public class LambdasTest {
    public static void main(String[] args) {
        // First lambda expression prints the name of the working thread
        Runnable r1 = () -> System.out.println("\n\nNow" + Thread.currentThread().getName() + "thread is working.");

        // Second lambda expression prints the sum of numbers between 1 and 10
        Runnable r2 = () -> {
            int sum = 0;
            for(int i = 1; i <= 10; i++) {
                sum += i;
            }
            System.out.print("\nSum of numbers between 1 and 10 is: " + sum);
        };

        // Third lambda expression prints all days in week
        Runnable r3 = () -> {
            String[] daysOfWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            System.out.println("\nDays of week are:");
            for(String s : daysOfWeek){
                System.out.println(s);
            }
        };

        // Creating and starting threads
        Thread t1 = new Thread(r1);
        t1.setName(" 'My first Lambda expression' ");
        t1.start();

        Thread t2 = new Thread(r2);
        t2.start();

        Thread t3 = new Thread(r3);
        t3.start();
    }
}
