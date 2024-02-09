package threads;
public class DeadlockExample {

    // Two locks for synchronization
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();
// where two threads,thread1 and thread2,attempt to acquire locks in opposite order
// Thread 1 acquires lock1 and then waits for lock2,
//while thread 2 acquires lock2 and then waits for lock1, resulting in a deadlock
//where both threads are stuck waiting for each other to release their respective locks.
    // Thread 1 acquires lock1 then tries to acquire lock2
    private static Thread thread1 = new Thread(() -> {
        synchronized (lock1) {
            System.out.println("Thread 1 acquired lock1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 waiting to acquire lock2");

            // Thread 1 is stuck here waiting for lock2
            synchronized (lock2) {
                System.out.println("Thread 1 acquired lock2");
            }
        }
    });

    // Thread 2 acquires lock2 then tries to acquire lock1
    private static Thread thread2 = new Thread(() -> {
        synchronized (lock2) {
            System.out.println("Thread 2 acquired lock2");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2 waiting to acquire lock1");

            // Thread 2 is stuck here waiting for lock1
            synchronized (lock1) {
                System.out.println("Thread 2 acquired lock1");
            }
        }
    });

    // Method to create a deadlock by starting both threads
    public static void createDeadlock() {
        thread1.start();
        thread2.start();
    }
}