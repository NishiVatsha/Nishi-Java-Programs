// 10. Synchronization using join()

class JoinExample extends Thread {   
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println(Thread.currentThread().getName() + " " + i);
    }
}

public class Synchronization {
    public static void main(String[] args) throws Exception {
        JoinExample t1 = new JoinExample();
        JoinExample t2 = new JoinExample();
        JoinExample t3 = new JoinExample();

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
    }
}