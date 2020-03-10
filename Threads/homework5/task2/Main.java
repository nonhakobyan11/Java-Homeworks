package homework5.task2;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        FirstThreadTest t1 = new FirstThreadTest(user, "Armen");
        t1.setName("1.");
        FirstThreadTest t2 = new FirstThreadTest(user, "Vahe");
        t2.setName("2.");

        t1.start();
        t2.start();
    }
}
