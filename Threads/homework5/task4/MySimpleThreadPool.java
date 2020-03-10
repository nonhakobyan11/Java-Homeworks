package homework5.task4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MySimpleThreadPool {

    private List<WorkingThread> threads;
    private LinkedList<Runnable> usersList;
    private final int THREADS_MAX_QUANTITY = 3;

    public MySimpleThreadPool() {
        usersList = new LinkedList<>();
        threads = new ArrayList<>();
    }

    private void enqueue(Runnable r) {
        synchronized (usersList) {
            usersList.addLast(r);
            usersList.notifyAll();
        }
    }


    public void doTask(Runnable user) {
        if (threads.size() < THREADS_MAX_QUANTITY) {
            WorkingThread workingThread = new WorkingThread();
            threads.add(workingThread);
            workingThread.start();
        }
        enqueue(user);
    }


    private class WorkingThread extends Thread {

        public void run() {
            Runnable user;
            while (!usersList.isEmpty()) {
                synchronized (usersList) {
                    while (usersList.isEmpty()) {
                        try {
                            usersList.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    user = usersList.removeFirst();
                }
                try {
                    user.run();
                } catch (Exception e) {
                }
            }
        }
    }

}
