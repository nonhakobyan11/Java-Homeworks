package homework5.task3;

public class RunThreadsInOrder extends Thread {

    private static UserArray user;
    private int myThreadID;
    private static int autoIncrement = 1;
    private static int threadAllowedToRun = 1;

    public RunThreadsInOrder(UserArray user) {
        this.myThreadID = autoIncrement++;
        this.user = user;
    }

    @Override
    public void run() {
        synchronized (user) {
            controlThreadsOrder();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            user.print();
            user.notifyAll();
            threadAllowedToRun++;
        }
    }

    public void controlThreadsOrder(){
        while (myThreadID != threadAllowedToRun) {
            try {
                user.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (Exception e) {}
        }
    }
}