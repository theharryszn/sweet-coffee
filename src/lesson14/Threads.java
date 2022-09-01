package lesson14;

public class Threads {
    public static void main(String[] args) {
        Async async = new Async();
        async.start();

        Thread thread = new Thread(new Async2());
        thread.start();

        while (async.isAlive()) {
            System.out.println("Waiting...");
        }
        System.out.println("Hello World");
    }
}

class Async extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName("Async");
        System.out.println(Thread.currentThread().getName());
        System.out.println("This is running in Async thread");
    }
}

class Async2 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("This is running in Async2 thread");
    }
}