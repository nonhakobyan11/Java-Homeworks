package homework5.task2;

import java.lang.Thread;

public class FirstThreadTest extends Thread {

    private User user;
    private String userName;

    public FirstThreadTest(User user, String userName){
        this.user = user;
        this.userName = userName;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 50; i++) {
                user.print(userName);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getUserName() {
        return userName;
    }
}