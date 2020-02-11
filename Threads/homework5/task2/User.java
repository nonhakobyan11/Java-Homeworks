package homework5.task2;

//public class User {
//    private String name;
//    private boolean b = false;
//
//    public User(String name) {
//        this.name = name;
//    }
//
//    public boolean isB() {
//        return b;
//    }
//
//    public void setB(boolean b) {
//        this.b = b;
//    }
//
//    public synchronized void printName() {
//        if (isB()) {
//            setB(true);
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        } else if (isB()){
//            notify();
//        }
//        System.out.println(Thread.currentThread().getName() + " " + getName());
//    }
//
//    public String getName() {
//        return name;
//    }
//}

public class User {

    public synchronized void print(String name){
        try {
            System.out.println(Thread.currentThread().getName() + " " + name);
            this.notify();
            this.wait();
        }catch (InterruptedException e){}
    }

}


