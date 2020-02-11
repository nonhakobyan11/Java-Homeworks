package homework5.task3;

public class RunThreadsInOrder extends Thread {

    private static UserArray user;
    int myThreadID;
    static int threadAllowedToRun = 1;

    public RunThreadsInOrder(int myThreadID, UserArray user) {
        this.myThreadID = myThreadID;
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