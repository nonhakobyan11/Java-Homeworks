package homework5.task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Dina");
        User user2 = new User("Grish");
        User user3 = new User("Vahe");
        User user4 = new User("Armen");
        User user5 = new User("Anna");

        MySimpleThreadPool simpleThreadPool = new MySimpleThreadPool();

        List<User> users = new ArrayList<>() {
            {
                add(user1);
                add(user2);
                add(user3);
                add(user4);
                add(user5);
            }
        };

        for (User user : users) {
            simpleThreadPool.doTask(user);
        }
    }
}

