package homework5.task3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        UserArray user = new UserArray();
        RunThreadsInOrder t1 = new RunThreadsInOrder(user);
        t1.setName("1.");
        RunThreadsInOrder t2 = new RunThreadsInOrder(user);
        t2.setName("2.");
        RunThreadsInOrder t3 = new RunThreadsInOrder(user);
        t3.setName("3.");

        t1.start();
        t2.start();
        t3.start();

    }
}
