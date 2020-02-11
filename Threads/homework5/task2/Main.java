package homework5.task2;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        ThreadTest t1 = new ThreadTest(user, "Armen");
        t1.setName("1.");
        ThreadTest t2 = new ThreadTest(user, "Vahe");
        t2.setName("2.");

        t1.start();
        t2.start();
    }
}
