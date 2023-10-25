package week2day2.P2SynchronizationCounter;

import java.util.concurrent.atomic.AtomicInteger;

public class SyncCounter {
    static AtomicInteger counter = new AtomicInteger(0);
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                counter.incrementAndGet();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < 100; i++) {
                counter.decrementAndGet();
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter);
    }
}
