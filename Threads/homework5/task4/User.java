package homework5.task4;

public class User implements Runnable {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public synchronized void makeRequest() {
        System.out.println(Thread.currentThread().getName() + " " + this.getName() + " is making request.");
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        synchronized (this) {
            try {
                makeRequest();
                wait(2000);
                notifyAll();
            } catch (InterruptedException e) {
            }
        }
    }
}

