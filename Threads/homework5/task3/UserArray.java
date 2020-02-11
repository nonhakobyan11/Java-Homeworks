package homework5.task3;

public class UserArray {
    private String[] userNamesArray = new String[]{"Dina", "Vahe", "Grish", "Mery"};

    public synchronized void print() {
        for (String name : userNamesArray) {
            System.out.println(Thread.currentThread().getName() + " " + name);
        }
    }
}


