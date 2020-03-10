package homework5.task2;

public class User {

    public synchronized void print(String name){
        try {
            System.out.println(Thread.currentThread().getName() + " " + name);
            this.notify();
            this.wait();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


